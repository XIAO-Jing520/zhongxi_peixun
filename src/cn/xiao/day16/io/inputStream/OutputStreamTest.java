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
public class OutputStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try(//字节输出流               new FileOutputStream(文件路径,是否追加)
			OutputStream output = new FileOutputStream("src\\bj.txt",true);) {
			
			//写出一个字节的数据
			output.write(97);
			
			String name = "jack";
			
			//写书一个字节数组的数据
			output.write(name.getBytes());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		

	}

}
