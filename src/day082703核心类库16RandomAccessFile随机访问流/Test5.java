package day082703核心类库16RandomAccessFile随机访问流;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Test5 {

	public static void main(String[] args) throws IOException {

		File file=new File("C:\\myfiles\\b/a.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");
		
		//写入"97""98"，即ab
		raf.write(97);
		raf.write(98);
		
		//从开始端计数，空出一位，写入98，如果已有内容，则覆盖，内容变为ac
		raf.seek(1);
		raf.write(99);
		
		//从开始端计数，空出一、五位，写入"100""101",内容为ac   de（中间三个空格）
    	raf.seek(5);
		raf.write(100);
		raf.write(101);
		
		//====================
		
		raf.writeInt(97);
		raf.writeChars("tzy");
		raf.writeUTF("汤泽宇");
		raf.close();
		
		
	}

}
