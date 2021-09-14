package day091301高级部分02函数式编程02;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream s1=Stream.of(3,1,5,9,7,6,4,8);
		
		s1=s1.sorted();
		
		s1.forEach(System.out::print);
		
		System.out.println("");
		
		System.out.println("==========");
		
		Stream s2=Stream.of(3,1,5,9,7,6,4,8);
		
		s2=s2.sorted((a,b)->{
			
			return(Integer)a-(Integer)b;
		});

		s2.forEach(System.out::print);
	}

}
