package day082401核心类库02异常处理02;

import java.util.Scanner;

//try代码块里可能产生多种异常，此时一个try对应多个catch
public class No2TryCatch2 {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);

				System.out.println("请输入");

				String a = sc.nextLine();

				if (a.equals("1")) {
					System.out.println(1 / 0);
				} else if (a.equals("2")) {
					String b = null;
					System.out.println(b.equals("a"));
				} else {
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("空对象错误");
			} catch (ArithmeticException e) {
				System.out.println("算术错误");
			} catch (Exception e) {
				System.out.println("异常");
			}finally {
				System.out.println("不管成功与否都会执行的代码");
			}
		}
		System.out.println("over");
	}
}
