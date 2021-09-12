package day082504核心类库08格式化类01;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class 日期格式化 {
	public static void main(String[] args) {
		
		Date d1=new Date(0);
		
		System.out.println(d1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		System.out.println(sdf.format(d1));
		
		sdf.applyPattern("yyyy/MM/dd");
		
		System.out.println(sdf.format(d1));
		
		System.out.println("==========");
		
		String d2="2021-5-8 20:15:16";
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		
		java.util.Date d3 = null;
		try {
			d3 = sdf.parse(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d3);
		
		
		
		
	}

}
