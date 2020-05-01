/**
 * 
 */
package com.zx.网络通信04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 实现信息的读写分离
 */
public class ServerSocketApp {

	public static void main(String[] args) {

		  try {
			  //创建服务端套接字  并绑定 6666  端口号 
	          ServerSocket   serverSocket = new ServerSocket(6666);
	          
	          //侦听并接受到此套接字的连接
	          Socket socket = serverSocket.accept();
	          
	         
	          
	          //开启线程 用于读取  客户端发送过来的信息
	          new MyThread(socket).start();
	        
	          Scanner scanner = new  Scanner(System.in);
	          
	          while(true) {  
		          System.out.println("您说:");
		          //将信息回馈给客户端|发送给客户端
		          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		          out.writeUTF(scanner.next());
	          }

	         
	          
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}


class  MyThread extends Thread{
	
	private Socket socket;
	
	public MyThread(Socket socket) {
		this.socket = socket;
	}

	
	@Override
	public void run() {

		try {
			
			 while(true) {
				 //根据 客户端套接字获取输入流信息
		  	      DataInputStream in = new DataInputStream(socket.getInputStream());
		          //读取客户端发送的信息
		          String message = in.readUTF();
		        
		           System.out.println("客户端说:"+message);
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}

		
        
        
	}
	
	
	   
}
