/**
 * 
 */
package com.zx.打印流;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class PrintStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//通过System.out获取打印流，通过此方式获取到的打印流是往控制台中打印数据     通过System.out获取到的打印流  不需要关闭，因为只有一份
	/*	PrintStream out = System.out;
		
		out.println(97);
		out.println("hello world!");
		out.close();*/
		
		
		//创建字节打印流对象
		PrintStream ps = new PrintStream("src/jdbc.txt");
			//将信息写出至指定的文件   print方法底层会继续调用  write方法
			ps.print("hello");
			ps.print(97);
			ps.print('a');
			
			ps.write(97);
		
		
		
	

	}

}
