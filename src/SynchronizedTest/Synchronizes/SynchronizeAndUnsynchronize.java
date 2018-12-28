package SynchronizedTest.Synchronizes;

//从这里可以看到synchronized只作用于它所修饰的方法 而非同步的方法不受其影响
public class SynchronizeAndUnsynchronize implements Runnable{
	
	static SynchronizeAndUnsynchronize test1 = new SynchronizeAndUnsynchronize();
	public static void main(String[] args) {
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		t1.start();
		t2.start();
		if (t1.isAlive()||t2.isAlive()) {
			
		}
		
	}

	@Override
	public void run() {
		if (Thread.currentThread().getName().equals("Thread-0")) {
			method1();
		}
		else {
			method2();
		}
	}

	private void method2() {
		System.out.println(Thread.currentThread().getName()+" 非同步方法开始");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 非同步结束");
	}

	private synchronized void method1() {
		System.out.println("同步方法 "+Thread.currentThread().getName()+" 开始运行");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" 同步方法线程结束");
	}
	

}
