/**
 * 
 */
package com.zx.抽象类;

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
	
		//抽象类  不能直接通过  new创建对象
		Connection con = new MyCon();
		con.getConnnection();

	}

}
