package src.main.java.com.atguigu.day07OOP;
/**
 * @Description:    二、定义方法，实现求某个double数组的最大值，并返回
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日12:46:35
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日12:46:38
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work4 {


    public static void main(String[] args) {

        double[] dArr = {1,2,3,5.5,4.4,53.45};
        double max=doubleMaxVal(dArr);//调用类方法,直接获取某个数组的最大值

        //打印输出数组dArr
        for(int i = 0;i<dArr.length;i++){
            System.out.println(dArr[i]);
        }

        //输出最大值
        System.out.println(max);
    }
    //定义方法，实现求某个double数组的最大值，并返回
    public static double doubleMaxVal(double[] arr){ //String 类型 基本数据类型作为参数传进来在方法里面不会改变原变量的值
                                                     //传进来的对象或者数组如果直接改变形参会,改变原变量的值
        double max=0;
        arr[0] = 99.0;
        for(int i = 0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }

        }
        return max ;
    }


}

