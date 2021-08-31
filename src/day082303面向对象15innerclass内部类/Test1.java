package day082303面向对象15innerclass内部类;

import day082303面向对象15innerclass内部类.Outer.Inner;
import day082303面向对象15innerclass内部类.Outer.Inner2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Outer outer=new Outer();
			outer.show1();
			
			System.out.println("在外部实例化非静态内部类");
			
			Inner inner=outer.new Inner();
			
			System.out.println(inner.b);
			
			//可以通过某种手段访问内部类中的私有变量
			inner.show2();
			
			System.out.println("在外部实例化静态内部类");

			Inner2 inner2=new Outer.Inner2();
			inner2.show1();
			
			System.out.println(Outer.Inner2.e);
			
	}

}
