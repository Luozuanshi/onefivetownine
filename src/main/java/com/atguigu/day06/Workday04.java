package src.main.java.com.atguigu.day06;

import java.util.Scanner;

/**
 * @Description:    java类作用描述
 * @Author:         pangluo
 * @CreateDate:     2019年12月6日21:07:26
 * @UpdateUser:     pangluo
 * @UpdateDate:
 * @UpdateRemark:   一、已知有个排序好（升序）的数组，要求插入一个元素，最后打印该数组，顺序依然是升序 【10， 12， 45， 90】 23 【10， 12，23， 45， 90】
 * @Version:        1.0
 */
public class Workday04 {
    //TODO
    public static void main(String[] args){

        //一、已知有个排序好（升序）的数组，要求插入一个元素，最后打印该数组，顺序依然是升序 【10， 12， 45， 90】 23 【10， 12，23， 45， 90】
        int[] arr1 = {10,12,45,90};
        int[] arr2 =new int[arr1.length+1];
        int insertIndex = 0;
        //获取用户输入
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        //数组的拷贝并输出数组一
        for(int i = 0 ; i < arr1.length;i++){
            arr2[i] = arr1[i];
            System.out.print(arr1[i]+"\t");
        }
        //换行输出数组二
        System.out.println();
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }

        //获取插入的索引
        for(int i = 0 ; i < arr2.length;i++){
            if(number < arr2[i]){
                insertIndex = i;
                break;
            }else{
                insertIndex = arr2.length-1;
            }
        }

        //获得要插入的索引
        System.out.print("\n"+insertIndex);


        //后移
        for(int i = arr2.length -2 ;i>=insertIndex;i--){
//            if(i==insertIndex){
//                arr2[i] = number;
//            }
            arr2[i+1] = arr2[i];
        }
        //换行输出数组二
        arr2[insertIndex] =number;
        System.out.print("\n");
        for(int i = 0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }

//        for(int i = 0 ;i<arr2.length;i++){
//            System.out.println(arr2[i]);
//        }


    }

}
