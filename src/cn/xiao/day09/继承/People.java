/**
 * 
 */
package com.zx.继承;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 父类
 */
public class People{
	
	public String name;
	private int age;
	protected char sex;
	
	public static int count;
	

	
	public People() {
	}

	public People(String name) {
		this.name = name;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	//定义静态方法
	public static void play() {
		
	} 
	
	

}
