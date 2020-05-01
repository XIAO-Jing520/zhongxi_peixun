/**
 * 
 */
package com.zx.打印流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class PrintWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		
		//创建字节打印流对象
		try(PrintWriter ps = new PrintWriter(new FileOutputStream("src/jdbc.txt"))){
			//将信息写出至指定的文件   print方法底层会继续调用  write方法
			ps.print("hello");
			ps.print(97);
			ps.print('a');
			
			ps.write(97);
			
			/*所有的输出流  写出数据的时候，为了防止数据在缓冲区中，
			最好调用 flush方法进行刷新操作，当然调用close方法关闭流的时候，会自动调用flush方法进行刷新操作*/
		}catch(Exception e) {
			e.printStackTrace();
		}
	
			
	   
		
		
	

	}

}
