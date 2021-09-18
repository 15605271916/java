package day091801高级部分09网络编程02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	static Socket s = null;
	static InputStream in = null;
	static ServerSocket ss = null;
	static OutputStream out = null;
	static DataInputStream din = null;
	static DataOutputStream dout = null;
	

	public static void main(String[] args) {

		try {
			ss = new ServerSocket(8090);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("服务器在端口号8090监听客户端的连接");

		while (true) {

			try {
				s = ss.accept();
				in = s.getInputStream();
				din = new DataInputStream(in);
				System.out.println("欢迎：" + s.getPort());
			} catch (Exception e) {
				// TODO: handle exception
			}

			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {

					while (true) {

						try {
							String info = din.readUTF();
							System.out.println("来自客户端：" + info);
							out=s.getOutputStream();
							dout=new DataOutputStream(out);
							
							
							
						} catch (Exception e) {
							System.out.println("退出");
							break;
						}
					}
				}
			});
			
			t.start();
			
			System.out.println("继续等待下一个客户端............");
		}
	}

}
