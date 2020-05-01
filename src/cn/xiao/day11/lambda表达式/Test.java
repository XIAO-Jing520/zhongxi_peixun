/**
 * 
 */
package com.zx.lambda表达式;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		  Peo p = new Peo() {

			@Override
			public void play(String name) {
				// TODO Auto-generated method stub
				System.out.println(name+"===调用play方法===");
			}  
		  };
		  
		  
		  //Peo pe = (String name)->{ System.out.println("===调用play方法===");};
		  
		  //Peo pe = (String name)->System.out.println("===调用play方法===");
		  
		  //如果存在多个形参 那么  () 不能省略   如果方法中有多行代码  那么 {} 不能省略
		  Peo pe = name->{System.out.println(name + "===调用play方法===");
		  
		  System.out.println(name + "===调用play方法===");};
		  
		  pe.play("jack");

	}

}
