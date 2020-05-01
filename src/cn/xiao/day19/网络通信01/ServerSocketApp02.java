/**
 * 
 */
package com.zx.网络通信01;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 罗春龙
 * QQ：584614151
 * V 1.0
 * 开发网络通信服务端
 */
public class ServerSocketApp02 {

	public static void main(String[] args) {

		  try {
			  //创建服务端套接字  并绑定 6667  端口号 
	          ServerSocket   serverSocket = new ServerSocket(6667);
	          
	          //侦听并接受到此套接字的连接
	          Socket socket = serverSocket.accept();

              System.out.println("客户端一连接成功！");
	          
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
