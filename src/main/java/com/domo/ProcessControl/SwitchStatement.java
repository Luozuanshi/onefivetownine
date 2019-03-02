/**
 * 
 */
package com.domo.ProcessControl;

/**
   * 项目名称：domo
   *类名称：SwitchStatement
 * @author Administrator
 * @version 1.0
   * 创建时间2019年3月1日下午7:58:44
   * 类描述:switch语句
 */
public class SwitchStatement {
	public static void main(String[] args) {
		int month = (int)(13*Math.random());
		
		switch (month) {
		case 1:
			System.out.println("一月份,很冷呐");
			break;
		case 2:
			System.out.println("二月份,过年啦");
			break;
		case 3:
			System.out.println("三月份,尊重一下春天好吗?");
			break;
		default:
			System.out.println("其他月份");
			break;
		}
		
		  char c = 'a';
	        int rand = (int) (26 * Math.random());
	        char c2 = (char) (c + rand);
	        System.out.print(c2 + ": ");
	        switch (c2) {
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	            System.out.println("元音");
	            break;
	        case 'y':
	        case 'w':
	            System.out.println("半元音");
	            break;
	        default:
	            System.out.println("辅音");
	        }
	}
	
}
