package com.mapper;

import com.pojo.Teacher;
import com.pojo.User;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-06 11:14
 */
public class TestMapper {

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.getAllData();
        for (User user : users) {
            System.out.println(user);
        }

        sqlSession.close();

    }
//    @Test
//    public void test2(){
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        TeacherMapper teacherMapper = sqlSession.getMapper(TeacherMapper.class);
//
//        Teacher teacher = teacherMapper.getTeacher(1);
//        System.out.println(teacher);
//
//        sqlSession.close();
//    }

}
