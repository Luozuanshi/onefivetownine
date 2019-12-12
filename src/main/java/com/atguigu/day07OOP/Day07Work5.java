package com.atguigu.day07OOP;
/**
 * @Description:    三、定义方法，实现查找某字符串数组中的元素查找，并返回索引，如果找不到，返回-1
 * @Author:         pangluo
 * @CreateDate:     2019年12月8日13:20:19 
 * @UpdateUser:     pangluo
 * @UpdateDate:     2019年12月8日13:20:19 
 * @UpdateRemark:   修改内容
 * @Version:        1.0
 */
public class Day07Work5 {

    public static void main(String[] args) {
        String[] strArr = {"你好","中国","中国","呆萌","中国","好啊"};
        String findStr = "好啊";
        int[] result =  findStr(strArr,findStr);
       for(int i = 0;i<result.length;i++){
            System.out.println("你要找的"+findStr+"找到了位置在"+result[i]);
        }

    }

    /*
    * 用数组保存结果,由于数组定义必须指定大小
    * 所以需要动态扩容需要注意的
    * 例如以数组1为模板,等待数组1的所有操作都完毕了
    * 在进行数组2拷贝数组1操作
    * 最后把数组2引用指向数组1
    * */
    public static int[] findStr(String[] arr,String str){
        int[] arr1 ={-1};//用来保存结果的数组
        int[] arr2=null;//用来临时使用的拷贝数组
        int count=0;//用来计数结果个数

        for(int i = 0;i<arr.length;i++){//遍历整个数组

            if(arr[i].equals(str)){//如果当前数等于查找的数   执行数组索引保存

                //当前匹配结果,保存数组1
                arr1[arr1.length-1] = i;
                //计数结果+1
                count++;

                arr2 = new int[arr1.length+1];//数组2 根据数组1 动态扩容
                //拷贝数组1

                for(int j = 0; j< arr1.length; j++){
                    arr2[j] = arr1[j];//数组的拷贝
                }

                arr1 =arr2; //数组1引用数组2

                System.out.println("找到了在"+arr2[count-1]+"个");

            }
            //
            if(i == arr.length-1){ //匹配到最后一个数 重新拷贝数组1,把最后一个结果数0不拷贝
                arr1 = new int[arr1.length-1];

                for(int k = 0; k< arr1.length; k++){
                    arr1[k]=arr2[k];
                }
            }
        }
        //如果第一个数为-1,代表没找到结果
        if(arr1[0] == -1){
            System.out.println("没有找到结果");
        }

        return arr1;
    }

}

