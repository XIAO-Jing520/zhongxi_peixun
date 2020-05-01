/**
 * 
 */
package com.zx.文件字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class FileCopyTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		//创建字符输出流对象
		try(    FileReader fileReader = new FileReader("E:\\A_zxjy\\233班\\day17\\02-文件复制和剪切.mp4");
				FileWriter fileWriter = new FileWriter("E:\\A_zxjy\\233班\\\\02-文件复制和剪切.mp4")){
			
			  /* long s = System.currentTimeMillis();
			    int data = -1;
			    while((data = fileReader.read()) != -1 ) {
			    	fileWriter.write(data);
			    }
			   long e = System.currentTimeMillis();
			   System.out.println("耗时:"+(e - s)+"毫秒");*/
			//如上方式每次读写 一个 字符 性能比较慢
			 
			   
			long s = System.currentTimeMillis();
			//定义数组
			char[] zhuTong = new char[1024];
			
			int len = -1;
			
			while((len = fileReader.read(zhuTong)) != -1) {
				fileWriter.write(zhuTong,0,len);
			}
			
			 long e = System.currentTimeMillis();
			 System.out.println("耗时:"+(e - s)+"毫秒");
			 
		
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
