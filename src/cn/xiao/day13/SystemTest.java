/**
 * 
 */
package com.zx;

import java.io.PrintStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class SystemTest {
	
	
	public static void main(String[] args) {
		
	  
	   //System.out获取“标准”输出流
	    PrintStream out = System.out;
       System.out.println(out);
       
       out.print("hello World");
		
		//System.err:“标准”错误输出流
		PrintStream err = System.err;
       
		//err.print("hello World");
		
		//调用 gc 就是通知 Java 虚拟机回收未用对象
		System.gc();
		
		//终止当前正在运行的 Java 虚拟机
		//System.exit(0);
		
		//获取当前时间的毫秒数表现形式
		long startTime = System.currentTimeMillis();
		
		String j = "0";
		
		for(int i=0;i<100000;i++) {
			 j += i;
		}
		
		
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("共耗时:"+(endTime - startTime));
	
		System.out.println("=======程序执行完毕======");
       
	}

}
