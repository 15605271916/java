package day091803高级部分11反射01;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws Exception {

		Class c1=User.class;
		
		User u=new User();
		
		System.out.println(u.name);
		System.out.println(u.age);

		Scanner sc=new Scanner(System.in);
		
		System.out.println("请输入属性名");
		
		String fieldName="age";
		
		Field f1=c1.getField(fieldName);
		
		System.out.println(f1.get(u));
		
		u.name="qwer";
		
		System.out.println(f1.get(u));
		
		f1.set(u, 20);
		
		System.out.println(u.name);
		System.out.println(u.age);
		
		System.out.println("==========");
		
		f1=c1.getDeclaredField("id");
		f1.setAccessible(true);
		f1.set(u, 100);
		
		System.out.println(f1.get(u));
		
	}

}
