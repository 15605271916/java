package homework;

import java.util.Scanner;

public class Tang {

	public static void main(String[] args) {
		
		boolean b1 = true;

		Scanner sc = new Scanner(System.in);

		String[] arrayname1 = new String[1];
		int name1 = 0;
		
		String[] arrayprice1 = new String[1];
		int price1 = 0;
		
		String[] arraynum1 = new String[1];
		int num1 = 0;
		

		System.out.println("请输入商品名称");
		arrayname1[name1] = sc.nextLine();
		
		System.out.println("请输入商品价格");
		arrayprice1[price1] = sc.nextLine();
		
		System.out.println("请输入购买数量");
		arraynum1[num1] = sc.nextLine();

		while (!arrayname1[name1].equals("结账")) {
			
			System.out.println("请输入商品名称");
			arrayname1[name1] = sc.nextLine();
			
			System.out.println("请输入商品价格");
			arrayprice1[price1] = sc.nextLine();
			
			System.out.println("请输入购买数量");
			arraynum1[num1] = sc.nextLine();
			
			String[] arrayname2 = new String[arrayname1.length + 1];
			for (int name2 = 0; name2 < arrayname1.length; name2++) {
				arrayname2[name2] = arrayname1[name2];
			}
			arrayname1 = arrayname2;
			name1++;
			
			String[] arrayprice2 = new String[arrayprice1.length + 1];
			for (int price2 = 0; price2 < arrayprice1.length; price2++) {
				arrayprice2[price2] = arrayprice1[price2];
			}
			arrayprice1 = arrayprice2;
			price1++;
			
			String[] arraynum2 = new String[arraynum1.length + 1];
			for (int num2 = 0; num2 < arraynum1.length; num2++) {
				arraynum2[num2] = arraynum1[num2];
			}
			arraynum1 = arraynum2;
			num1++;
			
			
			for (int name3 = 0; name3 < arrayname1.length; name3++) {
				System.out.println(arrayname1[name3]);
			}
			
			for (int price3 = 0; price3 < arrayprice1.length; price3++) {
				System.out.println(arrayprice1[price3]);
			}
			
			for (int num3 = 0; num3 < arraynum1.length; num3++) {
				System.out.println(arraynum1[num3]);
			}
			
			
		} 
			System.out.println(123);
		

//		System.out.println("请输入单价");
//		String price = sc.nextLine();
//		System.out.println("请输入数量");
//		String num0 = sc.nextLine();
//		

//		System.out.println("请输入商品名称");
//		String name1 = sc.nextLine();
//		System.out.println("请输入单价");
//		String price1 = sc.nextLine();
//		System.out.println("请输入数量");
//		String num1 = sc.nextLine();
//		
//		System.out.println("请输入商品名称");
//		String name2 = sc.nextLine();
//		System.out.println("请输入单价");
//		String price2 = sc.nextLine();
//		System.out.println("请输入数量");
//		String num2 = sc.nextLine();
//		
//		String[] array=new String[3];
//		array[0]=name0;
//		array[1]=name1;
//		array[2]=name2;
//
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		

	}
}
