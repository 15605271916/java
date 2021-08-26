package day0701extends继承;

public class Person {
	public int id=1;
	public String name="tang";
	public int age=18;
	
	
	public Person() {
		System.out.println("父类的无参构造函数");
	}
	
	public Person(int id,String name) {
		
		this.id=id;
		this.name=name;
		System.out.println("父类的无参构造函数");
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void work() {
		System.out.println("工作");
	}
}
