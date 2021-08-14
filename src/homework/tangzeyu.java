package homework;

import java.util.Scanner;

public class tangzeyu {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		float price1=5.3f;
		System.out.println("手套单价为："+price1);
		System.out.println("请输入手套购买数量：");
		String a=sc.nextLine();
		Integer num1 = new Integer(a);
		System.out.println("原价合计："+price1*10*num1/10+"元");
		System.out.println("==========");
		float price2=8.9f;
		System.out.println("袜子单价为："+price2);
		System.out.println("请输入袜子购买数量：");
		String b=sc.nextLine();
		Integer num2 = new Integer(b);
		System.out.println("8折后合计："+price2*num2*10*0.8/10+"元");
		System.out.println("==========");
		System.out.println("收入100元后找零：");
		System.out.println((100-(price1*10*num1+price2*10*num2*0.8)/10)*10/107+"元");
		
	}

	
}
