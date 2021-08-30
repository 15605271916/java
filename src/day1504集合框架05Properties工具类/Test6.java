package day1504集合框架05Properties工具类;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;

//把文件读取到程序中，让一个对象来接受，这个对象就是Properties，自动匹配

public class Test6 {
	
	//Properties类表示了一个持久的属性集。

	//Properties可保存在流中或从流中加载。属性列表中每个键及其对应值都是一个字符串。 

	//Properties经常从属性文件（扩展名为 .properties）中去加载数据。属性文件通常用于保存配置信息，

	//以键值对的形式存放信息，中文只能以unicode编码的方式保存。

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file=new File(URLDecoder.decode(Test6.class.getResource("").getPath())+"my.properties");
		
		Reader reader=new FileReader(file);
		
		BufferedReader br=new BufferedReader(reader);
		
		String kv="";
		while((kv=br.readLine())!=null) {
			System.out.println(kv.split("=")[0]+"-"+kv.split("=")[1]);
		}
		
		System.out.println("==========");
		
		Properties props=new Properties();
		
		props.load(Test6.class.getResourceAsStream("my.properties"));
		
		System.out.println(props.get("id"));
		System.out.println(props.get("name"));
		System.out.println(props.get("sex"));
		

	}

}
