package src.main.java.com.atguigu.day06Array;

import java.util.Scanner;

/**
 * @Description:    二：定义一个3行4列的二维数组，逐个从键盘输入值，编写程序将四周的数据清0
 * @Author:         pangluo
 * @CreateDate:     2019年12月7日18:56:01
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月7日18:56:01 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Workday05 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][4];
        int number;
        System.out.print("请输入数据:");
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                number = in.nextInt();
                if(i == 0 || i == arr.length-1 || j==0 || j==arr[i].length-1){
                    continue;
                }
                arr[i][j] =number;
            }
            System.out.println("输入完第"+(i+1)+"行数据");
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
