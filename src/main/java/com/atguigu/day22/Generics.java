/**
 * 
 */
package com.atguigu.day22;

import java.util.ArrayList;

import org.junit.Test;

/**
   * 项目名称：domo
   *类名称：Generics
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月28日上午9:42:30
   * 类描述
 */
public class Generics {
	@Test
	public void test() {
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(1111);
		list.add(2222);
		
		for (Integer lister : list) {
			System.out.println(lister);
		}
	}
}
