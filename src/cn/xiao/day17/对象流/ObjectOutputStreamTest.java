/**
 * 
 */
package com.zx.对象流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 
 */
public class ObjectOutputStreamTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建需要被序列化的对象
		Book book = new Book(1,"php讲义",99.0f,"李刚");
		Book book2 = new Book(2,"html讲义",89.0f,"李刚");
		
		List<Book> list = new ArrayList<>();
		list.add(book);
		list.add(book2);
		
		try(ObjectOutputStream  objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/book.txt"));){
			//将对象序列化至文件中     可以永久保存对象中的信息     该过程称之为序列化
			objectOutputStream.writeObject(list);
			
		}catch(Exception e) {
			 e.printStackTrace();
		}
		

	}

}
