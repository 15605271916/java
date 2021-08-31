package day082702核心类库15打印流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file=new File("C:\\myfiles\\b/a3.txt");
		
		PrintWriter out=new PrintWriter(file);
		
		out.print(1213);
		out.print("tangzeyu");
		
		out.append("qwer");
		
		out.write("zhangsan");
		out.write(97);//a
		
		out.flush();
		
	}

}
