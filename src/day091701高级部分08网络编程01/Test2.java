package day091701高级部分08网络编程01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class Test2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InetAddress local = InetAddress.getLocalHost();

		System.out.println(local);

		System.out.println(local.getCanonicalHostName());

		System.out.println(local.getHostAddress());

		System.out.println(local.isReachable(100));

		System.out.println("==========");

		local = InetAddress.getByName("baidu.com");

		System.out.println(local);

		System.out.println(local.getCanonicalHostName());

		System.out.println(local.getHostAddress());

		System.out.println(local.isReachable(100));
		
		System.out.println("==========");
		
		String path="https://v3.bootcss.com/";
		
		URL url=new URL(path);
		
		System.out.println(path);
		
		System.out.println(url.getAuthority());
		
		System.out.println(url.getPort());//端口号
		
		System.out.println(url.getContent());//内容
		
		System.out.println(url.getDefaultPort());//默认端口号
		
		System.out.println(url.getFile());//文件
		
		System.out.println(url.getHost());//主机
		
		System.out.println(url.getPath());//资源路径
		
		System.out.println(url.getQuery());
		
		System.out.println(url.getProtocol());//协议
		
		System.out.println(url.getRef());//引用
		
		System.out.println(url.openConnection());
		
		System.out.println("==========");
		
		URLConnection conn=url.openConnection();
		
		InputStream in=conn.getInputStream();
		
		System.out.println(in.available());
		
		Reader reader=new InputStreamReader(in);
		
		BufferedReader br=new BufferedReader(reader);
		
		File file=new File("C:\\myfiles\\b\\a.html");
		
		Writer out=new FileWriter(file);
		
		BufferedWriter bw=new BufferedWriter(out);
		
		String line=null;
		
		while((line=br.readLine())!=null) {
			
			bw.write(line);
			
			bw.flush();
			
		}
		
		System.out.println("结束");
	}

}
