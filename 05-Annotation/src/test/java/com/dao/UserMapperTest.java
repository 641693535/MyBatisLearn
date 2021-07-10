package com.dao;

import com.pojo.User;
import com.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-05 22:59
 */
public class UserMapperTest {

    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

//        List<User> users = userMapper.selectData();
//        for (User user : users) {
//            System.out.println(user);
//        }

//        User user = userMapper.selectUser(2);
//        System.out.println(user);

        User tom = new User(5, "汤姆", "888999");
        userMapper.insertData(tom);

//        userMapper.deleteData(5);

        sqlSession.close();
    }

}
