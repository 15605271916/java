package day091802高级部分10网络编程03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client2 {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds=new DatagramSocket();
		
		System.out.println(ds.getLocalPort());
		
		String info="qwer";
		
		InetAddress address=InetAddress.getByName("localhost");
		
		DatagramPacket dp=new DatagramPacket(info.getBytes(), info.getBytes().length, address, 8080);

		ds.send(dp);
		

	}

}
