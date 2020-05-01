/**
 * 
 */
package com.zx.接口;

import java.util.Calendar;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//父接口   变量= new 实现类();
		MyInterce  in = new InterfaceImpl();
		
		//调用work方法(该work是通过实现MyInterce接口后  继承得到的方法)
		in.work();
		


	}

}
