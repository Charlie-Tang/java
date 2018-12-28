package SynchronizedTest.Synchronizes;

// 方法抛异常后  会释放锁 展示抛出异常前和抛出异常后的对比
public class SynchronizedException implements Runnable{

	static SynchronizedException test1 = new SynchronizedException();

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
		System.out.println(Thread.currentThread().getName()+" 同步方法2开始");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 同步2结束");
	}

	private synchronized void method1() {
		System.out.println("同步方法1 "+Thread.currentThread().getName()+" 开始运行");
		try {
			Thread.sleep(300);
			try {
				throw new Exception("进程强行中断");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 同步方法1线程结束");
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		t1.start();
		t2.start();
	}

}
