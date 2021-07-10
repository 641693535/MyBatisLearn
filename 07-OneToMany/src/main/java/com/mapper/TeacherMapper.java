package com.mapper;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-06 11:12
 */
public interface TeacherMapper {

    List<Teacher> getAllData();

    Teacher getTeacher(@Param("id") int id);

}
