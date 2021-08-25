package day1202.string类;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Char和Byte的转换 {

	public static void main(String[] args) {

		System.out.println(Charset.defaultCharset());//UTF-8
		
		String str3="123abc中国";
		char[] c=str3.toCharArray();
		System.out.println(c);
		for (char d:c) {
			System.out.println(d);
		}
		
		System.out.println("==========");
		
		char[] c2= {'a','b','1','中'};
		String str4=new String(c2);
		System.out.println(str4);
		
		System.out.println("==========");
		
		String str5="a1中";
		byte[] b1 = null;
		try {
			b1 = str5.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b1);
		
		String str6 = null;
		try {
			str6 = new String(b1,"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(str6);
		
	}

}
