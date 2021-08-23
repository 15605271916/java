package day08.interface接口;

public class Test1 {

	public static void main(String[] args) {

		A a=new A();
		
		System.out.println(a.num);
		System.out.println(A.num);
		
		a.show1();
		a.show2();
		
		Object a2=new A();
		
		System.out.println(a);
		System.out.println(a2);
		
		Object a3=new Object();
		System.out.println(a3);
		
		System.out.println("==========");
		
		A a10=new A();
		A2 a20=new A2();
		B b30=new B();
		
		show1(a10);
		show1(a20);
		
		show2(b30);
		show2(a10);
		show2(a20);
		
	}
	
	public static void show1(IA a) {
		a.show1();
	}
	
	public static void show2(Object o) {
		System.out.println("调用了"+o);
		
		if(o instanceof A) {
			A a1=(A) o;
			a1.show1();
		}
		if(o instanceof A2) {
			A2 a2=(A2) o;
			a2.show1();
		}
		if(o instanceof B) {
			B b1=(B) o;
			b1.show2();
		}
		
	}

}
