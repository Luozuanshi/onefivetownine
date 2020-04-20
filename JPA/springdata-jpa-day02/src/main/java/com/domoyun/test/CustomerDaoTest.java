package com.domoyun.test;


import com.domoyun.dao.CustomerDao;
import com.domoyun.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 使用spring data JPA接口提供的方法查询
 */
@RunWith(SpringJUnit4ClassRunner.class) //声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring容器的配置信息
public class CustomerDaoTest {

    @Autowired
    CustomerDao customerDao;

    //根据id查询
    @Test
    public void findOne(){
        Customer customer = customerDao.findOne(7L);
        System.out.println(customer);
    }

    /**
     * save : 保存或者更新
     *      根据传递的对象是否存在主键id，
     *      如果没有id主键属性：保存
     *      存在id主键属性，根据id查询数据，更新数据
     */
    @Test
    public void save(){
      Customer customer = new Customer();
      customer.setCustAddress("hn");
      customer.setCustIndustry("it");
      customer.setCustPhone("s00s");
      customer.setCustLevel("xx");
      customer.setCustName("domoyun.com");
      customer.setCustSource("kf");
      customerDao.save(customer);
    }

    //修改
    @Test
    public void update(){
    customerDao.save(new Customer(8l,"ds","s","sx","f","ff","as"));
    }
    //删除
    @Test
    public void delete(){
        customerDao.delete(10L);
    }

    //     * 查询所有
    @Test
    public void findAll(){
        List<Customer> list = customerDao.findAll();
        for (Customer customer:list) {
            System.out.println(customer);
        }
    }

    /**
     * 测试统计查询：查询客户的总数量
     *      count:统计总条数
     */
    @Test
    public void count(){
        long count = customerDao.count();
        System.out.println(count);
    }

    /**
     * 测试：判断id为4的客户是否存在
     *      1. 可以查询以下id为4的客户
     *          如果值为空，代表不存在，如果不为空，代表存在
     *      2. 判断数据库中id为4的客户的数量
     *          如果数量为0，代表不存在，如果大于0，代表存在
     */
    @Test
    public void exists(){
        boolean exists = customerDao.exists(10l);
        System.out.println(exists);
    }

    /**
     * 根据id从数据库查询
     *      @Transactional : 保证getOne正常运行
     *
     *  findOne：
     *      em.find()           :立即加载
     *  getOne：
     *      em.getReference     :延迟加载
     *      * 返回的是一个客户的动态代理对象
     *      * 什么时候用，什么时候查询
     */
    @Test
    @Transactional
    public void getOne(){
        Customer one = customerDao.getOne(8l);
        System.out.println(one);
    }



}


