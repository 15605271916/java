package day091501高级部分05多线程02;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test4线程同步01 implements Runnable {

	private static List list = new ArrayList();

	private static Vector list2 = new Vector();

	@Override
	public void run() {

		for (int i = 0; i < 2000; i++) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			list.add(i);

			//list2.add(i);

			System.out.println(Thread.currentThread().getName() + "==>" + (i));

		}
	}

	public static void main(String[] args) throws Exception {

		Test4线程同步01 target = new Test4线程同步01();

		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);
		Thread t3 = new Thread(target);
		Thread t4 = new Thread(target);
		Thread t5 = new Thread(target);
		Thread t6 = new Thread(target);
		Thread t7 = new Thread(target);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();

		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();

		System.out.println("结果：" + list.size());
		System.out.println("结果：" + list2.size());

	}

}
