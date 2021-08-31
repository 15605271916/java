package day082601核心类库10文件流;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;

public class Test1 {
	public static void main(String[] args) {
		
		//获取当前整个项目的根目录
		System.out.println(System.getProperty("user.dir"));
		System.out.println("C:\\Users\\Administrator\\eclipse-workspace\\java");
		
		//bin目录
		System.out.println(Test1.class.getResource("/"));
		
		//当前package所在目录（文件名尽量全英文，不然会乱码。见控制台）
		System.out.println(Test1.class.getResource(""));
		
		System.out.println("==========");
		
		String path=URLDecoder.decode(Test1.class.getResource("").getPath());
		
		path="C:\\Users\\Administrator\\eclipse-workspace\\java\\src\\day1301文件流\\";
		File f=new File(path+"a.txt");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.exists());
		
		System.out.println("==========");
		
		System.out.println(f.isAbsolute());//f是绝对路径吗true
		System.out.println(f.isDirectory());//f是文件夹吗true
		System.out.println(f.isFile());//f是文件吗true
		System.out.println(f.isHidden());//f是隐藏的吗false
		
		System.out.println("==========");
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		System.out.println(f.getName());
		System.out.println(f.getParent());
		
		System.out.println("==========");
		
		System.out.println("对目录操作");
		
		path="C:/myfiles/a";
		
		File f4=new File(path);
		
		System.out.println(f4.isFile());
		System.out.println(f4.isDirectory());
		
		path="C:/myfiles/b";
		File f5=new File(path);
		f5.mkdir();
				
	}

}
