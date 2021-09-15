package day091501高级部分04多线程02;

public class MyThread extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName());
			
		}	
			
	}
	
	

}
