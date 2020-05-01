/**
 * 
 */
package com.zx.继承;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setName("jack");
		
		String name = s.getName();
		
		//调用静态成员变量   继承  People得到的
		int count = Student.count;
		
		//调用静态方法，继承得到的
		Student.play();
		
		
		
	}

}
