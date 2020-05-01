/**
 * 
 */
package com.zx.文件字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class FileWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args){
		//创建字符输出流对象
		try(FileWriter fileWriter = new FileWriter("src/jdbc.txt")){
			
			fileWriter.write(97);
			
			fileWriter.write("97");
			
			

		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
