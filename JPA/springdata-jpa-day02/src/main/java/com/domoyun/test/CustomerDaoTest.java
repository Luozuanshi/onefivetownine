package com.domoyun.test;


import com.domoyun.dao.CustomerDao;
import com.domoyun.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
}

