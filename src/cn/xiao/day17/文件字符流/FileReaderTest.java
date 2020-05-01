/**
 * 
 */
package com.zx.文件字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class FileReaderTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		//创建字符输入流对象
		try(FileReader fileReader = new FileReader("src/jdbc.txt")){
			
			char data = (char)fileReader.read();
			System.out.println(data);
			
			char data2 = (char)fileReader.read();
			System.out.println(data2);
			
			//定义数组 ‘竹筒’
			char[] zhuTong = new char[5];
			
			//如果返回  -1 表示没有读取到数据
			int len = fileReader.read(zhuTong);
			String str = new String(zhuTong,0,len);
			System.out.println(str);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
