/**
 * 
 */
package com.zx.封装;

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
		s.age = 20;
		s.sex = '男';
		s.height = 170;
		
		
		People p = new People();
		p.setName("jack");
		p.setAge(200);
		p.setSex('妖');
		
		

		//获取名字
		System.out.println(p.getName());
		//获取年龄
		System.out.println(p.getAge());
		//获取性别
		System.out.println(p.getSex());
	}

}
