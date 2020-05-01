/**
 * 
 */
package com.zx.网络通信04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 实现信息的读写分离
 */
public class SocketApp {

	public static void main(String[] args) {

		  try {
			 
			  //创建客户端套接字   需要指定  ip信息以及端口号信息
			  Socket socket = new Socket("172.16.1.200", 6666);
			  
			  //开启线程用于读取服务端发送的信息
			  new Th(socket).start();
			  
	          Scanner scanner = new  Scanner(System.in);

			  while(true) {
				  //通过客户端套接字获取字节输出流，利用该输出流就可以与服务端进行通信
				  DataOutputStream  out = new DataOutputStream(socket.getOutputStream());
				  System.out.println("您说:");
				  //往服务器输出信息
				  out.writeUTF(scanner.next());
				  
				  out.flush();
				  
				 
			  }
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}

class Th extends Thread{

	private Socket socket;
	
	public Th(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			 while(true) { 
				  //通过输入流获取服务端返回的信息
				  DataInputStream in = new DataInputStream(socket.getInputStream());
				  String message = in.readUTF();
				  System.out.println("服务端说:"+message);
		   }
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
   
}
