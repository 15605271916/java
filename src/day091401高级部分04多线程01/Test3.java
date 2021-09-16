package day091401高级部分04多线程01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test3 implements Callable<Integer>{

	
	@Override
	public Integer call() throws Exception {

		int sum=0;
		
		for (int i = 0; i < 10; i++) {
			
			if(i%2==0) {
				
				sum+=i;
			}

			Thread.sleep(500);
			
			System.out.println(Thread.currentThread().getName()+"调用了");
			
		}

		return sum;
	}
	
	
	public static void main(String[] args) throws  Exception {

		Test3 test=new Test3();
		
		FutureTask<Integer> target=new FutureTask<Integer>(test);

		Thread t1=new Thread(target,"线程1");
		
		t1.start();
		
		for (int i = 0; i <10; i++) {
			
			System.out.println("当前主线程-之前"+i+Thread.currentThread().getName());
			
			Thread.sleep(200);
			
		}
		
		int sum=target.get();
		
		System.out.println("总和:"+sum);
		
		System.out.println("当前主线程"+Thread.currentThread().getName());
		
		System.out.println("程序结束");

	}

}
