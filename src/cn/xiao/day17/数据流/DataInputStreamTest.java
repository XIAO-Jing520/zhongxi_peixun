/**
 * 
 */
package com.zx.数据流;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 */
public class DataInputStreamTest {


	public static void main(String[] args) {
		
		
		try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream("src/jdbc.txt"))){
			
			String data = dataInputStream.readUTF();
			
			System.out.println(" data:"+data);
			
            String data1 = dataInputStream.readUTF();
			
			System.out.println(" data1:"+data1);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
