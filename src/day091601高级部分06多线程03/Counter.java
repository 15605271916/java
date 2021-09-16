package day091601高级部分06多线程03;

public class Counter {

	private Object lock1 = new Object();

	private Object lock2 = new Object();

	public void show1() {

		synchronized (lock1) {

			System.out.println(Thread.currentThread().getName() + ":拿到了锁1");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName() + ":拿到了锁2");
			}
			System.out.println(Thread.currentThread().getName() + ":可以做事情了");

		}
	}

	public void show2() {

		synchronized (lock2) {

			System.out.println(Thread.currentThread().getName() + ":拿到了锁2");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized (lock1) {
				System.out.println(Thread.currentThread().getName() + ":拿到了锁1");
			}

			System.out.println(Thread.currentThread().getName() + ":可以做事情了");

		}
	}

}
