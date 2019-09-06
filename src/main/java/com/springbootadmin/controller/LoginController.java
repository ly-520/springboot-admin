package com.springbootadmin.controller;/**
 * @author yonrun
 * @Title: LoginController
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/6 17:26
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author
 * @description
 * @date 2019/9/6
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String Loginpage(){
        System.out.println("跳转到登陆界面");
        return "login";
    }
}
