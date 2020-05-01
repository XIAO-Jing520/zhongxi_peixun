/**
 * 
 */
package com.zx.am;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 方法的定义
 */
public class Animal {
	
	
	/*
	 * 定义方法的语法：
	 * [修饰符]  方法的返回值类型    方法名(形参列表){
	 * 
	 *    //方法体
	 * 
	 * }
	 * 
	 * 
	 * */
	
	 //定义程序入口方法
	 public  static  void  main(String[] args) {
		 
		 //调用静态方法
		 //int a = Animal.calc(10, 20);
		 
		 //在当前类中调用静态方法可以省略类名
		 int a = calc(10, 20);
		 System.out.println("a:"+a);
		 
		 
		 Animal animal = new Animal();
		 
		 animal.play("小璐", "PG ONE");
		 
		 
	 }
	 
	
	 
	 
	 //定义  静态的 有返回值的方法
	 public static int calc(int a,int b) {
		 
		 int c = a + b;
		 //将数据返回给调用者     返回的数据必须和声明的返回值类型匹配
		 return c;
	 }
	 
	 
	 //声明实例方法
	 public void  play(String name01,String name02) {
		 System.out.println(name01+" 和  "+ name02+"在愉快的玩耍！");
	 }

}
