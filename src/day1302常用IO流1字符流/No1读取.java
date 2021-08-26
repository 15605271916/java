package day1302常用IO流1字符流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class No1读取 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("C:\\myfiles\\b/a.txt");

		InputStream in = new FileInputStream(file);

		System.out.println(in);

		// 逐字打印b中的a.txt的内容，但是是写死的方法，不知道文件中有多少内容的情况下，不知道写多少行代码
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());
//		System.out.print((char) in.read());

		System.out.println("==========");

		// 通过循环判断，in.read（）=-1时，代表内容结束，因此当in.read不等于-1时，一直打印
		int c = ' ';
		while ((c = in.read()) != -1) {
			System.out.print((char) c);
		}
		System.out.println(" ");
		System.out.println("==========");

		// 从指定位置开始打印
		file = new File("C:\\myfiles\\b/a.txt");
		in = new FileInputStream(file);
		byte[] b = new byte[3];// 定义一个最大长度为3的缓冲数组
		int i = 0;
		while ((i = in.read(b)) != -1) {
			System.out.println(new String(b, 0, i));
		}

		in.close();
	}

}
