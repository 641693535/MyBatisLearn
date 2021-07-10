package com.dao;

import com.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-05 16:50
 */
public interface UserDao {

    List<User> selsectData();

    List<User> selectLimit(Map<String, Integer> map);

}
