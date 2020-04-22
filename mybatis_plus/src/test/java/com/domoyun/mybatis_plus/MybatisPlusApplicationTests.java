package com.domoyun.mybatis_plus;

import com.domoyun.mybatis_plus.entity.User;
import com.domoyun.mybatis_plus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
class MybatisPlusApplicationTests {

    /*注意：
        IDEA在 userMapper 处报错，因为找不到注入的对象，因为类是动态创建的，但是程序可以正确的执行。
        为了避免报错，可以在 dao 层 的接口上添加 @Repository 注*/
    @Autowired
    UserMapper userMapper;

    @Test
    public void testSelectList(){
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //所以不填写就是无任何条件
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    //插入操作
        /*
    2、主键策略
        （1）ID_WORKER
        MyBatis-Plus默认的主键策略是：ID_WORKER  全局唯一ID
     */
    @Test
    public void testInsert(){
        User user = new User();
//        user.setId(6L);
        user.setName("pangluo1");
        user.setAge(25);
        user.setEmail("845597315@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert); //影响的行数
        System.out.println(user);//id自动回填
    }

    @Test
    public void testUpdateById(){

        User user = new User();
        user.setId(1L);
        user.setAge(25);

        int result = userMapper.updateById(user);
        System.out.println(result);

    }

}
