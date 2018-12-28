package SynchronizedTest;

public class SynchronizedClassClass implements Runnable{
	
	static SynchronizedClassClass test1 = new SynchronizedClassClass();
	static SynchronizedClassClass test2 = new SynchronizedClassClass();
	public static void main(String[] args) {
		
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test2);
		t1.start();
		t2.start();
		while(t1.isAlive()||t2.isAlive()) {
		}
		System.out.println("finished");
	}

	
	@Override
	public void run() {
		method();
	}
	
	private  void method() {
		//由于.class是特有的 只有一个  所以能够保证同步
		synchronized(SynchronizedClassClass.class) {
		System.out.println(Thread.currentThread().getName()+" 开始执行");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 结束");
		}
	}

}
