package com.atguigu.day18utils.java.java;

import java.util.Arrays;

import org.junit.Test;

public class StringAPI {
	
	
	/**
	 * String和char[]之间的转换
	 * 
	 * String和byte[]之间的转换
	 */
	@Test
	public void test6(){
		//将String转成char[]
		char[] charArray = "abcdefg".toCharArray();
		//将char[] 转成String
		String string = new String(charArray);
		char[] c = {'h','e','l','l','o'};
		String s = new String(c,1,3);//1指的是索引位置  ，3指的是字符的个数。
		System.out.println(s);
		
		//将String转成byte[]
		byte[] bytes = "abcdefg".getBytes();
		//将byte[]转成String
		String string2 = new String(bytes);
		
	}
	
	/**
	 * Arrays工具类 ：
	 */
	@Test
	public void test5(){
		String[] names = {"小苍老师","小泽老师","小波老师","小饭老师","小泷老师"};
		//Arrays工具类中的方法都是用来处理数组的 - toString(Object[] o) : 将数组中的内容以字符串的形式返回
		System.out.println(Arrays.toString(names));
	}
	
	/**
	 * String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 
String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
String[] split(String regex)：根据给定的匹配拆分此字符串。 
	 */
	@Test
	public void test4(){
		//replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
		System.out.println("abacad".replace('a', 'A'));
		//replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。 
		System.out.println("abcdabcdabc".replace("abc", "D"));
		//String[] split(String regex)：根据给定的匹配拆分此字符串。 
		String s = "abc-c-d-efg-hhhh";
		String[] split = s.split("-");
		System.out.println(Arrays.toString(split));
		//
		s = "abcdefghijk";
		System.out.println(Arrays.toString(s.split("")));
	}
	
	/**
	 * boolean contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
int indexOf(String str)：返回指定子字符串在此字符串中第一次出现处的索引 
int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始 
int lastIndexOf(String str)：返回指定子字符串在此字符串中最右边出现处的索引 
int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索 

	 */
	@Test
	public void test3(){
		// contains(CharSequence s)：当且仅当此字符串包含指定的 char 值序列时，返回 true
		System.out.println("abcdlongge".contains("longge"));
		//indexOf(String str)：从当前字符串左边的位置开始查找str所在的位置，如果不存在返回-1
		System.out.println("abceeeabcdddabc".indexOf("abc"));
		//indexOf(String str,int fromIndex)：从当前字符串左边的fromIndex位置开始查找str所在的位置，如果不存在返回-1
		System.out.println("abceeeabcdddabc".indexOf("abc",6));
		//lastIndexOf(String str)：从当前字符串右边的位置开始查找str所在的位置，如果不存在返回-1
		System.out.println("abceabc".lastIndexOf("abc"));
		//lastIndexOf(String str, int fromIndex)：从当前字符串右边的fromIndex位置开始查找star所在的位置，如果不存在返回-1
		System.out.println("1234445678910".lastIndexOf("4",6));
		
	}
	
	/**
	 * boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束 
boolean startsWith(String prefix)：测试此字符串是否以指定的前缀开始 
boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始

	 */
	@Test
	public void test2(){
		// boolean endsWith(String suffix)：测试此字符串是否以指定的后缀结束
		System.out.println("www.abc.com".endsWith(".com"));
		//startsWith(String prefix)：测试此字符串是否以指定的前缀开始 
		System.out.println("http://www.atguigu.com".startsWith("http"));
//		startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
		System.out.println("http://www.atguigu.com".startsWith("www", 7));
		
	}

	/**
	 * int length()：返回字符串的长度： return value.length
char charAt(int index)： 返回某索引处的字符return value[index]
boolean isEmpty()：判断是否是空字符串：return value.length == 0
String toLowerCase()：使用默认语言环境，将 String 中的所有字符转换为小写
String toUpperCase()：使用默认语言环境，将 String 中的所有字符转换为大写
String trim()：返回字符串的副本，忽略前导空白和尾部空白
boolean equals(Object obj)：比较字符串的内容是否相同
boolean equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
String concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
String substring(int beginIndex)：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。 
String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。 
	 */
	@Test
	public void test(){
		//length()：返回字符串的长度
		System.out.println("abc".length());
		//charAt(int index)： 返回某索引处的字符
		System.out.println("abcdef".charAt(1));
		//isEmpty()：判断是否是空字符串
		String s="";
		System.out.println(s.isEmpty());
		//toLowerCase()：将 String 中的所有字符转换为小写
		System.out.println("AbCdef".toLowerCase());
		//toUpperCase()：使将 String 中的所有字符转换为大写
		System.out.println("AbCdef".toUpperCase());
		//trim()：返回字符串的副本，忽略前导空白和尾部空白
		System.out.println("     a    b       ".trim());
		System.out.println("   a".trim().equals("a"));
		//equalsIgnoreCase(String anotherString)：与equals方法类似，忽略大小写
		System.out.println("abc".equals("ABC"));//false
		System.out.println("abc".equalsIgnoreCase("ABC"));//true
		//concat(String str)：将指定字符串连接到此字符串的结尾。 等价于用“+”
		System.out.println("abc".concat("ccc"));
		//substring(int beginIndex)：截取子串从beginIndex到最后
		System.out.println("abcdefg".substring(2));
		//substring(int beginIndex, int endIndex) ：截取子串从beginIndex到endIndex （左闭右开）
		System.out.println("abcdefg".substring(0, 6));//左闭右开 [beginIndex,endIndex) -包头不包尾
	}
	
	
}













