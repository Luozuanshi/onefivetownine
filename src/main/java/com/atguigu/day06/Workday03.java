package src.main.java.com.atguigu.day06;
/**
 * @Description:    java类作用描述
 * @Author:         pangluo
 * @CreateDate:     2019年12月6日19:39:31
 * @UpdateUser:     pangluo
 * @UpdateDate:
 * @UpdateRemark:   二分法查找
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
        int findVal = 123465;//查找的数
        int index = 0;//查找的数的索引

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


    }

}
