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
public class InputStreamTest {

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
			
			
			//获取文件大小  单位 是  字节
			System.out.println("文件大小:"+input.available());
			
			//从输入流中获取数据   该read方法每次只取一滴水|一个字节的数据      如果返回  -1  表示没有读取到数据
			//char data = (char)input.read();
			//System.out.println(data);
			
			
			
			//定义数组（竹筒）  用于 封装  流中的数据
		    byte[] zhuTong = new byte[12];   
		    
		    //将数组‘竹筒’传入read方法中，读取到的数据都会被封装至 ’竹筒‘中，返回值代表读取的长度           如果返回  -1  表示没有读取到数据
		    int length = input.read(zhuTong);
			System.out.println("length:"+length);
			
			String str = new String(zhuTong);
			System.out.println("str:"+str);
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		

	}

}
