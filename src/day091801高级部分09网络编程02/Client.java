package day091801高级部分09网络编程02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket s = new Socket("localhost", 8090);

		OutputStream out = s.getOutputStream();

		DataOutputStream dout = new DataOutputStream(out);

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("请输入信息");

			dout.writeUTF(sc.nextLine());
		}

	}

}
