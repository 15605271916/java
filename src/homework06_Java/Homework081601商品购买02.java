package homework06_Java;

import java.util.Scanner;

public class Homework081601商品购买02 {

	public static void main(String[] args) {
		boolean b1 = true;
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[1];
		String[] arrjiage = new String[1];
		String[] arrshuliang = new String[1];
		int i = 0;
		while (b1) {
			System.out.println("请添加购买的商品名称");
			String name = sc.nextLine();

			if (name.equals("结账")) {
				b1 = false;
				System.out.println("选择完毕");
				break;
			}

			System.out.println("请输入购买的商品价格");
			String price = sc.nextLine();
			System.out.println("请输入购买的商品数量");
			String num = sc.nextLine();
			float xiaoji1 = Float.parseFloat(price) * Integer.parseInt(num);
			

			arr[i] = name;
			arrjiage[i] = price;
			arrshuliang[i] = num;

			String[] arr2 = new String[arr.length + 1];
			for (int j = 0; j < arr.length; j++) {
				arr2[j] = arr[j];
			}
			arr = arr2;

			String[] arrjiage2 = new String[arrjiage.length + 1];
			for (int j = 0; j < arrjiage.length; j++) {
				arrjiage2[j] = arrjiage[j];
			}
			arrjiage = arrjiage2;

			String[] arrshuliang2 = new String[arrshuliang.length + 1];
			for (int j = 0; j < arrshuliang.length; j++) {
				arrshuliang2[j] = arrshuliang[j];
			}
			arrshuliang = arrshuliang2;
			i++;

			System.out.println(arrjiage[i]);
			System.out.println(arrshuliang[i]);

		
			System.out.println("您将要购买的商品列表：");
			for (int k = 0; k < arr.length - 1; k++) {
				System.out.println(arr[k]);
			}
			
			System.out.println("您将要购买的单价列表：");
			for (int k = 0; k < arr.length - 1; k++) {
				System.out.println(arrjiage[k]);
			}

			System.out.println("您将要购买的数量列表：");
			for (int k = 0; k < arr.length - 1; k++) {
				System.out.println(arrshuliang[k]);
			}
			xiaoji1+=xiaoji1;
			System.out.println("价格小计：" + xiaoji1);

				

//			for (int p = 0; p < arr.length-1; p++) {
//				System.out.println("购物清单：");
//				System.out.println(arr[p]);
//				System.out.println(arrjiage[p]);
//				System.out.println(arrshuliang[p]);
//			}
			//小计价格
			
//			int[] xiaoji=new int[i];
//			
//			
//			for (int m = 0; m < xiaoji.length; m++) {
//
//				arrjiage[m]=(int)Math.round(Math.random()*40+10);
//
//				arrshuliang[m]=(int)Math.round(Math.random()*40+10);
//
//				xiaoji[m]=arrjiage[m]*arrshuliang[m];
//
//				}
//			
//			System.out.println("单价\t数量\t小计");
//			for (int n = 0; n < xiaoji.length; n++) {
//
//				System.out.println(arrjiage[n]+"   x   "+arrshuliang[n]+"   =\t"+xiaoji[n]);
//
//				}
			
		}

	}
}

//}
