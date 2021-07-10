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

    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", "Java");
        hashMap.put("id", "b629ce2969a94398b97d5d9d5daf18");
//        hashMap.put("author", "狂神说");
//        List<Blog> dataIf = mapper.getDataIf(hashMap);
//        for (Blog datum : dataIf) {
//            System.out.println(datum);
//        }
        mapper.updateData(hashMap);
        sqlSession.close();
    }

    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDUtil.getId());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addData(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Java");
        mapper.addData(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("Spring");
        mapper.addData(blog);

        blog.setId(IDUtil.getId());
        blog.setTitle("微服务");
        mapper.addData(blog);

        sqlSession.close();
    }
}
