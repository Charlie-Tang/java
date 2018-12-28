package SynchronizedTest.Synchronizes;

//从这里可以看出来加了static和普通同步的方法几乎是运行的  可以说明该锁是不被共享的。
public class SynchronizedNormalStatic implements Runnable{
	
	static SynchronizedNormalStatic test1 = new SynchronizedNormalStatic();

	@Override
	public void run() {
		//使得方法没有前后顺序
		if (Thread.currentThread().getName().equals("Thread-0")) {
			method1();
		}
		else {
			method2();
		}
	}
	private synchronized void method2() {
		System.out.println(Thread.currentThread().getName()+" 同步方法2开始");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 同步2结束");
	}

	private static synchronized void method1() {
		System.out.println("静态同步方法1 "+Thread.currentThread().getName()+" 开始运行");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 静态同步方法1线程结束");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		t1.start();
		t2.start();
	}
}
