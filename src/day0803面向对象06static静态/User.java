package day0803面向对象06static静态;

public class User {
	public static int a=1;
	public int e=5;
	
	static {
		int b=2;
		System.out.println(b);
	}
	
	{
		int c=3;
		System.out.println(c);
	}
	
	public User() {
		int d=4;
		System.out.println(d);
	}
}
