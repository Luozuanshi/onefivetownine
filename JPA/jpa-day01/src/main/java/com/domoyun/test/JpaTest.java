package com.domoyun.test;

import com.domoyun.domain.Customer;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTest {

    /**
     * 测试jpa的保存
     *      案例：保存一个客户到数据库中
     *  Jpa的操作步骤
     *     1.加载配置文件创建工厂（实体管理器工厂）对象
     *     2.通过实体管理器工厂获取实体管理器
     *     3.获取事务对象，开启事务
     *     4.完成增删改查操作
     *     5.提交事务（回滚事务）
     *     6.释放资源
     */
    @Test
    public void save(){
//        1.加载配置文件创建工厂（实体管理器工厂）对象
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myJpa");
//        2.通过实体管理器工厂获取实体管理器
        EntityManager em = emfactory.createEntityManager();
//        3.获取事务对象，开启事务
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
//        4.完成增删改查操作
        Customer customer = new Customer();

        customer.setCustName("domo");
        customer.setCustAddress("domoyun.com");
        em.persist(customer);//持久化
//        5.提交事务（回滚事务）
        transaction.commit();
//        6.释放资源
        em.close();
        emfactory.close();
    }


}
