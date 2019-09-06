package com.springbootadmin.configuration;/**
 * @author yonrun
 * @Title: MyUserDetailsService
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/6 17:33
 */

import com.springbootadmin.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;


/**
 * @author
 * @description
 * @date 2019/9/6
 */
@Component
public class MyUserDetailsService implements UserDetailsService {

    private Logger logger= LoggerFactory.getLogger(getClass());

    @Autowired
    UserService  userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        logger.info("用户名：{},密码：{}",username);
        // TODO 根据用户名，查找到对应的密码，与权限

        com.springbootadmin.entity.User user=userService.selectUserByUsername(username);
        // 封装用户信息，并返回。参数分别是：用户名，密码，用户权限
     //   User user =new User(username,"123456", AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));

        return new User(username,new BCryptPasswordEncoder().encode("123456"),AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_ADMIN,ROLE_USER"));
    }
}
