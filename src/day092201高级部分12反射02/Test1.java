package day092201高级部分12反射02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {

		Class c1= Child.class;
		
		Field[] fs=c1.getFields();
		
		System.out.println(fs.getClass());
		
		for (Field field : fs) {
			
			System.out.println(field.getName());
			
		}
		
		fs=c1.getDeclaredFields();
		
		System.out.println(fs.length);
		
		for (Field field : fs) {
			
			System.out.println(field.getName());
			
		}
		
		System.out.println("==========");
		
		Method[] ms=c1.getMethods();
		
		System.out.println(ms.length);
		
		for (Method method : ms) {
			
			System.out.println(method.getName());
			
		}
		
		ms=c1.getDeclaredMethods();
		
		System.out.println(ms.length);
		
		for (Method method : ms) {
			
			System.out.println(method.getName());
			
		}
		
		System.out.println("==========");
		
		Method m1=c1.getDeclaredMethod("show4");
		
		System.out.println(m1.getModifiers());
		
		System.out.println(m1.getReturnType().getName());
		
		System.out.println(m1.getParameters());
		
		System.out.println(m1.getParameterCount());
		
		m1=c1.getDeclaredMethod("show4",int.class);
		
		System.out.println(m1.getParameterCount());
		
		m1=c1.getDeclaredMethod("show4",int.class,String.class);
		
		System.out.println(m1.getParameterCount());
		
		System.out.println("==========");
		
		m1=c1.getDeclaredMethod("show4");
		
		m1.setAccessible(true);
		
		Child c=new Child();
		
		Object rt= m1.invoke(c);
		
		System.out.println(rt);
		
		rt=c.show4();
		
		System.out.println(rt);
		
		System.out.println("==========");
		
		Constructor[] cs=c1.getConstructors();
		
		System.out.println(cs);
		
		System.out.println(cs.length);
		
		cs=c1.getDeclaredConstructors();
		
		System.out.println(cs.length);
		
		for (Constructor cc : cs) {
			
			System.out.println("开始");
			
			System.out.println(cc.getName());
			
			System.out.println(cc.getParameterCount());
			
			for (Class ccc : cc.getParameterTypes()) {
				
				System.out.println(ccc.getName());
				
			}
			
			System.out.println("结束");
			
		}
		
		System.out.println("==========");
		
		Constructor cint=c1.getDeclaredConstructor(int.class);
		
		cint.setAccessible(true);
		
		System.out.println(cint.newInstance(100));
		
		cint=c1.getDeclaredConstructor(String.class);
		
		System.out.println(cint.newInstance("zhangsan"));
		
		cint=c1.getDeclaredConstructor(String.class,int.class);
		
		System.out.println(cint.newInstance("zhangsan",200));
		
		cint=c1.getDeclaredConstructor();
		
		System.out.println(cint.newInstance());
		
		Object obj=cint.newInstance();
		
		System.out.println(obj.getClass().getMethod("show4", int.class).invoke(obj, 300));
		
		
		
		
		
		
	}

}
