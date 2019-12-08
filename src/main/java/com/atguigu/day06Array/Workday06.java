package src.main.java.com.atguigu.day06Array;

import java.util.Scanner;

/**
 * @Description:    三、定义一个4行4列的二维数组，逐个从键盘输入值，然后将第1行和第4行的数据进行交换，将第2行和第3行的数据进行交换
 * @Author:         pangluo
 * @CreateDate:     2019年12月7日19:32:42
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月7日19:32:42
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Workday06 {

    public static void main(String[] args){
        //定义一个4行4列的二位数组
        int[][] arr = new int[4][4];
        Scanner in = new Scanner(System.in);
        int number;

        //逐个从键盘输入值
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                number = in.nextInt();
                arr[i][j] = number;
            }
        }

        int temp[] = new int[arr.length];

        //数组交换
        for(int i=0,j=arr.length-1;i<=j;i++,j--){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        //打印输出
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
