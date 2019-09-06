package com.springbootadmin.configuration;/**
 * @author yonrun
 * @Title: SpringMvcConfiguration
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/2 17:11
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author
 * @description
 * @date 2019/9/2
 */
@Configuration
public class SpringMvcConfiguration  extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailsService myUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()                      //定义当需要用户登录时候，转到的登录页面。
                .and()
                .authorizeRequests()         // 定义哪些URL需要被保护、哪些不需要被保护
                .anyRequest()                // 任何请求,登录后可以访问
                .authenticated();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    // 重写方法，自定义用户
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService); // 注入MyUserService，这样SpringSecurity会调用里面的loadUserByUsername(String s)
    }
}