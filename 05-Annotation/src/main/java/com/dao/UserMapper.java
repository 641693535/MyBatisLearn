package com.dao;

import com.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-07-05 22:53
 */
public interface UserMapper {

    /**
     * 通过注解方式实现，已在config核心配置文件中注册此接口类
     * @return
     */
    @Select("select * from user")
    List<User> selectData();

    //当方法有多个基本类型形参时，一定要加上@param来表示名字
    @Select("select * from user where id=#{uid}")
    User selectUser(@Param("uid") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{username},#{password})")
    int insertData(User user);

    @Update("update name=#{username},pwd=#{password} where id=#{id}")
    int updateData(User user);

    @Delete("delete from user where id=#{uid}")
    int deleteData(@Param("uid") int id);

}
