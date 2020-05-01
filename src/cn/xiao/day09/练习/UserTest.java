/**
 * 
 */
package com.zx.练习;

import java.util.Scanner;

/**
 * @author 罗春龙 QQ：584614151 V 1.0
 */
public class UserTest {

	// 定义数组 用于扮演 ‘数据库’的角色
	public static User[] userList = new User[3];
	public static Scanner scanner = new Scanner(System.in);

	static {
		User u = new User(100, 123, "小明", 20, '男');
		userList[0] = u;

		User u2 = new User(101, 1111, "翠花", 21, '女');
		userList[1] = u2;

		User u3 = new User(102, 1234, "赵四", 22, '男');
		userList[2] = u3;

	}

	public static void main(String[] args) {
		

		System.out.println("------欢迎登陆界面-------");

		System.out.println("账号:");
		int account = scanner.nextInt();

		System.out.println("密码:");
		int password = scanner.nextInt();

		String realName = "";

		boolean flag = false;

		for (int i = 0; i < userList.length; i++) {
			if (userList[i].account == account && userList[i].password == password) {
				realName = userList[i].name;
				flag = true;
			}

		}

		if (flag) {
			System.out.println("欢迎【" + realName + "】大驾光临!");
			// 账号密码都在正确
			System.out.println("学生姓名\t\t年龄\t\t性别");
			for (int i = 0; i < userList.length; i++) {
				System.out.println(userList[i].name + "\t\t" + userList[i].age + "\t\t" + userList[i].sex);
			}

			System.out.println("请输入相关指令：D(删除用户)  U(更新用户信息)  R(查看用户信息)");
			String zhiLing = scanner.next();

			// 调用方法进行相关操作
			UserTest.opera(zhiLing);

		} else {
			// 提示用户账号密码不正确，请重新输入
			System.out.println("您输入的账号密码不正确，请重新输入");
			// 重新加载main方法进行登录操作
			main(null);
		}

	}

	// 定义方法 ，根据根据用户输入的指令进行相关操作
	public static void opera(String zl) {
		switch (zl) {
		case "D":
			System.out.println("删除用户");
			break;

		case "U":
			System.out.println("更新用户");
			break;

		case "R":
			UserTest.getUserInfo();
			break;

		default:

			System.out.println("您输入的指令不正确,请重新输入:");
			String zhiLing = scanner.next();
			UserTest.opera(zhiLing);
			break;
		}
	}
	
	
	//定义方法用于删除用户信息
	
	
	
	//定义方法用于更新用户信息
	
	
	
	//定义方法用于查看用户信息   
	public static void getUserInfo() {
		System.out.println("请输入用户的账号：");
		int account = scanner.nextInt();
		User user = null;
		for (int i = 0; i < userList.length; i++) {
			if (userList[i].account == account ) {
			    user = userList[i];
			}

		}
		
		if(user != null) {
			//说明用户存在
			System.out.println("学生账号\t\t学生姓名\t\t年龄\t\t性别");
		
			System.out.println(user.account+"\t\t"+user.name + "\t\t" + user.age + "\t\t" + user.sex);
			
		}else {
			System.out.println("账号输入不正确，请重新输入账号：");
			getUserInfo();
		}
		
	}

}
