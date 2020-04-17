/**
 * 
 */
package com.atguigu.day22;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
   * 项目名称：domo
   *类名称：BufferInputSteam
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月30日上午10:54:07
   * 类描述
 */
public class BufferInputSteam {
	@Test
	public void test() throws IOException {
		FileInputStream fr = new FileInputStream("C:\\Users\\Administrator\\Desktop\\aaa.txt");
		InputStreamReader isr = new InputStreamReader(fr,"GBK");
		BufferedReader br = new BufferedReader(isr);
		
		char[] c = new char[1024];
		int len = 0;
		String  str = null;
		while(((str = br.readLine())!=null)) {
			System.out.println(str);
		}
		br.close();
		fr.close();
	}
}
