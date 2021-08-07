package net.sunofbeach.blog.controller.user;

import lombok.extern.slf4j.Slf4j;
import net.sunofbeach.blog.pojo.SobUser;
import net.sunofbeach.blog.response.ResponseResult;
import net.sunofbeach.blog.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequestMapping( "/user")
public class UserApi {

    @Autowired
    private IUserService userService;

    /**
     * 初始化管理员账号 -init-admin
     *
     * @return
     */
    @PostMapping("/admin_account")
    public ResponseResult initManagerAccount(@RequestBody SobUser sobUser, HttpServletRequest request){
        log.info("username == >" + sobUser.getUserName());
        log.info("password == >" + sobUser.getPassword());
        log.info("email == >" + sobUser.getEmail());
        return userService.initManagerAccount(sobUser,request);
    }

    /**
     * 注册
     *
     * @param sobUser
     * @return
     */
    @PostMapping
    public ResponseResult register(@RequestBody SobUser sobUser){
        return null;
    }

    /**
     * 登录 sign-up
     * captcha 是图灵验证码  分辨你是人还是机器
     * @param captcha
     * @param sobUser
     * @return
     */
    @PostMapping("/{captcha}")
    public ResponseResult login(@PathVariable("captcha") String captcha,@RequestBody SobUser sobUser){
        return null;
    }

    /**
     * 获取图灵验证码
     * @return
     */
    @GetMapping("/captcha")
    public ResponseResult getCaptcha(){
        return null;
    }

    /**
     * 发送邮件email
     *
     * @return
     */
    @GetMapping("/verify_code")
    public ResponseResult sendVerifyCode(@RequestParam("email") String emailAddress){
        log.info("email==>" + emailAddress);
        return null;
    }

    /**
     * 修改密码password
     * @return
     */
    @PutMapping("/password/{userId}")
    public ResponseResult updatePassword(@PathVariable("userId") String userId,@RequestBody SobUser sobUser){
        return null;
    }

    /**
     * 获取作者信息user-info
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public ResponseResult getUserInfo(@PathVariable("userId") String userId){
        return null;
    }

    /**
     * 修改用户信息 user-info
     *
     * @return
     */
    @PutMapping("/{userId}")
    public ResponseResult updateUserInfo(@PathVariable("userId")String user, @RequestBody SobUser sobUser){
        return null;
    }

    @GetMapping("/list")
    public ResponseResult listUsers(@RequestParam("page") int page,@RequestParam("size") int size){
        return null;
    }

    @DeleteMapping("/{userId}")
    public ResponseResult deleteUser(@PathVariable("userId") String userId){
        return null;
    }
}
