
import java.util.*;
public class Day05Work2 {
	public static void main(String[] args) { 
		/**
		某人有100,000元，每经过一次路口，需要交费，规则如下：5min

		1.当现金>50000时，每次交5%

		2.当现金<=50000时，每次交1000

		编程计算该人可以经过多少次路口，使用while break方式完成

		 */

		double money = 100000 ;
		int count = 0;
		while(money>1000){
			if(money>50000){
			money -= money*0.05;
				count++;
			}else if(money<=50000){
				money -= 1000;
				count++;
			}
		}
		System.out.println(count);

	}
}