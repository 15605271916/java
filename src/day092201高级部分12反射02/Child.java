package day092201高级部分12反射02;

public class Child extends Base {
	
	public Child() {
		
		System.out.println("无参的构造函数");
		
	}
	
	public Child(String a) {
		
		System.out.println("带有一个参数的构造函数"+a);
		
	}
	
	public Child(String a,int b) {
		
		System.out.println("带有两个参数的构造函数"+a+b);
		
	}
	
	private Child(int a) {
		
		System.out.println("私有的构造函数"+a);
		
	} 
	
	private int c;
	
	public String d;
	
	private void show3() {
		
		System.out.println("child show3");
		
	}
	
	public String show4() {
		
		System.out.println("child show4");
		return "qwer";
		
	}
	
	public String show4(int a) {
		
		System.out.println("child show4重载了 integer"+a);
		return "qwer";
		
	}
	
	public String show4(int a,String b) {
		
		System.out.println("child show4重载again");
		
		return "qwer";
		
	}
	
	

}
