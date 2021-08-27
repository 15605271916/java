package day0803面向对象06static静态;

public class Test2 extends User{
		int a=1;
		static int b=2;
	static {
		int c=3;
		System.out.println("静态代码块"+c);
	}
	
	{
		int d=4;
		System.out.println("代码块3"+d);
	}
	
	{
		int e=5;
		System.out.println("代码块1"+e);
	}
	
	public Test2() {
		int f=6;
		System.out.println("无参数的构造函数"+f);
	}
	
	public Test2(String name) {
		int g=7;
		System.out.println("带参数的构造函数"+g);
	}
	
	{
		System.out.println("代码块2");
	}

	public static void main(String[] args) {
		System.out.println("调用了主函数");
		
		Test2 t1=new Test2();
		Test2 t2=new Test2();
		Test2 t3=new Test2("qwer");
		Test2 t4=new Test2("qwer");
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}
