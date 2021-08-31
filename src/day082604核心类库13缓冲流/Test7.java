package day082604核心类库13缓冲流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test7 {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\myfiles\\b/a2.txt");
		
		Reader reader=new FileReader(file);
		
		BufferedReader br=new BufferedReader(reader);
		
		String str="";
		while((str=br.readLine())!=null) {
			
			System.out.println(str);
			
		}
		
		file=new File("C:\\myfiles\\b/a2.txt");
		
		Writer w=new FileWriter(file);
		
		BufferedWriter bw=new BufferedWriter(w);
		
		bw.write("tang");
		bw.newLine();
		bw.write("ze");
		bw.newLine();
		bw.write("yu");
		
		bw.flush();
		
		reader.close();
		w.close();
		br.close();
		
		
		
		
		
		
		
		
	}
}
