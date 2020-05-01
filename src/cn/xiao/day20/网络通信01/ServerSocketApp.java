/**
 * 
 */
package com.zx.网络通信01;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 开发网络通信服务端
 */
public class ServerSocketApp {

	public static void main(String[] args) {

		  try {
			  //创建服务端套接字  并绑定 6666  端口号 
	          ServerSocket   serverSocket = new ServerSocket(6666);
	          
	          //侦听并接受到此套接字的连接
	          Socket socket = serverSocket.accept();
	          //根据 客户端套接字获取输入流信息
	          InputStream inputStream = socket.getInputStream();
	          
	          DataInputStream in = new DataInputStream(inputStream);

	          String message = in.readUTF();
	          
	          System.out.println("客户端发送过来的消息:"+message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
