package homework;

import java.util.Scanner;

public class tangzeyu {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		float price1=5.3f;
		System.out.println("���׵���Ϊ��"+price1);
		System.out.println("���������׹���������");
		String a=sc.nextLine();
		Integer num1 = new Integer(a);
		System.out.println("ԭ�ۺϼƣ�"+price1*10*num1/10+"Ԫ");
		System.out.println("==========");
		float price2=8.9f;
		System.out.println("���ӵ���Ϊ��"+price2);
		System.out.println("���������ӹ���������");
		String b=sc.nextLine();
		Integer num2 = new Integer(b);
		System.out.println("8�ۺ�ϼƣ�"+price2*num2*10*0.8/10+"Ԫ");
		System.out.println("==========");
		System.out.println("����100Ԫ�����㣺");
		System.out.println((100-(price1*10*num1+price2*10*num2*0.8)/10)*10/107+"Ԫ");
		
	}

	
}
