package SynchronizedTest;

//类锁的第一种形式 static形式
//将synchronized加在static上
public class SynchronizedClassStatic implements Runnable{
	
	static SynchronizedClassStatic test1 = new SynchronizedClassStatic();
	static SynchronizedClassStatic test2 = new SynchronizedClassStatic();
	public static void main(String[] args) {
		
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test2);
		
		t1.start();
		t2.start();
		
	}

	@Override
	public void run() {
		method();
	}
	//static synchronized两个联用可以保证该方法的全局同步
	private static synchronized void method() {
		System.out.println(Thread.currentThread().getName()+" 开始执行");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 结束");
		
	}

}
