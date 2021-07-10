package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-06 14:48
 */
public interface BlogMapper {

    int addData(Blog blog);

    List<Blog> getDataIf(Map map);

    List<Blog> getDataChoose(Map map);

    int updateData(Map map);

}
