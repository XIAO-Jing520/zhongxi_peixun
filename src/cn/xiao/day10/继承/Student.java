/**
 * 
 */
package com.zx.继承;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Student extends People{
	
	 private String name;
	 
	 private int age;
	 
	 
	 public Student() {
		 //调用父类的getSex方法
		 System.out.println(super.getSex());
	 }
	
	
	  /**
	 * @param name
	 */
	public Student(String name,int age) {
		super();
		 //调用父类的getSex方法
		System.out.println(super.getSex());
		this.name = name;
		this.age = age;
	}




	@Override
	public void sing() {
		  System.out.println("XX在大声的歌唱，贼好听！");
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
	  
	
}
