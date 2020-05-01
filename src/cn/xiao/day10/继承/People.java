/**
 * 
 */
package com.zx.继承;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class People {
	
	private char sex = '男';
	
	public People() {
		super();
	}
	
	public void sing() {
		System.out.println("XX在大声的歌唱，难听的要死！");
		
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	

}
