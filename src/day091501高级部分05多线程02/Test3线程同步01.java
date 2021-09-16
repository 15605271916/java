package day091501高级部分05多线程02;

//线程同步

public class Test3线程同步01 implements Runnable {

	volatile int count = 50;// 共享数据 堆中的

	private Object lock = new Object();

	@Override
	public void run() {

		// int count=50;//栈中的

		while (count > 0) {

			// count--;
			synchronized (lock) {

				System.out.println(count-- + "+" + Thread.currentThread().getName());

			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Test3线程同步01 target = new Test3线程同步01();

		Thread t1 = new Thread(target);
		t1.setName("卖票窗口1");
		t1.start();

		Thread t2 = new Thread(target);
		t2.setName("卖票窗口2");
		t2.start();

		Thread t3 = new Thread(target);
		t3.setName("卖票窗口3");
		t3.start();

		Thread t4 = new Thread(target);
		t4.setName("卖票窗口4");
		t4.start();

		Thread t5 = new Thread(target);
		t5.setName("卖票窗口5");
		t5.start();

	}

}
