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
public class Test2 {
	
    static String ab = "ab";
    static String getA()
    {
        return "a";
    }
    static String getAB()
    {
        return "ab";
    }
    public static void main(String[] args)
    {
        // 1
        String _ab = new String("ab");
        System.out.printf("ab==_ab %b\n", ab==_ab);
        // 2
        String s1 = "a"+"b";
        System.out.printf("ab==s1 %b\n", ab==s1);
        // 3
        String s2 = getA()+"b";
        System.out.printf("ab==s2 %b\n", ab==s2);
        // 4
        System.out.printf("ab==getAB() %b\n", ab==getAB());
        // 5
        String s3 = new String("ab");
        System.out.printf("ab==s3 %b\n", ab==s3);
    }
	
    
/*    输出结果:

    	ab==_ab false
    	ab==s1 true
    	ab==s2 false
    	ab==getAB() true
    	ab==s3 false


    	第一条输出：

    	虽然常量池里面有”ab”这个字符串, 但是_ab是内存中另外一个String对象的引用.

    	第二条输出:

    	编译器优化, 由于+左右都是显式的字符常量, 所以加号操作符没有申请新的String变量, 而是指向常量池中原有的”ab”. 如果常量池中并没有”ab”, 那么加号操作符就会在常量池中添加”ab”

    	第三条输出:

    	由于编译器认为左操作数是String而不是字符串常量(谁叫它不是显性的2333), 所以编译器不进行优化. 加号操作符将申请新String.

    	第四条输出:

    	由于ab和getAB()指向同一个字符串常量”ab”, 地址必然相同.

    	第五条输出:

    	好像跟第一条重复了233*/
  
    
    
    
}
