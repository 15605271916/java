package day1003面向对象15innerclass内部类;


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
//		IA a=new A();
//		a.show1();
IA a=new IA() {
			
			public void show1() {

					System.out.println("匿名内部类show1");
				
			}
		};
		
		IA a2=new IA() {
			
			@Override
			public void show1() {

					System.out.println("匿名内部类show12");
				
			}
		};
		
		
		a.show1();
		a2.show1();
		
	}

}
