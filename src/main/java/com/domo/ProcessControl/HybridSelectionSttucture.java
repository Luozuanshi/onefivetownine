package com.domo.ProcessControl;
/**
 * 
 * 项目名称:pojectjava8_m
 * 类名称:HybridSelectionSttucture
 * @author Administrator
 * @version 1.0
 * 创建时间:2019年2月25日下午7:15:01
 * 类描述:IFelseIFelse混合选择结构
 */
public class HybridSelectionSttucture {

	public static void main(String[] args) {
		int age =(int)(100*Math.random());
		System.out.print("年龄是"+age +",属于");
		if (age<15) {
			System.out.println("儿童,喜欢玩");
		}else if (age<25) {
			System.out.println("青年,要学习");
		}else if (age<45) {
			System.out.println("中年，要工作");
		}else if (age<65) {
			System.out.println("中老年，要补钙");
		}else if (age<85) {
			System.out.println("老年，多运动");
		}else {
			System.out.println("老寿星，古来稀");
		}
	}

}
