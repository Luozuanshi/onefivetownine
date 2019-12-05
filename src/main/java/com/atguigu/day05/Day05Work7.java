package src.main.java.com.atguigu.day05;

public class Day05Work7 {
    /**
     * 2.随机生成10个整数(1_100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有55
     * @param args
     */
    public static void main(String[] args){
        //1.生成十个整数0-100；
        //2.把十个数保存到数组
        //3.倒叙打印
        //4.求平均值
        //5.求最大值以及下标
        //6.查找里面是否有55

        // 生成十个整数0-100； 把十个数保存到数组
        int[] randArray = generateRandom();
        for(int i = 0; i<randArray.length;i++){
            System.out.print(randArray[i]+"\t");
        }

        int maxSize = randArray.length;//最大索引
        int maxIndex = randArray.length-1;//最大下标

        //倒序
        for(int i = maxIndex;i>= maxSize / 2 ;i--){
            for(int j = maxIndex -i;j==(maxIndex -i);j++){
                int temp =  randArray[i];
                randArray[i] =  randArray[j];
                randArray[j] = temp;
                break;
            }

        }

        System.out.println("\n");
        for(int i = 0; i<randArray.length;i++){
            System.out.print(randArray[i]+"\t");
        }


        //求最大值
        int maxValue = 0;
        int maxValueIndex =0;
        for(int i = 0;i<10;i++){
            if(maxValue < randArray[i]){
                maxValue = randArray[i];
                maxValueIndex = i;
            }
        }
        System.out.println("\n" + maxValue);
        System.out.println(maxValueIndex);

        //求平均值
        int average = 0;
        int sum = 0;
        for(int i = 0;i<maxSize;i++){
            average += randArray[i];
        }
        sum = average / maxSize;
        System.out.println(sum);

        //查找里面是否有55
        System.out.println(findSpecifyNumber(randArray,55));
    }

    /**
     * 生成是个随机数,返回数组
     * @return
     */
    public static int[] generateRandom(){

        int[] randomAarry = new int[10]; //开辟10个空间,访问元素下标只能到0-9
//        System.out.println(randomAarry.length); //循环从0开始,从9结束,能访问10个元素
        for(int i = 0;i<randomAarry.length;i++){
            randomAarry[i] = (int)(Math.random()*100+1);
//            System.out.println(randomAarry[i]);
        }
        return randomAarry;
    }

    public static boolean findSpecifyNumber(int[] randomArray,int num){
        for(int i = 0;i< randomArray.length;i++){
            if(num == randomArray[i]){
                System.out.println("存在"+num);
                return true;
            }
        }
        return false;
    }
}
