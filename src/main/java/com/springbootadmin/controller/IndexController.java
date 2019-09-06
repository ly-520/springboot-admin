package com.springbootadmin.controller;/**
 * @author yonrun
 * @Title: controller
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/2 15:56
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author
 * @description
 * @date 2019/9/2
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String indexpage(){
        return "index";
    }

    @RequestMapping("/firstpage")
    public String firstpage(){
        System.out.println("=================================");
        return "index_first";
    }


    @RequestMapping("/test_page")
    public String test_page(){
        System.out.println("test_page==============================");
        return "index_v1";
    }
}
