package com.dao;

import com.pojo.User;
import com.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-04 18:48
 */
public class UserMapperTest {

    /**
     * 查询所有数据
     */
    @Test
    public void test1(){
        //获取SqlSession实例
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //方式一：通过getMapper来实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        //方式二：旧的实现方法，不推荐
//        List<User> userList = sqlSession.selectList("com.dao.UserMapper.getUserList");

        for (User user : userList) {
            System.out.println(user);
        }

        //关闭SqlSession通道
        sqlSession.close();
    }

    /**
     * 查询指定一条数据
     */
    @Test
    public void testGetUserById(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(3);
        System.out.println(userById);

        sqlSession.close();
    }

    /**
     * 插入一条数据
     */
    @Test
    public void testInsertData(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User newUser = new User(5, "王力宏", "1948651");
        int i = mapper.insertData(newUser);

        //增删改需要提交事务！！！
        sqlSession.commit();
        //关闭sqlsession通道
        sqlSession.close();
    }

    /**
     * 修改一条数据
     */
    @Test
    public void testUpdateData() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User newUser = new User(5, "王力宏", "1948651");

        int i = mapper.updateData(newUser);

        //增删改需要提交事务！！！
        sqlSession.commit();
        //关闭sqlsession通道
        sqlSession.close();
    }

    /**
     * 删除一个用户
     */
    @Test
    public void testDeleteData(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int i = userMapper.deleteData(5);

        //增删改需要提交事务！！！
        sqlSession.commit();
        //关闭sqlsession通道
        sqlSession.close();

    }


}
