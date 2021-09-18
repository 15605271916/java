package day091802高级部分10网络编程03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server2 {

	public static void main(String[] args) throws IOException {


		DatagramSocket ds=new DatagramSocket(8080);
		
		byte[] buf=new byte[10];
		
		DatagramPacket dp=new DatagramPacket(buf, 10);

		
		System.out.println("正在接收客户端的数据............");
		
		ds.receive(dp);
		
		System.out.println(new String(dp.getData())+"来自:"+dp.getPort());
		
		
	}

}
