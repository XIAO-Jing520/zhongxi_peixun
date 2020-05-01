/**
 * 
 */
package com.zx.网络通信05;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 实现群聊功能：服务端可以接受N个客户端，并服务端接受到任何一个客户端发送的信息的时候，应该将该信息分发给所有的客户端
 */
public class ServerSocketApp {
	
	//定义集合  用于保存客户端信息
	public static List<Socket> sockets = new ArrayList<>();

	public static void main(String[] args) {

		  try {
			  //创建服务端套接字  并绑定 6666  端口号 
	          ServerSocket   serverSocket = new ServerSocket(6666);

	          
	          while(true) {
	        	  
	        	  //侦听并接受到此套接字的连接
		          Socket socket = serverSocket.accept();
	        	  
		          //将客户端 套接字 存放在集合中
		          ServerSocketApp.sockets.add(socket);
		          
		          System.out.println("当前在线人数:"+ServerSocketApp.sockets.size());
		          
		          //开启线程为 客户端服务
		          new Th(socket).start();;
	        	 
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
				  
				  //1、收取客户端发送的信息
				  //通过输入流获取服务端返回的信息
				  DataInputStream in = new DataInputStream(socket.getInputStream());
				  String message = in.readUTF();
				  
				  //2.将信息转发给每一个客户端
				  for(int i=0;i<ServerSocketApp.sockets.size();i++) {
					  
					  DataOutputStream  out = new  DataOutputStream(ServerSocketApp.sockets.get(i).getOutputStream());
					  //将信息输出至客户端
					  out.writeUTF(message);
					  out.flush();
				  }
				  
				  
			  }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		 

	}
	
	
	
}
