/**
 * 
 */
package com.zx.toStringAndEquals;

import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * equals方法测试
 */
public class Test02 {

	   public static void main(String[] args) {
		   
		   //equals是用于比较两个对象是否相等
		
		   People p = new People("jack",20,'男');
		 
		   People p2 = new People("jack",20,'男');
		   
		 //  System.out.println(p == p2);
		   
		   boolean flag = p.equals(p2);
		   
		 //  System.out.println(flag);
		   
		  String name1 = new String("jack");
		  String name2 = new String("jack");
		//  System.out.println("name1==name2:"+(name1==name2));
		  
		 // System.out.println("name1.equals(name2):"+(name1.equals(name2)));
		  
		  
		  
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("请输入账号：");
		 String account =  scanner.next();
		 
		  System.out.println("请输入密码：");
			 String pass =  scanner.next();
			 
			 String realAccount = "admin";
			 String realPass = "123";
			 
			 if(account.equals(realAccount) && pass.equals(realPass)) {
				 System.out.println("登录成功");
			 }else {
				 System.out.println("账号密码不正确");
			 }
		 
	}
}
