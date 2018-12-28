package SynchronizedTest.Synchronizes;
//可以看出这里是锁持有方法  当锁一直被持有的时候  其他线程就无法访问该方法
public class NormalSynchronizeTwo implements Runnable{
	
	static NormalSynchronizeTwo test1 = new NormalSynchronizeTwo();

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-0")) {
			method1();
		}
		else {
			method2();
		}
	}
	private synchronized void method2() {
		System.out.println(Thread.currentThread().getName()+" 非同步方法2开始");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 非同步2结束");
	}

	private synchronized void method1() {
		System.out.println("非同步方法1 "+Thread.currentThread().getName()+" 开始运行");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 非同步方法1线程结束");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		t1.start();
		t2.start();
	}
}
