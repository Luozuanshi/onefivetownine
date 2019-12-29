/**
 * 
 */
package com.atguigu.day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

/**
   * 项目名称：domo
   *类名称：InputStream
 * @author Administrator
 * @version 1.0
   * 创建时间2019年12月28日下午3:49:34
   * 类描述
 */
public class InputStream {
	@Test
	public void test1() throws IOException {
		FileInputStream inputStream =null;
		FileOutputStream outputStream =null;
		System.out.println("\t    1  2  3  4  5  6  7  8  9  A  B  C  D  E  F");
		long start = System.currentTimeMillis();
		try {
		File read = new File("C:\\Users\\Administrator\\Desktop\\aaa.txt");
		File write = new File("C:\\Users\\Administrator\\Desktop\\bbb.txt");
		
		inputStream = new FileInputStream(read);
		outputStream = new FileOutputStream(write);
		
		byte[] b =new byte[16];
		int len=0;
		String hexStrVal="";
		String hexStr="";
		int addrOffset =b.hashCode();
		
		while((len = inputStream.read(b))!=-1) {
			hexStr="";
			//输出byte[] b JVM内存首地址+每次偏移F
			addrOffset += 0xF;
			System.out.print(Integer.toHexString(addrOffset).toUpperCase());
				
			// 输出每位b[k]以十六进制形式
				for (int i = 0; i < len; i++) {
					hexStrVal= Integer.toHexString(b[i]);
					if(hexStrVal.length() == 1) {
						hexStrVal="0"+hexStrVal;
					}
					System.out.print(hexStrVal.toUpperCase()+" ");
				}
			//输出每位b[k]以字符形式
				for (int i = 0; i < len; i++) {
					hexStr+=(char)b[i];
				}
				String replaceAll = hexStr.replaceAll("[\\t\\n\\r]", ".");
				System.out.println("\t"+replaceAll);	
			//写出流
			outputStream.write(b);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(inputStream !=null)
				inputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputStream !=null) {
					outputStream.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
//	@Test
//	public void test() throws IOException {
//		File file = new File("text.txt");
//		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		
//		int len = 0;
//		byte[] b = new byte[2];
//		while( (len=fileInputStream.read(b)) !=-1) {
//			System.out.print(new String(b,0,len));
//		}
//		
//		fileInputStream.close();
//		
//	}
}
