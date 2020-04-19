package com.domoyun.test;

import com.domoyun.domain.Customer;
import com.domoyun.utils.JpaUtils;
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
//        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myJpa");
////        2.通过实体管理器工厂获取实体管理器
//        EntityManager em = emfactory.createEntityManager();
        EntityManager em = JpaUtils.getEntityManager();
        EntityManager em1 = JpaUtils.getEntityManager();
        System.out.println(em);
        System.out.println(em1);
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
//        emfactory.close();
    }
    /**
     * 根据id查询客户
     *  使用find方法查询：
     *      1.查询的对象就是当前客户对象本身
     *      2.在调用find方法的时候，就会发送sql语句查询数据库
     *
     *  立即加载
     *
     *
     */
    @Test
    public void findId(){
//        1.通过工具类获取entityManager
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        //2.开启事务
        transaction.begin();
        //3.增删改查 -- 根据id查询客户
        /**
         * find : 根据id查询数据
         *      class：查询数据的结果需要包装的实体类类型的字节码
         *      id：查询的主键的取值
         */
        Customer customer = em.find(Customer.class, 3L);

        System.out.println(customer);
        //4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }
    /**
     * 根据id查询客户
     *      getReference方法
     *          1.获取的对象是一个动态代理对象
     *          2.调用getReference方法不会立即发送sql语句查询数据库
     *              * 当调用查询结果对象的时候，才会发送查询的sql语句：什么时候用，什么时候发送sql语句查询数据库
     *
     * 延迟加载（懒加载）
     *      * 得到的是一个动态代理对象
     *      * 什么时候用，什么使用才会查询
     */
    @Test
    public void getReference(){
//        1.通过工具类获取entityManager
        EntityManager em = JpaUtils.getEntityManager();
        EntityTransaction transaction = em.getTransaction();
        //2.开启事务
        transaction.begin();
        //3.增删改查 -- 根据id查询客户
        /**
         * find : 根据id查询数据
         *      class：查询数据的结果需要包装的实体类类型的字节码
         *      id：查询的主键的取值
         */
        Customer customer = em.getReference(Customer.class, 3L);

        System.out.println(customer);
        //4.提交事务
        transaction.commit();
        //5.释放资源
        em.close();
    }

    /**
     * 删除客户的案例
     *
     */
    @Test
    public  void testRemove() {
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //3.增删改查 -- 删除客户

        //根据id查询客户
        Customer customer = entityManager.find(Customer.class, 1l);
        //删除客户
        entityManager.remove(customer);

        //4.提交事务
        tx.commit();
        //5.释放资源
        entityManager.close();
    }
    /**
     * 更新客户的操作
     *      merge(Object)
     */
    @Test
    public  void testUpdate() {
        //1.通过工具类获取entityManager
        EntityManager entityManager = JpaUtils.getEntityManager();
        //2.开启事务
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        //3.增删改查 -- 更新操作

        //i 查询客户
        Customer customer = entityManager.find(Customer.class,1l);
        //ii 更新客户
        customer.setCustName("pangluo");
        entityManager.merge(customer);
        //4.提交事务
        tx.commit();
        //5.释放资源
        entityManager.close();
    }

}
