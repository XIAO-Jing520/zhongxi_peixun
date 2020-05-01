/**
 * 
 */
package com.zx;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 方法的递归: 递归算法是一种直接或间接地调用自身的算法
 */
public class People {
	
	
	
	     public static void main(String[] args) {
			
	    	   //创建Scanner对象用于获取用户键盘输入的信息
	    	   Scanner scanner = new Scanner(System.in);
	    	   
	    	   //账号必须正整数
	    	   System.out.println("请输入账号：");
	    	   int account = scanner.nextInt();

	    
	    	   //密码必须正整数
	    	   System.out.println("请输入密码：");
	    	   int pass = scanner.nextInt();
	    	   
	    	   
	    	   //假设账号必须为  100   密码：111
	    	   if(account == 100 && pass == 111) {
	    		   System.out.println("恭喜您，登录成功！");
	    	   }else {
	    		   System.out.println("登录失败！");
	    		   //调用main方法重新登录
	    		   People.main(null);
	    	   }
	    	   
		}

}
