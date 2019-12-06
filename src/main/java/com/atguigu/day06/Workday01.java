package src.main.java.com.atguigu.day06;
/**
 * @Description:    java类作用描述
 * @Author:         pangluo
 * @CreateDate:     2019年12月6日18:45:12
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月6日18:45:12 
 * @UpdateRemark:   冒泡排序算法
 * @Version:        1.0
 */
public class Workday01 {
    public static void main(String[] args){
        //冒泡排序
        //步骤1:前一个数和后一个数比较
        //步骤2:如果大于后一个数,则两个数交换位置
        //步骤3:第一个循环,从j=0遍历整个次数 array.length- 1 -i(每遍历一次都少一次循环次数)次
        //步骤4:第二个循环,从i=0遍历步骤3 array.length次

        int[] array = {1,2,4,8,2,3};//需要排序的数组

        int temp = 0;//用于两个数交换的临时变量
        for(int i = 0;i<array.length;i++){ //循环 5 次 ,i逐次递增
            for(int j = 0;j< array.length- 1 -i;j++){ //从数组长度array.length 循环,每一次都少循环一次 i(1,2,3...逐渐增长的)
                if(array[j] > array[j+1] ){ //前一个数和后一个数比较,如果大于交换
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        //打印输出
        for(int i = 0;i< array.length;i++){
            System.out.print(array[i]);
        }

    }

}
