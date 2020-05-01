/**
 * 
 */
package com.zx.泛型.自定义泛型类以及泛型方法;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 声明类型的时候建议使用字母   E 或者  T
 */
public class Test {
	
	 public static void main(String[] args) {
		  MyList<String> myList = new MyList<>();
		  
		  myList.add("jack");
		  //myList.add(10);
		  
		  String name = myList.get(0);
		  
		  
		  MyList<Integer> ages = new MyList<>();
		  ages.add(20);
		  
		  
		  MyList.calc("jack");
	}

}
