package day0703.wrapper包装类;
//递归调用。自己调用自己，类似于循环
	class A{
		int i1;
		public A(){
			//super()
			System.out.println("A的构造");
		}
	}
	class A1 extends A{
		int i2;
		public A1(){
			//super()
			System.out.println("A1的构造");
		}
	}
	class A2 extends A1{
		int i3;
		public A2(){
			//super()
			System.out.println("A2的构造");
		}
	}
	class A3 extends A2{
		int i4;
		public A3(){
			//super()
			System.out.println("A3的构造");
		}
	}
	public class Test5 {
		public static void main(String[] args) {
			A3 a3=new A3();
		}
	}


