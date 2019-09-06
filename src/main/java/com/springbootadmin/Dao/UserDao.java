package com.springbootadmin.Dao;/**
 * @author yonrun
 * @Title: UserDao
 * @ProjectName springboot-admin
 * @Description: TODO
 * @date 2019/9/6 18:33
 */

import com.springbootadmin.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author
 * @description
 * @date 2019/9/6
 */
@Repository
public interface UserDao {

    User selectUserByUsername(@Param("username") String username);
}
