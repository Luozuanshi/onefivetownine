package com.atguigu.day07OOP;
/**
 * @Description:    五、打印某字符串型数组中的所有元素
 *                  六.求整型数组的和
 *                  七.实现数组的复制功能，根据旧数组，返回一个新数组，元素和旧数组一样
 *  * * @Author:         pangluo
 * @CreateDate:     2019年12月8日17:38:00
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日17:38:03
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work7 {

    public static void main(String[] args) {
      
        char[] char1 = {1024,2,2,3,4,97,65,9,'A','顶'};
        int[] numberArr = {1,2,3,3,4,5,6,7};
        Mytools tools = new Mytools();
        tools.printCharArr(char1);
        tools.sumIntegerArr(numberArr);
        int[] newArr = tools.copyArr(numberArr);

        //遍历输出newArr数组
        for(int i = 0;i<newArr.length;i++){
            System.out.print(newArr[i]+"\t");
        }
    }

}

class Mytools{
    public static void printCharArr(char[] character){
        for(int i = 0;i<character.length;i++){
            System.out.print(character[i]);
            System.out.print("\t");
        }
    }

    public static void sumIntegerArr(int[] intArr){
        int sum =0;
        for(int i = 0;i<intArr.length;i++){

            sum+= intArr[i];
        }
        System.out.println("\n"+sum);
    }

    public static int[] copyArr(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }

}


