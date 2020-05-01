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
public class FileCutTest {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws IOException{
		
		 FileReader fileReader = null;
		 FileWriter fileWriter = null;
		  String f1 = "src/jdbc.txt";
		  String f2 = "src/jdbc02.txt";
		try{
			
			  fileReader = new FileReader(f1);
			  fileWriter = new FileWriter(f2);
			
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
		}finally {
			
			fileReader.close();
			fileWriter.close();
			
			 //调用方法进行文件剪切操作
			fileCut(f1,f2);
			
			
		}

	}
	
	
	//定义方法用于进行文件剪切
	public static void fileCut(String f1,String f2) {
		
		//获取源文件以及复制后的文件的大小
		 
		 File file = new File(f1);
		 File file02 = new File(f2);
		 
		 if(file.length() == file02.length()) 
		 file.delete();
	}

}
