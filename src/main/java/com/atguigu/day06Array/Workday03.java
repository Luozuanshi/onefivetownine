package com.atguigu.day06Array;
import java.util.*;
/**
 * @Description:    java类作用描述
 * @Author:         pangluo
 * @CreateDate:     2019年12月6日19:39:31
 * @UpdateUser:     pangluo
 * @UpdateDate:
 * @UpdateRemark:   失败的二分法查找
 * @Version:        1.0
 */
public class Workday03 {
    public static void main(String[] args){
    /*
    * 请对一个有序数组进行二分查找 {1,8, 10, 89, 1000, 1234} ，输入一个数看看该数组是否存在此数，并且求出下标，如果没有就提示"没有这个数"。使用非递归实现

    思路
    1. 先找到中间这个数 mid
    2. 让findVal 和 mid 比较
    2.1.findVal == mid //ok
    2.2 findVal > mid //从 mid+1 ---- (arr.length - 1)
    2.3 findVal < mid //从  0 ----- mid-1
    */

        int[] arr = {1,8,10,89,1000,1234,123465};

        int mediant =arr[arr.length/2];//中间数
        int medIndex =(arr.length/2)+1;//中间数索引
        int findVal = 1234564;//查找的数
        int index = 0;//查找的数的索引


        mediant =arr[arr.length/2];//中间数
        medIndex =(arr.length/2)+1;//中间数索引
        //如果查找的数与中间数相等
        if(mediant == findVal ){
            index = medIndex; //直接给出中间数的索引
        }else if(findVal > mediant){ //如果查找的数大于中间数,循环查找medIndex之后的数,截止条件为<=arr.length-1
            for(int i = medIndex;i<=arr.length-1;i++){
                if(findVal == arr[i]){
                    index = i ;
                }
            }
        }else if(findVal < mediant){//如果查找的数小于中间数,循环查找medIndex之前的数,截止条件为<=medIndex
            for(int i = 0;i<=medIndex;i++){
                if(findVal == arr[i]){
                    index = i ;
                }
            }
        }

        System.out.println("查找的"+findVal+"位置为"+index);

        dichotomy();
    }

    /**
     * /**
     *  * @Description:    java类作用描述
     *  * @Author:         Mr.邓
     *  * @CreateDate:     2019年12月6日
     *  * @UpdateUser:     Mr.邓
     *  * @UpdateDate:
     *  * @UpdateRemark:   真正的二分法查找
     *  * @Version:        1.0
     *  */

    public static void dichotomy(){
        int[] arr = {1,5,87,52,41,7,8,6,2,54,32};
        int temp = 0; //交换变量
        //对数组进行排序
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j <arr.length -i -1; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for( int v : arr){//测试冒泡排序结果
            System.out.print(v + "\t");
        }
        //输入一个数看看该数组是否存在此数
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数 我来帮你判断");
        int num = myScanner.nextInt(); //用户生成一个数
        //使用二分法 数组长度除2 是否等于num如果不等于判断大小
        //如果num>center index 则使center index + 1 ~ arr.length-1 取中间值
        //反之同理 不断取中间值 直到 arr.length-1 最低位大于最高位
        //最低位 low
        //最高位 high
        //中间位center
        int low = 0;//数组中最低位
        int high = (arr.length -1);//数组最高位
        int center = 0;//数组中间位
        boolean b = false;
        while(low <= high){//如果低位大于高位 退出循环
            center = (low + high)/2;
            if( arr[center] < num){//如果中心值小于num 则取值范围在右边
                low = center + 1; //为low
            }
            if(arr[center] > num){//如果中心支大于num 取取值范围在左边
                high = center -1;//为high
            }
            if(arr[center] == num){
                b = true;
                System.out.println("有这个数");
                System.out.println(arr[center]);
                System.out.println(center);
                break;
            }
        }

        if(!b){
            System.out.println("没有这个数");
        }


    }

}
