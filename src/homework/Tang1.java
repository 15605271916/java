package homework;

import java.util.Scanner;

public class Tang1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = true;

		Scanner scan = new Scanner(System.in);
		String[] n = new String[1];

		float[] p = new float[1];

		byte[] num = new byte[1];

		String str;
		String s2;
		int i = 0;
		do {
			System.out.println("请输入商品名");
			String name = scan.next();
			n[i] = name;
			
			if (name.equals("结账")) {
				b1 = false;
				break;
			}
			
			String[] n1 = new String[n.length + 1];
			for (int i1 = 0; i1 < n.length; i1++) {
				n1[i1] = n[i];
			}
			n = n1;

			System.out.println("请输入单价");
			float price = scan.nextFloat();
			p[i] = price;
			float[] p1 = new float[p.length + 1];
			for (int i1 = 0; i1 < p.length; i1++) {
				p1[i1] = p[i1];
			}
			p = p1;

			System.out.println("请输入数量");
			byte number = scan.nextByte();
			num[i] = number;
			byte[] num1 = new byte[num.length + 1];
			for (int i1 = 0; i1 < num.length; i1++) {
				num1[i1] = num[i1];
			}
			num = num1;
			i++;
			
		} while (b1);
		
		float[] sum = new float[n.length];

		for (int c = 0; c < n.length; c++) {
			sum[c] = p[c] * num[c];
		}

		System.out.println("请输入付款值：");
		float pay = scan.nextFloat();

		System.out.println("*******消费清单*******");
		System.out.println("物品名称" + "\t" + "单价" + "\t" + "数量" + "\t" + "小计");
		for (int i3 = 0; i3 < n.length - 1; i3++) {
			System.out.println(n[i3] + "\t" + p[i3] + "\t" + num[i3] + "\t" + sum[i3]);
		}

		float sum1 = 0f;

		for (int i4 = 0; i4 < sum.length; i4++) {
			sum1 = (float) (sum1 + sum[i4]);
		}
		System.out.println("总价：" + sum1);
		System.out.println("付款：" + pay);
		System.out.println("找零：" + (pay - sum1));

	}
}
