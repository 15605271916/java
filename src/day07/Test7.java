package day07;

public class Test7 {

	final int a=0;
	int c=0;
	
	public static void show1() {
		System.out.println("方法1");
	}
	
	public final static void show2() {
		System.out.println("方法2");
	}

	public static void main(String[] args) {
		final int b;//局部变量可以先不赋值 
		
		final Test7 t=new Test7();
		
		t.c=20;
		
		show1();
		show2();
	}
}
