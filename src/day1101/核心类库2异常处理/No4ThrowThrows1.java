package day1101.核心类库2异常处理;

import java.util.Scanner;

public class No4ThrowThrows1 {

	public void show1() {

		Exception e = null;

		Scanner sc = new Scanner(System.in);

		String info = sc.nextLine();

		if (info.equals("1")) {
			e = new Exception("yichang 1");
		} else if (info.equals("2")) {
			e = new Exception("yichang 2");
		}

		try {
			// 自动抛出异常
			System.out.println(1 / 0);

			// 手动抛出异常
			if (e != null) {
				throw e;
			}
			System.out.println("show1()");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	public void show2() {
		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("在内部处理异常");
		}
		System.out.println("show2结束");
	}

	public static void main(String[] args) {
		System.out.println("开始");

		No4ThrowThrows1 t = new No4ThrowThrows1();

		try {
			t.show2();
		} catch (Exception e) {
			System.out.println("调用show2的时候异常");
			System.out.println(e.getMessage());
		}

		System.out.println("结束");
	}
}
