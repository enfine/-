package net.sunofbeach.blog.service.impl;


import lombok.extern.slf4j.Slf4j;
import net.sunofbeach.blog.dao.SettingsDao;
import net.sunofbeach.blog.dao.UserDao;
import net.sunofbeach.blog.pojo.Setting;
import net.sunofbeach.blog.pojo.SobUser;
import net.sunofbeach.blog.response.ResponseResult;
import net.sunofbeach.blog.service.IUserService;
import net.sunofbeach.blog.utii.Constants;
import net.sunofbeach.blog.utii.IdWorker;
import net.sunofbeach.blog.utii.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.Date;


@Slf4j
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private UserDao userDao;

    @Autowired
    private SettingsDao settingsDao;

    @Override
    public ResponseResult initManagerAccount(SobUser sobUser, HttpServletRequest request) {
        //检查是否有初始化
        Setting managerAccountState =settingsDao.findOneByKey(Constants.Settings.HAS_MANAGER_ACCOUNT_INIT_STATE);
        if (managerAccountState != null) {
            return ResponseResult.FAILED("管理员账号已经初始化");
        }
        //检查数据
        if(TextUtils.isEmpty(sobUser.getUserName())){
            return ResponseResult.FAILED("用户名不能为空");
        }

        if(TextUtils.isEmpty(sobUser.getPassword())){
            return ResponseResult.FAILED("密码不能为空");
        }
        if(TextUtils.isEmpty(sobUser.getEmail())){
            return ResponseResult.FAILED("邮箱不能为空");
        }
        //补充数据
        sobUser.setId(String.valueOf(idWorker.nextId()));
        sobUser.setRoles(Constants.User.ROLE_ADMIN);
        sobUser.setAvatar(Constants.User.DEFAULT_AVATAR);
        sobUser.setState(Constants.User.DEFAULT_STATE);
        //remoteAddr 客户顿的IP地址
        String remoteAddr = request.getRemoteAddr();
        //本地地址
        String localAddr = request.getLocalAddr();
        log.info("remoteAddr == >" + remoteAddr);
        log.info("localAddr == >" + localAddr);
        sobUser.setLoginIp(remoteAddr);
        sobUser.setRegIP(remoteAddr);
        //可能会有问题
        sobUser.setCreateTime(new Date());
        sobUser.setUpdateTime(new Date());
        //对密码进行加密
        //原密码
        String password = sobUser.getPassword();
        //加密码
        String encode = bCryptPasswordEncoder.encode(password);
        sobUser.setPassword(encode);
        //保存到数据库里
        userDao.save(sobUser);
        //更新已经添加的标记
        //肯定滑的
        Setting setting = new Setting();
        setting.setId(idWorker.nextId()+"");
        setting.setKey(Constants.Settings.HAS_MANAGER_ACCOUNT_INIT_STATE);
        setting.setCreate_time(new Date());
        setting.setUpdate_time(new Date());
        setting.setValue("1");
        settingsDao.save(setting);
        return ResponseResult.SUCCESS("初始化成功");
    }

    public SettingsDao getSettingsDao() {
        return settingsDao;
    }

    public void setSettingsDao(SettingsDao settingsDao) {
        this.settingsDao = settingsDao;
    }
}
