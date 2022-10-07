package com;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public class TestThread {
	
	public static void main(final String[] arguments) throws InterruptedException{
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(new Task());
		ThreadPoolExecutor pool = (ThreadPoolExecutor)executor;
		pool.shutdown();
	}
	
	static class Task implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Long duration = (long)(Math.random() * 5 );
				System.out.println("RUnning TAsk");
				TimeUnit.SECONDS.sleep(duration);
				System.out.println("TAsk Completed");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
