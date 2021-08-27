package day1401核心类库14序列化反序列化;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Test2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		File f=new File("C:\\myfiles\\b/a2.txt");
		
		InputStream in=new FileInputStream(f);
		
		ObjectInputStream oin=new ObjectInputStream(in);
		
		Object obj=oin.readObject();
		
		System.out.println(obj);
		
		User user=(User) obj;
		
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getSex());
		
		
		
		
		
	}

}
