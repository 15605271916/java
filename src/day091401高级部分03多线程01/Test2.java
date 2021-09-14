package day091401高级部分03多线程01;


public class Test2 implements Runnable {

	public static void main(String[] args) {
		
		Test2 test=new Test2();
		Thread t1=new Thread(test,"线程1");
		
		t1.start();
		
		Thread  t2=new Thread(test,"线程2");
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

	@Override
	public void run() {

		while (true) {
			
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
