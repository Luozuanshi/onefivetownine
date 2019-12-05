
import java.util.*;
public class Day05Work {
	public static void main(String[] args) { 

		int totalLevel = 5;

		
		for(int i = 1; i <= totalLevel; i++) { //控制层数
			//输出空格
			for(int k = 1; k <= totalLevel - i; k++){
				System.out.print(" ");
			}

			for(int j = 1; j<= 2 * i - 1; j++){ //层
				//每一层的第一个位置和最后一个位置时*，其它是空格
				//特别情况，最后层，是全部给*
				if(j == 1 || j == 2 * i -1 || i == totalLevel ) {
                //                     if( i == totalLevel ){
                //             		for(int t = totalLevel; t > 0; t--) { //控制层数
                //                         //输出空格
                //                         for(int k = 1; k < (totalLevel+1) - t; k++){
                //                             System.out.print(" ");
                //                         }

                //                         for(int k = 1; k<= 2 * t - 1; k++){ //层
                //                             //每一层的第一个位置和最后一个位置时*，其它是空格
                //                             //特别情况，最后层，是全部给*
                //                             if(k == 1 || k == 2 * t -1  ) {
                //                                 System.out.print("*");
                                        
                //                             } else {
                //                                 System.out.print(" ");
                //                             }
                                            
                //                         }
                //                         System.out.println();
                //                 }
                //    } 
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}
}