package day091602高级部分07多线程04;

public class Test2 implements Runnable {

	private Object lock1 = new Object();
	
	int count=0;

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (Thread.currentThread().getName().equals("a")) {

			synchronized (lock1) {
				
				while (true) {

					System.out.println(Thread.currentThread().getName());

					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					count++;
					if(count==20) {
						
						try {
							lock1.wait(200);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
					
				}
			}
			
		} else {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		synchronized (lock1) {

			System.out.println("==========");
		}

	}

	public static void main(String[] args) {
		
		Test2 target=new Test2();

		Thread t1 = new Thread(target);
		Thread t2 = new Thread(target);

		t1.setName("a");
		t2.setName("b");

		t1.start();
		t2.start();

	}
}
