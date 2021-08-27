package day1302核心类库11常用IO流1字符流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3复制文件 {

	public static void main(String[] args) throws IOException {

		long start = System.currentTimeMillis();

		File file = new File("C:\\myfiles\\b/a.txt");
		File file2 = new File("C:\\myfiles\\b/a3.txt");
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream(file2);

		byte[] buff = new byte[1];

		int i = 0;

		while ((in.read(buff)) != -1) {
			out.write(buff);
			out.flush();
		}
		long end = System.currentTimeMillis();

		System.out.println("消耗了：" + (end - start) / 1000 + "秒");

		in.close();
		out.close();
	}
}
