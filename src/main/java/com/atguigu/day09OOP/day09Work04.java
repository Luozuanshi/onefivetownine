package com.atguigu.day09OOP;

import java.util.Calendar;

/**
 * @Description: 请编写一个类 koradji (巫师的意思)
 * 为类编写如下功能
 * 1.根据用户的输入某人的生日 （1990 8 12）   可以计算出 该人的 星座
 * 2.根据用户的输入年月日 可以计算是星期几
 * 3.可以显示该巫师 给多少人算过星相
 * ················································································
 * 星座	        出生日期	      星座	出生日期	             星座	        出生日期
 * 白羊座	3月21日-4月19日 	金牛座 	4月20日-5月20日	    双子座 　	5月21日-6月20日
 * 巨蟹座 	6月21日-7月22日 	狮子座 	7月23日-8月22日 	    处女座 	    8月23日-9月22日
 * 天秤座 	9月23日-10月22日	天蝎座 	10月23日-11月21日	射手座     	11月22日-12月21日
 * 摩羯座	12月22日-1月19日	水瓶座 	1月20日-2月18日 	    双鱼座 	    2月19日-3月20日
 * ················································································
 * @Author: pangluo
 * @CreateDate: 2019年12月10日21:14:20
 * @UpdateUser: pangluo
 * @UpdateDate: 2019年12月10日21:14:20
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 * 总结：可以复杂的事务封装成对象提供对应的属性和方法
 * 调用对象的对应方法可以完成特定的事情
 * 如果一个对象处理不了，可以创建改对象的数组
 * 利用遍历对象数组完成特定的功能
 */

public class day09Work04 {
    public static void main(String[] args){
        Koradji koradji = new Koradji();
        Koradji koradji1 = new Koradji();
        
        System.out.println(koradji.Constellation(8, 23));
        System.out.println(koradji.Constellation(8, 23));
        System.out.println(koradji.Constellation(8, 23));
        System.out.println(koradji1.Constellation(8, 23));
        koradji.howManPeople();
        koradji1.howManPeople();

        System.out.println(koradji.dayOfWeek(2019, 12, 12));

    }

}

class Koradji{
	int addSum;
	Constellation[] constellation ;
	Calendar c ;
	 Koradji() {
		 c = Calendar.getInstance();
		 constellation = new Constellation[12];
		 constellation[0] = new Constellation("水瓶座", 1, 20, 2, 18);
		 constellation[1] = new Constellation("双鱼座", 2, 19, 3, 20);
		 constellation[2] = new Constellation("白羊座", 3, 21, 4, 19);
		 constellation[3] = new Constellation("金牛座", 4, 20, 5, 20);
		 constellation[4] = new Constellation("双子座", 5, 21, 6, 20);
		 constellation[5] = new Constellation("巨蟹座", 6, 21, 7, 22);
		 constellation[6] = new Constellation("狮子座", 7, 23, 8, 22);
		 constellation[7] = new Constellation("处女座", 8, 23, 9, 22);
		 constellation[8] = new Constellation("天秤座", 2, 20, 3, 20);
		 constellation[9] = new Constellation("水瓶座", 9, 23, 10, 22);
		 constellation[10] = new Constellation("天蝎座", 10, 23, 11, 21);
		 constellation[11] = new Constellation("水瓶座", 11, 22, 1, 19);
	}
	
	//计算星座
	public String Constellation(int month,int day) {
		addSum++;
		for (int i = 0; i < constellation.length; i++) {
			if(constellation[i].isThis(month, day)) {
				return constellation[i].ConstellationName;
			}
		}
		return "";
	}
	
	public String dayOfWeek(int year,int month,int day){
		c.set(year, month, day);
		return "星期" + (c.get(Calendar.DAY_OF_WEEK)+3)%7;
	}
	
	//输出对象计算过的人数
	public void howManPeople() {
		System.out.println("巫师给"+addSum+"人算过星象");
	}

}

class Constellation{
	String ConstellationName;
	int leftMonth;
	int rightMonth;
	int leftDay;
	int rightDay;
	
	public Constellation(String Constellation, int leftMonth, int leftDay, int rightMonth,int rightDay) {
		super();
		this.ConstellationName = Constellation;
		this.leftMonth = leftMonth;
		this.leftDay = leftDay;
		this.rightMonth = rightMonth;
		this.rightDay = rightDay;
	}

	//输入的年月是否在当前区间
	public boolean isThis(int month , int day) {
        return month == leftMonth && day >= leftDay || month == rightMonth && day <= rightDay;
    }
	
}