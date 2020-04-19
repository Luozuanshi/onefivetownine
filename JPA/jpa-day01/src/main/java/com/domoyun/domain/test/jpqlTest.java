package com.domoyun.domain.test;

import com.domoyun.domain.domain.Customer;
import com.domoyun.domain.utils.JpaUtils;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;


public class jpqlTest {
    /**
     * 查询全部
     *      jqpl：from ccom.domoyun.domain.Customer
     *      sql：SELECT * FROM cst_customer
     */
    @Test
    public void findAll(){
        //1.获取entityManager对象
        EntityManager em = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = em.getTransaction();
        //3.查询全部
        transaction.begin();
//        String jpql = "from com.domoyun.domain.Customer";
        String jpql = "from Customer";
        Query query = em.createQuery(jpql);
        //发送查询，并封装结果集
        List<Customer> list = query.getResultList();
        for (Customer obj :list) {
            System.out.println(obj.getCustName());
            System.out.println(obj);
        }
        //4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }
    /**
     * 排序查询： 倒序查询全部客户（根据id倒序）
     *      sql：SELECT * FROM cst_customer ORDER BY cust_id DESC
     *      jpql：from Customer order by custId desc
     *
     * 进行jpql查询
     *      1.创建query查询对象
     *      2.对参数进行赋值
     *      3.查询，并得到返回结果
     */
    @Test
    public void oderBy(){
        //1.获取entityManager对象
        EntityManager em = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = em.getTransaction();
        //3.查询全部
        transaction.begin();
//        String jpql = "from com.domoyun.domain.Customer";
        String jpql = "from Customer order by custId desc ";
        Query query = em.createQuery(jpql);
        //发送查询，并封装结果集
        List<Customer> list = query.getResultList();
        for (Customer obj :list) {
            System.out.println(obj.getCustName());
            System.out.println(obj);
        }
        //4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }
    /**
     * 使用jpql查询，统计客户的总数
     *      sql：SELECT COUNT(cust_id) FROM cst_customer
     *      jpql：select count(custId) from Customer
     */
    @Test
    public void count(){
        //1.获取entityManager对象
        EntityManager em = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = em.getTransaction();
        //3.查询全部
        transaction.begin();
        //i  根据jpql获取Query对象
        String jpql = "select count(custId) from Customer";
        Query query = em.createQuery(jpql);
        //ii 对参数赋值
        //iii 获取结果集
        Object obj = query.getSingleResult();
        System.out.println(obj);
        // 4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }
    /**
     * 分页查询
     *      sql：select * from cst_customer limit 0,3
     *      jqpl : from Customer
     */
    @Test
    public void pageinfo(){
        //1.获取entityManager对象
        EntityManager em = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = em.getTransaction();
        //3.查询全部
        transaction.begin();
        //i  根据jpql获取Query对象
        String jpql = "from Customer ";
        Query query = em.createQuery(jpql);
        //ii 对参数赋值
        //起始索引
        query.setFirstResult(1);
        //每页查询的条数
        query.setMaxResults(3);
        //iii 获取结果集
        List<Customer> result = query.getResultList();
        for(Customer customer : result){
            System.out.println(customer);
        }
        // 4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }

    /**
     * 条件查询
     *     案例：查询客户名称以‘传智播客’开头的客户
     *          sql：SELECT * FROM cst_customer WHERE cust_name LIKE  ?
     *          jpql : from Customer where custName like ?
     */
    @Test
    public void conditions(){
        //1.获取entityManager对象
        EntityManager em = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction transaction = em.getTransaction();
        //3.查询全部
        transaction.begin();
        //i  根据jpql获取Query对象
        String jpql = "from Customer where custName like ?";
        Query query = em.createQuery(jpql);
        //ii 对参数赋值 -- 对占位符赋值
        query.setParameter(1,"d%");
        //iii 获取结果集
        List<Customer> result = query.getResultList();
        for(Customer customer : result){
            System.out.println(customer);
        }
        // 4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }

}
