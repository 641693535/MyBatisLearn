package com.dao;

import com.pojo.User;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 18:35
 */
public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int insertData(User user);

    int updateData(User user);

    int deleteData(int id);

}
