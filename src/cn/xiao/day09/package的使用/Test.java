/**
 * 
 */
package com.zx.package的使用;

import com.zx.People;


import java.util.Random;

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
		
		//java.lang下所有的类可以直接使用，不用导包
		String name = "jack";
		
		//因为People类和 当前类Test不在同一个包下，因此使用的时候需要导包
		People p = new People();
		
		//Random类和当前类Test在同一个包中，因此在当前类中使用的时候不需要导包
		Random random = new Random();
		
		//直接使用权限名  声明使用的类的信息
		com.zx.package的使用.Random ran = new com.zx.package的使用.Random();
		

	}

}
