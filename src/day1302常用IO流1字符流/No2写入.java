package day1302常用IO流1字符流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.print.attribute.standard.OutputDeviceAssigned;

public class No2写入 {

	public static void main(String[] args) throws IOException {
		
		File file =new File("C:\\myfiles\\b/a2.txt");//新建文件a2
		
		OutputStream out =new FileOutputStream(file);
		
		//依次写入abcd
		out.write(97);
		out.write(98);
		out.write(99);
		out.write(100);
		
		//写入hello
		byte[] data= {'h','e','l','l','o',};
		out.write(data);
		
		//写入hello tzy
		String str="hello tzy";
		out.write(str.getBytes());
		
		
		
		
		
		
	}

}
