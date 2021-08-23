package day10.innerclass内部类;

//类的内部，而不是同一个文件内
//也是一种类
//分为非静态内部类、静态内部类，匿名内部类
public class Outer01 {

	// 成员变量
	private static int a = 1;
	static int b = 2;
	protected static int c = 3;
	public static int d = 4;
	public static int e = 5;

	// 成员内部类
	public class Inner {
		private int a = 11;
		int b = 22;
		protected int c = 33;
		public int d = 44;
		//public static int e=55;
		
		public void show2() {

			// 访问外部的
			System.out.println(Outer01.a);
			System.out.println(Outer01.b);
			System.out.println(Outer01.c);
			System.out.println(Outer01.d);
			System.out.println(Outer01.e);
		}
	}

	public void show1() {

		// 访问内部的
		Inner i = new Inner();

		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(i.c);
		System.out.println(i.d);
		i.show2();
	}
	
	
	//静态内部类
	public static class Inner2{
		
		private int a=111;
		int b=222;
		protected int c=333;
		public int d=444;
		public static int e=555;
		
		public void show1() {
			Outer01 outer=new Outer01();
			System.out.println(outer.a);
			System.out.println(outer.b);
			System.out.println(outer.c);
			System.out.println(outer.d);
			System.out.println(outer.e);
			
		}
		
	}
	
	
	
	
	
	
	
}
