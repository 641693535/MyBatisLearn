package com.dao;

import com.pojo.User;
import com.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-05 16:53
 */
public class UserTest {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);

        List<User> users = userDao.selsectData();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();

    }

    @Test
    public void test2(){
        //测试Limit分页查询
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserDao userDao = sqlSession.getMapper(UserDao.class);
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("startIndex", 0);
        hashMap.put("endIndex", 2);
        List<User> users = userDao.selectLimit(hashMap);
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
