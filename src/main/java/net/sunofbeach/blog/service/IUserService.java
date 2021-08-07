package net.sunofbeach.blog.service;

import net.sunofbeach.blog.pojo.SobUser;
import net.sunofbeach.blog.response.ResponseResult;

import javax.servlet.http.HttpServletRequest;

public interface IUserService {

    ResponseResult initManagerAccount(SobUser sobUser, HttpServletRequest request);

}
