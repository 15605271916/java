package day7;

//递归调用。自己调用自己，类似于循环
public class Test6 {
	
	static int num2 = 0;

	public static void show(int i) {
		System.out.println("之前执行" + i);

		num2 += i;

		if (i == 1) {
			return;
		} else {
			show(--i);
		}
		System.out.println("之后执行" + i);
	}

	public static int add(int i) {

		if (i == 1) {
			return 1;
		} else {
			int num3 = add(i - 1) + i;
			return num3;
		}
	}

	public static void main(String[] args) {
		show(10);

		// 计算1-10的和,num是循环方法，num2是递归调用，num3是返回值。同理。10的阶乘也是同样以上三种方法
		int num = 0;
		for (int i = 1; i <= 10; i++) {
			num += i;
		}
		int num3 = add(10);

		System.out.println(num);
		
		System.out.println(num2);
		
		System.out.println(num3);

	}
}
