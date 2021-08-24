package day1002.instanceof运算符;

public class Test5 {
	
	public static void show(Object o) {
		if (o instanceof Object) {
			System.out.println("是object");

		} else if (o instanceof User) {
			System.out.println("是用户1");

		} else if (o instanceof User2) {
			System.out.println("是用户2");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u = new User();

		System.out.println(u instanceof Object);

		System.out.println(u instanceof User);

		System.out.println(u instanceof IA);

		System.out.println(u instanceof Person);

		System.out.println("==========");

		if (u instanceof User) {
			System.out.println("是父类");
		} else if (u instanceof Person) {
			System.out.println("是人类");
		} else if (u instanceof Object) {
			System.out.println("是object");
		}
		;

		System.out.println("==========");

		User u3 = new User();
		u3.show1();
		u3.show2();

		Person p3 = u3;
		p3.show1();
		p3.show2();

		System.out.println("==========");
		
		
		
		

	}

}
