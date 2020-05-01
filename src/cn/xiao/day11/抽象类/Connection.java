/**
 * 
 */
package com.zx.抽象类;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 * 定义抽象类，抽象类需要使用abstract关键字修饰
 * 
 */
public abstract class Connection {
	
	  private String name;
	  private static int num;
	  
	  
	  {
		  
	  }
	  
	  static {
		  
	  }
	  
	  public Connection() {
		  System.out.println("-----Connection----");
	  }
	  
	  public void play() {
		  
	  }
	  
	  
     public static void work() {
		  
	  }
     
     /******************************在抽象类中可以定义  成员变量   方法和普通类没区别，但是抽象多了一个能力，声明抽象方法的能力***************************/

     //声明抽象方法    抽象方法需要使用abstract关键字修饰，抽象方法没有方法体
     public abstract void  getConnnection();
     
     // abstract关键字 与   final 以及 static是互斥的，因为抽象方法存在的目的是被子类重写，但是 final以及static修饰的方法不能被重写
    // public abstract final void  abc();
     
     //抽象类总结四个字：有得有失  （得到声明抽象方法的能力，失去了直接通过  new  创建对象的能力）
     
}
