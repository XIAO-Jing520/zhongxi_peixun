/**
 * 
 */
package com.zx.数据流;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class DataOutputStreamTest {


	public static void main(String[] args) {
		
		
		try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("src/jdbc.txt"))){
			
			
			
			dataOutputStream.writeUTF("hello");
			dataOutputStream.writeUTF("world");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
