/**
 * 
 */
package com.zx.pm;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 值传递
 */
public class Test {
	
	static int a = 100;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //java中数据的传递机制：值传递
		int a = 10;
		
		//调用calc方法
		Test.calc(a);
		
		//                            10                 101           
		System.out.println("main---a:"+a+"   Test.a:"+Test.a);
	}
	
	
	public static void calc(int a) {
		
		//"就近原则"
		//                         10                 100                                  
		System.out.println("clac---a:"+a+"   Test.a:"+Test.a);
		a++;
		Test.a++;
		//                      11              101                          
		System.out.println("a:"+a+"   Test.a:"+Test.a);
		
	}

}
