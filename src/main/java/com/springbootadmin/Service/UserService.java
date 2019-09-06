package com.springbootadmin.Service;/**
 * @author yonrun
 * @Title: UserService
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/6 18:31
 */

import com.springbootadmin.Dao.UserDao;
import com.springbootadmin.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author
 * @description
 * @date 2019/9/6
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;
    public User selectUserByUsername(String username){
        return userDao.selectUserByUsername(username);
    }
}
