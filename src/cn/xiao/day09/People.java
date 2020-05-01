/**
 * 
 */
package com.zx;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	 public String name;
	 public int age;
	 public char sex;
	 
	 //  count用static修饰  因此会存储在静态域中
	 public static int count = 20;
	 

	 
	 
	 
	public People() {
		
	}




	public People(String name, int age, char sex) {
		
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	 
	 
	 public static void main(String[] args) {
		
		 //变量a   以及  对应的数据  10 都是存储在栈内存
		 int a = 10;
		 
		 People.count = 100;
		 
		 
		 //变量 p 存储在站内存    通过new 创建的对象存放在  堆内存 （实例成员变量属于对象，因此存放在堆内存）
		 People  p = new People("jack",20,'男');
		 
		 int[] arrs = new int[] {10,20,30};
		 
		 clac(arrs);
		 
		 //System.out.println(arrs[1]);
		 
		
	}
	 
	 public static void clac(int[] arrays) {
		 
		 arrays[1] = 100;
		 
		 
	 }

}
