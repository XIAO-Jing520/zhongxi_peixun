/**
 * 
 */
package com.zx;

import static com.zx.People.clac;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class StringTest {
	
	 public static void main(String[] args) {
		
		 //String定义好之后会放在常量池   ，除非是通过  new 构造的字符窜
		
		 
		 //通过new 创建的对象会放在堆内存
		 String ss1 = new String("china");//2   常量池中存放一个    堆内存中存放一个
		 String ss2 = new String("china");//1
		 String ss3 = new String("china");//1
		 
		 
		 String s1 = "china";//0
		 String s2 = "china";//0
		 String s3 = "chi" +"na";//0
		 
		 
		 
		 //通 
		 System.out.println(s1 == s2);
		 
		 System.out.println(ss1 == ss2);
		 
		 

		 
	}

}
