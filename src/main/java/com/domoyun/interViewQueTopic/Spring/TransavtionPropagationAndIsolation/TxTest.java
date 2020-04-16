package com.domoyun.interViewQueTopic.Spring.TransavtionPropagationAndIsolation;


import com.domoyun.interViewQueTopic.Spring.TransavtionPropagationAndIsolation.tx.dao.BookShopDao;
import com.domoyun.interViewQueTopic.Spring.TransavtionPropagationAndIsolation.tx.service.BookShopService;
import com.domoyun.interViewQueTopic.Spring.TransavtionPropagationAndIsolation.tx.service.Cashier;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TxTest {
	
	//创建IOC容器对象
	ApplicationContext ioc = new ClassPathXmlApplicationContext("beans-tx.xml");
	
	@Test
	public void testBookShopDao() {
		//获取BookDao
		BookShopDao bookShopDao = (BookShopDao) ioc.getBean("bookShopDao");
		double bookPrice = bookShopDao.getBookPriceByIsbn("1001");
		System.out.println(bookPrice);
		//更新图书的库存
		bookShopDao.updateBookStock("1001");
		//更新账户的余额
		bookShopDao.updateAccountBalance(1, bookPrice);
	}
	
	@Test
	public void testBookShopService() {
		BookShopService bookShopService = (BookShopService) ioc.getBean("bookShopService");
		bookShopService.purchase(1, "1001");
	}
	
	@Test
	public void testCashier() {
		Cashier cashier = (Cashier) ioc.getBean("cashier");
		//创建List
		List<String> isbns = new ArrayList<>();
		isbns.add("1001");
		isbns.add("1002");
		//去结账
		cashier.checkout(1, isbns);
	}

}
