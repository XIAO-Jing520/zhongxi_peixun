/**
 * 
 */
package com.zx.封装.测试;

import com.zx.封装.Student;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {
	

	public static void main(String[] args) {
		
		Student s = new Student();
		//因为name属性是私有的，因此只能在 Student类中访问
		//s.name = "jack";
		//age属于包访问权限    只能在当前类中或者同一个包中的其它类中访问
		//s.age = 20;
		//sex属于 子类访问权限   只能在当前类中或者同一个包中的其它类中访问以及子类中访问
		//s.sex = '男';
		
		//height是 public修饰的，可以在任意地方去访问
		s.height = 170;
		
	
	}

}
