package day1401核心类库14序列化反序列化;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		User u=new User();
		u.setId(1);
		u.setName("zhangsan");
		
		File f=new File("C:\\myfiles\\b/a2.txt");
		
		OutputStream out=new FileOutputStream(f);
		ObjectOutputStream oout=new ObjectOutputStream(out);
		oout.writeObject(u);
				
		
		
		
		
		
		
	}

}
