package com.atguigu.day18utils.java.java;

import org.junit.Test;

public class StringAPI2 {

	/**
	 * 1.将"AaBcDeFg"中大写字母转成小写 （charAt(int index)） 2.将"AaBcDeFg"中小写字母转成大写 （charAt(int
	 * index)） 3.将"AaBcDeFg"大写变小写，小写变大写 4.将"abcdefg"中的内容进行反转。
	 * 5.统计"abcdabcdddabc"中abc出现的次数。
	 */

	// * 1.将"AaBcDeFg"中大写字母转成小写 （charAt(int index)）
	@Test
	public void test() {
		String s = "AaBcDeFg";
		char[] charArray = s.toCharArray();

		for (int i = 0; i < charArray.length; i += 2) {
			charArray[i] += 32;
		}
		String newStr = new String(charArray);
		System.out.println(newStr);
	}

//	* 2.将"AaBcDeFg"中小写字母转成大写 （charAt(int index)）
	@Test
	public void test1() {
		String s = "AaBcDeFg";
		char[] charArray = s.toCharArray();

		for (int i = 1; i < charArray.length; i += 2) {
			charArray[i] -= 32;
		}
		String newStr = new String(charArray);
		System.out.println(newStr);
	}

//	* 3.将"AaBcDeFg"大写变小写，小写变大写
	@Test
	public void test2() {
		String s = "AaBcDeFg";
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 95 && charArray[i] <= 122) {
				charArray[i] -= 32;
			} else if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] += 32;
			}
		}
		String newStr = new String(charArray);
		System.out.println(newStr);
	}

//	4.将"abcdefg"中的内容进行反转。	
	@Test
	public void test3() {
		String s = "abcdefg";
		char[] charArray = s.toCharArray();
		char[] newChar = new char[charArray.length];
		for (int i = charArray.length - 1, j = 0; i >= 0; i--, j++) {
			newChar[j] = charArray[i];
		}
		String newStr = new String(newChar);
		System.out.println(newStr);
	}

	// * 5.统计"abcdabcdddabc"中abc出现的次数。
	@Test
	public void test4() {
		int pointer = 0;
		int count = 0;
		int index = 0;
		while (true) {
			index = "abcdabcdddabcabc".indexOf("abc", pointer);
			if (index != -1) {
				count++;
				pointer = ++index;
			} else {
				break;
			}

		}
	}
}
