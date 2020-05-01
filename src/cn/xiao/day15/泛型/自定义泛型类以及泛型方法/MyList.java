/**
 * 
 */
package com.zx.泛型.自定义泛型类以及泛型方法;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 声明类型的时候建议使用字母   E 或者  T
 * E:element
 * T:Type
 */
public class MyList<E> {
	
	Object[]  objs = new Object[10];
	int size = 0;
	
	 
	//添加数据的方法
	 public void  add(E e) {
		 objs[size++] = e;
	 }
	 
	 
	 //获取数据
	 public E get(int index) {
		 
		 return (E)objs[index];
	 }
	 
	 
	 //在方法上声明泛型
	 public static <T> T calc(T a) {
		 
		 return (T)a;
	 }

}
