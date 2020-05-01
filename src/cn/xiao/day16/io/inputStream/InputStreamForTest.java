/**
 * 
 */
package com.zx.io.inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class InputStreamForTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1、可以将需要关闭的资源  放在  try后的小括号中   ，在try代码块执行完毕的时候会自动关闭资源
		 * 2、所有需要被关闭的资源都有一个共同特性就是实现了 AutoCloseable接口
		 * 
		 * 
		 * */
		try(//字节输入流
			InputStream input = new FileInputStream("src\\bj.txt");) {
			
			//定义数组（竹筒）  用于 封装  流中的数据
		    byte[] zhuTong = new byte[10]; 
		    
		    StringBuffer sb = new StringBuffer();
		    
		    //定义变量用于记录读取到的数据的长度
		    int len=0;
		    //如果返回  -1  表示没有读取到数据
		    while((len = input.read(zhuTong)) != -1) {
		    	String str = new String(zhuTong,0,len);
		    	
		    	sb.append(str);
		    	
		    }
		    
		   System.out.println(sb.toString());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		

	}

}
