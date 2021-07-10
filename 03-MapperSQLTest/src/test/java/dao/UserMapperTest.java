package dao;

import com.dao.UserMapper;
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
     * 查询指定一条数据
     */
    @Test
    public void testGetUserById(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User userById = mapper.getUserById(2);
        System.out.println(userById);

        sqlSession.close();
    }


}
