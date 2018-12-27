package ThreadTest.volatileTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*　1）它确保指令重排序时不会把其后面的指令排到内存屏障之前的位置，也不会把前面的指令排到内存屏障的后面；即在执行到内存屏障这句指令时，在它前面的操作已经全部完成；
	2）它会强制将对缓存的修改操作立即写入主存；
	3）如果是写操作，它会导致其他CPU中对应的缓存行无效。
*/
public class volatiletest2 implements Runnable{
	public volatile int m = 0;
	Lock Lock = new ReentrantLock();
	//加上synchronized保证了原子性
//	public synchronized void increase() {
//		m++;
//	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			increase();
		}
		System.out.println(m);
	}
	//加上Lock也可以保证原子性
	private void increase() {
		Lock.lock();
		try {
			m++;
		} finally {
			Lock.unlock();
		}
	}


	public static void main(String[] args) {
		volatiletest2 test = new volatiletest2();
//		Thread t1 = new Thread(test);
//		Thread t2 = new Thread(test);
//		Thread t3 = new Thread(test);
//		t1.start();
//		t2.start();
//		t3.start();
		
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					for (int j = 0; j < 1000; j++) {
						test.increase();
					}
				};
			}.start();
		}
		 while(Thread.activeCount()>1)  //保证前面的线程都执行完
	            Thread.yield();
	        System.out.println(test.m);
	}
		
}
