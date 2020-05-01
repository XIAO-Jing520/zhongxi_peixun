/**
 * 
 */
package com.zx.toStringAndEquals;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * toString方法测试
 */
public class Test {

	   public static void main(String[] args) {
		
		   People p = new People("jack",20,'男');
		   
		   //com.zx.toStringAndEquals.People@15db9742
		   System.out.println(p);
		   
		   
		   //java中常用已经重写 toString方法的类     String  以及八个 包装类
		   
		   String name = new String("jack");
		   System.out.println(name);
		   
		   Integer a = new Integer(10);
		   System.out.println(a);
	}
}
