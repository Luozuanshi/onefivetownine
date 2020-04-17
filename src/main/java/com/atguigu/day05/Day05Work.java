package com.atguigu.day05;

public class Day05Work {
	public static void main(String[] args) { 

		int totalLevel = 5;

		
		for(int i = 1; i <= totalLevel; i++) { //���Ʋ���
			//����ո�
			for(int k = 1; k <= totalLevel - i; k++){
				System.out.print(" ");
			}

			for(int j = 1; j<= 2 * i - 1; j++){ //��
				//ÿһ��ĵ�һ��λ�ú����һ��λ��ʱ*�������ǿո�
				//�ر���������㣬��ȫ����*
				if(j == 1 || j == 2 * i -1 || i == totalLevel ) {
                //                     if( i == totalLevel ){
                //             		for(int t = totalLevel; t > 0; t--) { //���Ʋ���
                //                         //����ո�
                //                         for(int k = 1; k < (totalLevel+1) - t; k++){
                //                             System.out.print(" ");
                //                         }

                //                         for(int k = 1; k<= 2 * t - 1; k++){ //��
                //                             //ÿһ��ĵ�һ��λ�ú����һ��λ��ʱ*�������ǿո�
                //                             //�ر���������㣬��ȫ����*
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