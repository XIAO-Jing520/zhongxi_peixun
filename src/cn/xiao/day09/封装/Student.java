/**
 * 
 */
package com.zx.封装;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Student {
	

	
	//private私有访问权限 ：只能在当前类中访问该成员变量
	private String name;
	//不加修饰符属于包访问权限：只能在当前类中或者同一个包中的其它类中访问
	int age;
	//protected 子类访问权限   只能在当前类中或者同一个包中的其它类中访问以及子类中访问
	protected char sex;
	//public 公开访问权限   可以在任意地方访问
	public float height;
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "jack";
		s.age = 20;
		s.sex = '男';
		s.height = 170;
	}

}
