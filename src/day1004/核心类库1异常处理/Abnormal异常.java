package day1004.核心类库1异常处理;

import java.util.Scanner;

public class Abnormal异常 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("请输入一个数字：");
			String num = sc.nextLine();
			boolean flag = true;
			for (int i = 0; i < num.length(); i++) {
				char c = num.charAt(i);
				if (c < 48 || c > 57) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("结果为:" + (Integer.parseInt(num) + 1));
			} else {
				System.out.println("请输入一个数字！");
			}
		}
	}
}
