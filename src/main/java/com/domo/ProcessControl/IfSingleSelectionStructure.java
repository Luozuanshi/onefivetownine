package com.domo.ProcessControl;
/**
 * 
 * 项目名称:pojectjava8_m
 * 类名称:IfSingleSelectionStructure
 * @author Administrator
 * @version 1.0
 * 创建时间:2019年2月25日下午5:08:28
 * 类描述:if 单选择结构
 */
public class IfSingleSelectionStructure {

	public static void main(String[] args) {
		//通过掷三次骰子看看今天的手气如何
		int i = (int)(6*Math.random());
		int j = (int)(6*Math.random());
		int k = (int)(6*Math.random());
		System.out.println("第一次投:"+i+"第二次投:"+j+"第三次投:"+k);
		int count =i +j + k;
		//如果三个骰子之和大于15,则今天的手气不错
		if (count>15) {
			System.out.println("今天的手气不错");
		}
		if (count>=10 &&count<=15) {
			System.out.println("今天的手气一般");
		}
		if (count<10) {
			System.out.println("今天的手气不好");
		}
	}

}
