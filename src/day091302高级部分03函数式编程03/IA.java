package day091302高级部分03函数式编程03;

public interface IA {
	
	public void m1();
	
	public default void m2() {
		
		System.out.println("m2");
		
	}

	public static void m3() {
		
		System.out.println("m3");
		
	}
}
