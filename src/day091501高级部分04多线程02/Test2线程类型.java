package day091501高级部分04多线程02;

//线程类型
//线程类型分两类：1用户线程，2守护线程（精灵线程）

public class Test2线程类型 extends Thread{
	
	

	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		System.out.println(Thread.currentThread().getName());
		
		}
	}

	public static void main(String[] args) {

		Thread t1=new Test2线程类型();
		
		t1.setDaemon(true);
		
		t1.start();
		
		for (int i = 0; i <10; i++) {
			
			Thread t=new MyThread();
			
			t.setName("线程"+i);
			
			t.start();
			
			System.out.println(Thread.currentThread().getName());
		}

	}

}
