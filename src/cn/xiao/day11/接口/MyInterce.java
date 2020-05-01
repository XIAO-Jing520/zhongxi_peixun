/**
 * 
 */
package com.zx.接口;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public interface MyInterce {
    /*
     * 接口中声明成员变量都是常量  常量就是用 final修饰   常量命名尽量使用大写
     * 接口中声明的成员变量默认会  加上  public  static final
     * 在程序编译的时候，会有被自动加上去public  static final
     * */
	int NUM = 10;
	
	
   
	//在JDK1.8或者更高版本支持在接口中声明静态方法
	public static void play() {
		
	}
	
	//在JDK1.8或者更高版本支持在接口中使用default声明的实例方法
	default void work() {
		System.out.println("-----调用work方法------");
	}
	
	//声明抽象方法
	public abstract void  fly();
	
	//声明抽象方法   abstract可以省略   在程序编译的时候，会有被自动加上去
	public  void  sing();
	
}
