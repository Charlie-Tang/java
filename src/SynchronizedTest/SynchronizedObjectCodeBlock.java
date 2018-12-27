package SynchronizedTest;

//使用synchronized的代码块形式(对象锁)
public class SynchronizedObjectCodeBlock implements Runnable{
	static SynchronizedObjectCodeBlock test = new SynchronizedObjectCodeBlock();
	Object lock1 = new Object();
	Object lock2 = new Object();
	@Override
	public void run() {
		//同步代码块能够使线程串行执行
		synchronized (lock1) {
			System.out.println("lock1部分");
			System.out.println("我是对象锁的代码块形式"+Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//可以在同步代码块中设置断点查看线程状态
			System.out.println(Thread.currentThread().getName()+" lock1运行结束");
		}
		
//		synchronized (lock2) {
//			System.out.println("lock2部分");
//			System.out.println("我是对象锁的代码块形式"+Thread.currentThread().getName());
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName()+" lock2运行结束");
//		}
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		
		while(t1.isAlive()||t2.isAlive()) {
			
		}
		System.out.println("线程结束");
		
	}
	
}
