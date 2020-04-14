package com.atguigu.day19Array.java2;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

import org.junit.Test;

public class InstantTest {

	@Test
	public void test(){
		//now() : 静态方法，返回默认UTC时区(中时区)的Instant类的对象
		Instant now = Instant.now();
		System.out.println(now);
		
		//ofEpochMilli(long date) : 获取毫秒数所对应的时间
		Instant ofEpochMilli = Instant.ofEpochMilli(152222244555L);
		System.out.println(ofEpochMilli);
		
		//根据时间获取对应的毫秒数
		long epochMilli = now.toEpochMilli();
		System.out.println(epochMilli);
		
		//结合即时的偏移来创建一个 OffsetDateTime
		OffsetDateTime atOffset = now.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);
	}
}
