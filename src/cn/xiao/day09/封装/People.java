/**
 * 
 */
package com.zx.封装;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	private String name;
	private int age;
	private char sex;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		if(age > 0 && age <= 130) {
			this.age = age;
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void setSex(char sex) {
		if(sex == '男' || sex == '女') {
			this.sex = sex;
		}
	}
	
	
	public char getSex() {
		
		return this.sex;
	}
	
	
}
