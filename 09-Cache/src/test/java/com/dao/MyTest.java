package com.dao;

import com.pojo.Blog;
import com.utils.IDUtil;
import com.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-06 15:18
 */
public class MyTest {

    /*
    查询同一数据的缓存情况
     */
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog java = mapper.getData("Java");
        System.out.println(java);
        System.out.println("===========第二次获取============");
        Blog java1 = mapper.getData("Java");
        System.out.println(java1);

        sqlSession.close();
    }

    /**
     * 查询不同数据的缓存情况
     */
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        System.out.println("===========第一次获取============");
        Blog java = mapper.getData("Java");
        System.out.println(java);
        System.out.println("===========第二次获取：不同数据============");
        Blog java1 = mapper.getData("Mybatis");
        System.out.println(java1);
        sqlSession.clearCache();//手动清理缓存
        System.out.println("===========第三次获取：第一次的数据============");
        Blog java2 = mapper.getData("Java");
        System.out.println(java2);

        sqlSession.close();
    }

}
