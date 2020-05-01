/**
 * 
 */
package com.zx.网络通信02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 客户端发送数据给服务端，同时获取服务端发送的信息
 */
public class SocketApp {

	public static void main(String[] args) {

		  try {
			 
			  //创建客户端套接字   需要指定  ip信息以及端口号信息
			  Socket socket = new Socket("172.16.1.200", 6666);
			  //通过客户端套接字获取字节输出流，利用该输出流就可以与服务端进行通信
			  DataOutputStream  out = new DataOutputStream(socket.getOutputStream());
			  //往服务器输出信息
			  out.writeUTF("hello!");
			  
			  out.flush();
			  
			  
			  //通过输入流获取服务端返回的信息
			  DataInputStream in = new DataInputStream(socket.getInputStream());
			  String message = in.readUTF();
			  System.out.println("服务端说:"+message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
