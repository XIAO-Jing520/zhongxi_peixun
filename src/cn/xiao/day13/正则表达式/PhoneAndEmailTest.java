/**
 * 
 */
package com.zx.正则表达式;

import java.util.Scanner;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 * 正则表达式有两大作用： 1、数据校验   2、数据的抓取
 * 
 * 通过正则表达式校验手机号码以及邮箱号码
 * 
 */
public class PhoneAndEmailTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //校验账号   账号   由6至18个字符（英文、数字、下划线）组成
		
		//定义账号正则表达式
		String accountRegex = "[0-9a-zA-Z_]{6,18}";
		
		Scanner scanner = new Scanner(System.in);
		
		//创建Scanner实例，用于获取用户输入的信息
		/*
        System.out.println("请输入账号：");
        //获取用户输入的信息
        String account = scanner.next();
        if(account.matches(accountRegex)) {
        	System.out.println("恭喜您，账号合法！");
        }else {
        	System.out.println("不好意思，您输入的账号格式不正确，账号只能由【a-zA-Z_0-9】组成！");
        }*/
		
		
		//定义手机号码正则表达式     1  3|4|5|7|9 913980099
		/*String phoneRegex = "1[34579][0-9]{9}";
		System.out.println("请输入手机号码：");
        //获取用户输入的信息
        String phoneNum = scanner.next();
        if(phoneNum.matches(phoneRegex)) {
        	System.out.println("恭喜您，手机号码合法！");
        }else {
        	System.out.println("不好意思，您输入的账号格式不正确！");
        }*/
		
		  /*
			 * 定义邮箱的正则表达式     
			 * 584614151@qq.com    
			 * 584614151@163.com   
			 * luochunlong@163.cn.com 
			 * */
		String emailRegex = "\\w{6,16}@\\w{2,3}(.cn)?.com";
		System.out.println("请输入邮箱：");
        //获取用户输入的信息
        String emailNum = scanner.next();
        if(emailNum.matches(emailRegex)) {
        	System.out.println("恭喜您，邮箱合法！");
        }else {
        	System.out.println("不好意思，您输入的邮箱格式不正确！");
        }
	}

}
