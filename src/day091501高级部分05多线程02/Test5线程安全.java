package day091501高级部分05多线程02;

public class Test5线程安全 {

	public static void main(String[] args) throws InterruptedException {

		Counter c1 = new Counter();

		Thread t1 = new Thread(() -> {
			c1.add(10);
		});
		t1.start();
		t1.join();

		Thread t2 = new Thread(() -> {
			c1.sub(10);
		});
		t2.start();
		t2.join();

		System.out.println(c1.get());

	}

}
