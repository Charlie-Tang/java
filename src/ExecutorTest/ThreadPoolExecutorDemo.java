package ExecutorTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorDemo {
	
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable worker = new ExecutorTest1(""+i);
			
			executor.execute(worker);
		}
		//这个是强制将当前进程打断 并将队列中的任务也停止
//		executor.shutdownNow();
		executor.shutdown();
		//Returns true if all tasks have completed following shut down.
		//Note that isTerminated is never true unless either shutdown or shutdownNow was called first.
		while(!executor.isTerminated()) {
			//我个人认为是由于shutdown的方法不返回标志位   其实这两个函数可以合在一起
		}
		System.out.println("Finished all threads");
	}
}
