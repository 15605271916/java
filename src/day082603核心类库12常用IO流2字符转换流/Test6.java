package day082603核心类库12常用IO流2字符转换流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class Test6 {

	public static void main(String[] args) throws FileNotFoundException, Exception {
		
		File file=new File("C:\\myfiles\\b/a2.txt");
		
		InputStream in=new FileInputStream(file);
		
		Reader reader=new InputStreamReader(in,"utf-8");
		
		char[] cbuf=new char[20];
		
		System.out.println(reader.read(cbuf));
		
		System.out.println(new String(cbuf));
		
		
	}

}
