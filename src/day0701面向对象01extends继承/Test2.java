package day0701面向对象01extends继承;

public class Test2 {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.id=1;
		s.name="zhangsan";
		s.age=20;
		
		System.out.println(s.name+s.age+"岁");
		s.eat();
		s.sleep();
		s.work();
		
		
		
		
	}

}
