/**
 * Test.java
 * Created at 2017年8月30日
 * Created by zhaojiong
 * Copyright (C) 2017 SHANGHAI VOLKSWAGEN, All rights reserved.
 */
package com.zhao.string;

/**
 * <p>
 * ClassName: Test
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * <p>
 * Author: zhaojiong
 * </p>
 * <p>
 * Date: 2017年8月30日
 * </p>
 */
public class Test1 {
	public static void main(String[] args) {

		String str1 = new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);		
		
		
		}

}
