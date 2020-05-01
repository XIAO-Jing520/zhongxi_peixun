/**
 * 
 */
package com.zx.转换流;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

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
		// TODO Auto-generated method stub
	
		try(InputStreamReader stream = new InputStreamReader(new FileInputStream("C:\\Users\\Administrator\\Desktop\\bj.txt"),"GBK")){
			char data = (char)stream.read();
			System.out.println(data);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
