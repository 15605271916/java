package day1203格式化类;

import java.text.DecimalFormat;

public class 数字格式化 {
	public static void main(String[] args) {

		double num1 = 5.123456;

		System.out.println(num1);

		DecimalFormat df = new DecimalFormat("00.00");//取两位小数

		System.out.println(df.format(num1));
		
		df.applyPattern("#.0");//取一位小数
		
		System.out.println(df.format(num1));
		
		df.applyPattern("#.00%");//百分比
		
		System.out.println(df.format(num1));
		
		
		
		
		
		
	}
}
