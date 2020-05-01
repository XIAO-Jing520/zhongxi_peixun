/**
 * 
 */
package com.zx.io.inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class FileCopyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try(InputStream inputStream = new FileInputStream("E:\\A_zxjy\\233班\\day16\\04-TreeSet集合讲解.mp4");
			//字节输出流               new FileOutputStream(文件路径,是否追加)
			OutputStream output = new FileOutputStream("E:\\A_zxjy\\233班\\04-TreeSet集合讲解.mp4");) {
			
			
			//定义 数组 ‘竹筒’
			byte[] zhuTong = new byte[1024 * 1024 * 10];
			//定义变量用于记录读取到的长度
			int len = 0;
			
			while((len = inputStream.read(zhuTong)) != -1) {
				
				//将数据写出至指定的文件中  读多少  写多少
				output.write(zhuTong,0,len);
			}
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		

	}

}
