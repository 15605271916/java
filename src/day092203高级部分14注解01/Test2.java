package day092203高级部分14注解01;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

@Anno04Type(a=100)
public class Test2 {
	
	@Anno02Method(b="bwf")
	public void show1(@Anno03Param String a,@Anno03Param(c="zhangsan") String b) {
		
		System.out.println("show1");
	}
	
	public static void main(String[] args) throws  Exception {
		
		Class c=Test2.class;
		
		Annotation[] ats= c.getAnnotations();
		System.out.println(ats.length);
		
		Anno04Type a1=(Anno04Type) ats[0];
		
		System.out.println(a1);
		
		System.out.println(a1.a());
		
		Method m= c.getDeclaredMethod("show1", String.class,String.class);
		Anno02Method a2= m.getAnnotation(Anno02Method.class);
		
		System.out.println(a2.b());
		
		Parameter p1= m.getParameters()[0];
		Parameter p2= m.getParameters()[1];
		
		Anno03Param a3= p1.getDeclaredAnnotation(Anno03Param.class);
		System.out.println(a3.c());
		
		Anno03Param a4= p2.getDeclaredAnnotation(Anno03Param.class);
		System.out.println(a4.c());
		
	}

}

