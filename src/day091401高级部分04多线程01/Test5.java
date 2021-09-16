package day091401高级部分04多线程01;

public class Test5 extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName());
			
			try {
				if(Thread.currentThread().getName().equals("线程2")) {
					Thread.sleep(5000);
				}else {
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) throws  Exception {
		
		Thread t1=new Test5();
		t1.setName("线程1");
		t1.start();
		
		Thread t2=new Test5();
		t2.setName("线程2");
		t2.start();
		
		System.out.println(Thread.currentThread().getName());
		
		t1.join();
		t2.join(10000);
		
		System.out.println("结束");

	}
}

