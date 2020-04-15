package com.domoyun.interViewQueTopic.Spring.BeanScope;

import com.domoyun.interViewQueTopic.Spring.BeanScope.entity.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 项目名称：interViewQueTopic 类名称：BeanScope
 *
 * @author Administrator
 * @version 1.0 创建时间2020年4月15日 22:29:13
 * 	类描述 ： Spring Bean的作用域之间有什么区别
 *  spring ioc容器创建就会创建bean实例，并且是singleton的bean
 *  如果 当该bean指定的是prototype ，ioc容器创建不会实例化该bean，，每次调用getBean方法的时再初始化该bean，每调用一次创建一个对象
 *             -request：每次请求实例化一个bean，但是该作用域只是在WebApplicationContext（web应用）
 *             -session：在一次会话中共享一个bean（同一个http session共享一个Bean）
 *
 */
public class BeanScope {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");

    @Test
    public void testBook(){
        Book book1 = (Book) ioc.getBean("book");
        Book book2 = (Book) ioc.getBean("book");
        System.out.println(book1==book2);
    }
}
