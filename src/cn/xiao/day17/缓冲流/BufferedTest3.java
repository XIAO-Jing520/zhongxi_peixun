/**
 * 
 */
package com.zx.缓冲流;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class BufferedTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("E:\\A_zxjy\\233班\\day16\\04-TreeSet集合讲解.mp4"));
				//字节输出流               new FileOutputStream(文件路径,是否追加)
				BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("E:\\A_zxjy\\233班\\04-TreeSet集合讲解.mp4"));) {
				
				long s = System.currentTimeMillis();
			
				int len = -1;
				
				byte[] zhuTong = new byte[8192];
				
				while((len = inputStream.read(zhuTong)) != -1) {
					//将数据写出至指定的文件中  读多少  写多少
					output.write(zhuTong,0,len);
				}
			
				long e = System.currentTimeMillis();
				System.out.println("共耗时:"+(e- s)+"毫秒");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}
			

		}

	}
