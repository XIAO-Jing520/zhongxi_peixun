/**
 * 
 */
package com.zx.练习;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 定义User类，通过User类可以用于封装用户的信息
 */
public class User {
	
	//定义实例成员变量
	public int account;//账号
	public int password;//密码
	public String name;//真实姓名
	public int age;//年龄
	public char sex;//性别


	//定义无参构造器
	public User() {


	}


	//定义有参构造器
	public User(int account, int password,String name, int age, char sex) {
        this.name = name;
		this.account = account;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}
	
	
	
	

}
