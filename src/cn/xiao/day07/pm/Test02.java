/**
 * 
 */
package com.zx.pm;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 值传递
 */
public class Test02 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//通过new  创建的对象数据是存放在  堆内存中的  
		User user = new User();
		user.name = "jack";
		user.age = 10;
		user.sex = '男';
		
		//直接打印引用类型数据的时候，会打印出内存地址信息    com.zx.pm.User@15db9742
		System.out.println(user);
       
		//调用calc方法
		Test02.calc(user);
		//
		System.out.println("user.name:"+user.name);
	}
	
	
	public static void calc(User user) {
		
		
		 
		 user.name = "rose";
		 
		 //user = null的意思是 引用类型变量user不再指向任何对象
		 user = null;
		
	}

}
