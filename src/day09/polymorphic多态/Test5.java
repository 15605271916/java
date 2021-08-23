package day9.polymorphic多态;

public class Test5 extends D {

	public int a = 2;

	@Override
	public void show1() {
		System.out.println("test5 show1");
	}

	 public static void main(String[] args) {
		
		Test5 t = new Test5();
		System.out.println(t.a);
		t.show1();
		System.out.println(t);
		
		D t2=t;
		System.out.println(t2);
		System.out.println(t2.a);
		t2.show1();//照理来说应该调用父类，但是实际调用子类
	}

}
