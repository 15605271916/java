package day091601高级部分06多线程03;

public class Test1死锁 {

	public static void main(String[] args) {

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {

			c.show1();

		});

		Thread t2 = new Thread(() -> {

			c.show2();

		});
		
		t1.setName("线程1");
		t2.setName("线程2");
		t1.start();
		t2.start();

	}

}
