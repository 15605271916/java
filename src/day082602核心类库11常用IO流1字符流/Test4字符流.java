package day082602核心类库11常用IO流1字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test4字符流 {

	public static void main(String[] args) throws Exception {

		File file=new File("C:\\myfiles\\b/a2.txt");
		
		Reader reader=new FileReader(file);
		
		char[] cbuf=new char[20];
		int num=reader.read(cbuf);
		
		for (char c : cbuf) {
			System.out.print(c);
		}
		
		System.out.println("");
		String str=new String(cbuf,0,num);
		System.out.println(str);
		
		//转码，通过字节处理
		
	}

}
