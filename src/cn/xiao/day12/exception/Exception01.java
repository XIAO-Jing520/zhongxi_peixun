/**
 * 
 */
package com.zx.exception;

import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 早期处理异常的方案
 */
public class Exception01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入正整数X的值:");
		
		int x = scanner.nextInt();
		
        System.out.println("请输入正整数Y的值:");
		
		int y = scanner.nextInt();
		
		
		//调用方法计算  x 除以  y并获取结果
		int z = calc(x,y);
        System.out.println("x除以y的结果:"+z);
        
        System.out.println("==============程序执行完毕========");
	}

	/**
	 * @param x
	 * @param y
	 */
	private static int calc(int x, int y) {
		// TODO Auto-generated method stub
		
		if(y == 0) {
			return 0;
		}
		return x/y;
	}

}
