package src.main.java.com.atguigu.day06;
/**
 * @Description:    java类作用描述
 * @Author:         pangluo
 * @CreateDate:     2019年12月6日19:01:21
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月6日18:45:12 
 * @UpdateRemark:   关于数组遍历的两个案例
 * @Version:        1.0
 */
public class Workday02 {
    public static void main(String[] args){
        // 案例1:请使用灵活的方式遍历如下数组 ：
        //       int [][] map = {{0,0,1},{1,1,1},{1,1,3}};
        int[][] map = {{1,2,3},{3,2,1,4},{1,2,3,4,5,6,7,8,9}};
        for(int i = 0;i<map.length;i++){
            for(int j = 0; j<map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }
        }
        System.out.println();



        // 案例2：
        // int arr[][]={{4,6},{1,4,5,7},{-2}};
        // 遍历该二维数组，并得到和?
        int[][] arr = {{4,6},{1,4,5},{-2}};
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                sum += arr[i][j];
                System.out.print(arr[i][j]+"\t");
            }
        }
        System.out.println("\nsum = "+sum);

    }

}
