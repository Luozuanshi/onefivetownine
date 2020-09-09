package com.domoyun.dateUtils;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import org.junit.Test;

import java.util.Date;

public class dateUtils {
    @Test
    public void hutool计算两个日期时间相差多少天(){
        Date stime= DateUtil.parse("2020-09-01 19:10:10", "yyyy-MM-dd HH:mm:ss");

        long x= DateUtil.between(stime,DateUtil.parse("2020-09-09"), DateUnit.DAY);//两个时间间隔几天
        System.out.println(x);
        for (int i = 0; i < x; i++) {
            System.out.println(stime+"======"+(DateUtil.dayOfWeek(stime)));//日期是周几,0-6,周日是0
            stime=DateUtil.offsetDay(stime,1);//时间增加1天
        }
    }

    @Test
    public void 日期和字符串的转换(){
        //字符串转日期
        String time = "2020-09-01 10:24:01";
        String time1 = "2020-09-01";

        DateTime parse = DateUtil.parse(time);
        System.out.println(parse);

        DateTime parse1 = DateUtil.parse(time1); //转换后会成为 2020-09-01 00:00:00

        System.out.println("DateUtil.parseDate(); DateUtil.parseDateTime(time1);   都不能转换成yyyy-MM-dd\n"+parse1);

        //使用DateUtil.parse(String,String):Date 转换为指定格式的Date对象
        DateTime parse2 = DateUtil.parse(time1, "yyyy-MM-dd");
        System.out.println("使用DateUtil.parse(String,String):Date 转换为指定格式的Date对象\n"+parse2);

    }

}
