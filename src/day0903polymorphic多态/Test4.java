package day0903polymorphic多态;

public class Test4 extends C{
	
	public void show1(int a) {
		System.out.println("test4.show1");
	}
	
//	public void show2() {
//		System.out.println("test4.show2");
//	}
	
	@Override
	public int show3() {
		// TODO Auto-generated method stub
		return super.show3();
	}

	@Override
	public Object show4() {
		return "qwer";
	}

	@Override
	public String show5() {
		return super.show5();
	}
	
	
	public static void main(String[] args) {
		Test4 t=new Test4();
		t.show1();
		t.show1(10);
		
		System.out.println("==========");
		
		t.show2(0);
		
		
	}


	

}
