/**
 * 
 */
package com.zx.pm;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 定义形参可变的方法
 */
public class Test03 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calc();
		calc(10);
		
		calc(10,20);
		
		calc(new int[] {10,20});
		
		
		
	}
	
	//定义形参可变的方法     调用该方法的时候   可以传入 0  到N指定类型的参数
	public static void calc(int ...  a) {
		
		
		System.out.println("形参个数:"+a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println("a:"+a[i]);
		}
		
		System.out.println("----------------------");
	}

}
