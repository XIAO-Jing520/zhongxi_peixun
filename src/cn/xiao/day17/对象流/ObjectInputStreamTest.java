/**
 * 
 */
package com.zx.对象流;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class ObjectInputStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		try(ObjectInputStream  objectInputStream = new ObjectInputStream(new FileInputStream("src/book.txt"));){
			
		    //通过对象输入流对 持久化文件进行序列化操作
			ArrayList<Book> list = (ArrayList<Book>)objectInputStream.readObject();
			System.out.println(list.toString());
			

			
		}catch(Exception e) {
			 e.printStackTrace();
		}
		

	}

}
