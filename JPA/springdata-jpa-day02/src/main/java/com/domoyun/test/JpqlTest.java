package com.domoyun.test;

import com.domoyun.dao.CustomerDao;
import com.domoyun.domain.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class JpqlTest {
    @Autowired
    CustomerDao customerDao;
    //根据字段查询
    @Test
    public void findByCustNameJPQL(){
        List<Customer> customer = customerDao.findByCustNameJPQL("domo5");
        for (Customer cst : customer) {
            System.out.println(cst);
        }
    }
    //多条件查询
    @Test
    public void findByCustNameAndCustIdJPQL(){
        List<Customer> customers = customerDao.findByCustNameAndCustIdJPQL(5l,"domo1");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    /**
     * 测试jpql的更新操作
     *  * springDataJpa中使用jpql完成 更新/删除操作
     *         * 需要手动添加事务的支持
     *         * 默认会执行结束之后，回滚事务
     *   @Rollback : 设置是否自动回滚
     *          false | true
     */
    @Test
    @Transactional
    @Rollback(value = false)
    public void updateCustNameById(){
        customerDao.updateCustNameById(5l,"pangluo");
    }

    //测试sql查询
    @Test
    public void findALLSQL(){
        List<Customer> allcustomer = customerDao.findALLSQL("domo%");
        for (Customer customer : allcustomer) {
            System.out.println(customer);
        }
    }


    //测试方法命名规则的查询
    @Test
    public void testNaming() {
        List<Customer> customers = customerDao.findByCustName("domo5");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }


    //测试方法命名规则的查询
    @Test
    public void testFindByCustNameLike() {
        List<Customer> list = customerDao.findByCustNameLike("domo%");
        for (Customer customer : list) {
            System.out.println(customer);
        }
    }


    //测试方法命名规则的查询
    @Test
    public void testFindByCustNameLikeAndCustIndustry() {
        Customer customer = customerDao.findByCustNameLikeAndCustIndustry("domo5%", "asd123");
        System.out.println(customer);
    }

}
