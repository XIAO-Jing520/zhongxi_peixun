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
   代码块：
   代码块分成实例代码块和静态代码块
   
   实例代码块的特征：每次创建对象的时候都会经过实例代码块，而且是先经过实例代码块再经过构造器
   
   静态代码块的特征：在类加载的时候就会加载静态代码块，静态代码块只会加载一次|只会执行一次


 */
public class Animal {
	
	   //定义实例成员变量
	   private String name;
	   private int age;
	   
	   
	   /*
	    * 定义实例代码
	    * 1、实例代码块的特征：每次创建对象的时候都会经过实例代码块，而且是先经过实例代码块再经过构造器
	    * 2、什么时候可能会用到实例代码块： 当不同的构造器中出现相同代码的时候，我们可以将相同代码抽取至  实例代码块中，减少代码量
	    *    防止代码重复书写
	    * */
	   {
		   
		   System.out.println("----经过实例代码块---1---");
		   
	   }
	   
	   {
		   System.out.println("----经过实例代码块---2---");
	   }
	   
	   
	   /**
	    * 定义静态代码块
	    * 1、 静态代码块的特征：在类加载的时候就会加载静态代码块，静态代码块只会加载一次|只会执行一次
	    * 2、静态代码块什么时候回用到： 比如后期我们会学习数据库连接池
	    * 
	    * */
	   static {
		   System.out.println("----经过静态代码块---1---");
	   }
	   
	   static {
		   System.out.println("----经过静态代码块---21---");
	   }
	  
	   public Animal() {
		 
		   System.out.println("----无参构造器------");

	   }
	   
	   
	   //定义有参构造器
	   public Animal(String name,int age) {
		   System.out.println("----有参构造器------");

	   }
	
	
	    public static void main(String[] args) {
	    	
	         System.out.println("-----执行main方法---------");
	    	 
	         Animal animal = new Animal();
	         
	         Animal animal2 = new Animal("jack",20);
	         
	    }
	    
	    
	  

}
