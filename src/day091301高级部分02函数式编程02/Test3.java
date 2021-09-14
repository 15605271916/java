package day091301高级部分02函数式编程02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import day081801面向对象01extends继承01.Student;

public class Test3 {
	
	public static void main(String[] args) {
		
		Stream s1=Stream.of("a","b","c","d");
		
		s1=s1.map((n)->{
			n=((String)n).toUpperCase();
			return n;
		});

		List list1=new ArrayList();
		s1.forEach((n)->{
			list1.add(n);
		});
		
		System.out.println(list1);
		
		System.out.println("==========");
		
	
	}
}
