package day091501高级部分04多线程02;

//优先级

public class Test1线程优先级 extends Thread{
	
	@Override
	public void run() {

		while(true) {
			System.out.println(Thread.currentThread().getName()+"-"+Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Test1线程优先级();
		t1.setName("线程1");
		t1.setPriority(MAX_PRIORITY);//最大max,优先级10
		t1.start();
		
        Thread t2=new Test1线程优先级();
		t2.setName("线程2");
		t2.setPriority(MIN_PRIORITY);//最小min，优先级1
		t2.start();
		
		//CPU空闲情况下，2个线程执行的概率相当，只有在CPU高负载情况下，优先级高的线程比优先级低的线程有更大的概率被执行。

		System.out.println("主线程："+Thread.currentThread().getPriority());//当前线程默认优先级--5
		
	}
	
}
