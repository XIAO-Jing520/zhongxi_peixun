/**
 * 
 */
package com.zx.包装类;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test02 {
	
	
	public static void main(String[] args) {
		
		//包装类型的整数值   在  -128  到 127 直接定义（不使用new ）的时候会将数据存放在  常量池超过之后会存放在堆内存
		Integer a = 127;//1  常量池 
		Integer b = 127;//0 
		
		
		Integer c = new Integer(127);//1  堆
		Integer d = new Integer(127);//1 堆
		
		System.out.println(a == b);//true
		
		System.out.println(c == d);//false
		
		System.out.println(a ==c);//false
		
		
		Double af = 10.0;
		
		Double bf = 10.0;
		//Float以及Double雷星的数据不会存放在常量池  ，会直接创建对象放在堆内存
		System.out.println(af == bf);
		
	
	}
	


}
