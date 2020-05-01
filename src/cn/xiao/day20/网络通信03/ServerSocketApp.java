/**
 * 
 */
package com.zx.网络通信03;

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
 * 服务端不断的接受客户端发送的信息，服务端可以不断的发送数据给客户端
 */
public class ServerSocketApp {

	public static void main(String[] args) {

		  try {
			  //创建服务端套接字  并绑定 6666  端口号 
	          ServerSocket   serverSocket = new ServerSocket(6666);
	          
	          //侦听并接受到此套接字的连接
	          Socket socket = serverSocket.accept();
	        
	          Scanner scanner = new  Scanner(System.in);
	          
	          while(true) {
	        	  
	        	  //根据 客户端套接字获取输入流信息
	        	  DataInputStream in = new DataInputStream(socket.getInputStream());
	              //读取客户端发送的信息
		          String message = in.readUTF();
		          
		          System.out.println("客户端说:"+message);
		          
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
