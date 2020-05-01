/**
 * 
 */
package com.zx.exception.自定义异常类;

import java.util.Scanner;



/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 早期处理异常的方案
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入账号:");
		
		String name = scanner.next();
		
        System.out.println("请输入密码:");
		
		String pass = scanner.next();
		
		
	     //调用方法进行登录操作
		try {
			boolean flag = login(name,pass);
			if(flag) {
				System.out.println("登录成功！");
			}
		} catch (AccountAndPasswordNotFound e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			main(null);
		}
	}

	/**
	 * @param name
	 * @param pass
	 * 登录操作
	 * @throws AccountAndPasswordNotFound 
	 */
	private static boolean login(String name, String pass) throws AccountAndPasswordNotFound {
		// TODO Auto-generated method stub
		if(name.equals("admin") && pass.equals("123456")) {
			//登录成功！
			return true;
		}else {
			throw new AccountAndPasswordNotFound("您输入的账号或密码有误，请重新输入！");
		}
		
	}

	

}
