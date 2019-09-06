package com.springbootadmin.entity;/**
 * @author yonrun
 * @Title: User
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/6 18:29
 */

import lombok.Data;

/**
 * @author
 * @description
 * @date 2019/9/6
 */
@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String role;
}
