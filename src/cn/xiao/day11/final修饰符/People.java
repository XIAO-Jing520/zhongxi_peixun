/**
 * 
 */
package com.zx.final修饰符;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	//通过final修饰的实例成员变量   可以在定义的时候赋初始值或者在构造器中赋初始值或者在实例代码块中
	private final String name;
	
	//通过final修饰的静态成员变量可以在定义的时候赋初始值或者在静态代码块中赋初始值
	private final static int num;
	
	static {
		num = 10;
	}
	
	
	/*{
		this.name = "jack";
	}*/
	
	
	
	public People(String name) {
		this.name = name;
	}
	

	
}
