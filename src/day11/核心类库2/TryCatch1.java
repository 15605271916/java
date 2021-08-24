package day11.核心类库2;

//try&catch
import java.util.Scanner;

public class TryCatch1 {

	public static void main(String[] args) {

		try {
			TryCatch1 t = new TryCatch1();
		} catch (Throwable e) {
			System.out.println("实例化对象时发生错误");
		}

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.println(1 + 0);
				System.out.println(1 / 0);
				System.out.println(2 + 0);
			} catch (Exception e) {
				System.out.println(3);
				System.out.println("发生算术错误");
				System.out.println(e);
				System.out.println(e.getMessage());
			}

			String a = sc.nextLine();

			if (a.equals("bye")) {
				break;
			}
			System.out.println("over");
		}

	}
}
