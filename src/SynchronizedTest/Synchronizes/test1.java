package SynchronizedTest.Synchronizes;

public class test1 implements Runnable{
	public static void main(String[] args) throws InterruptedException {
		test1 test1 = new test1();
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	public synchronized void getinfo1() {
		System.out.println("这是普通同步方法一"+Thread.currentThread().getName());
	}
	public void getinfo2() {
		System.out.println("这是非同步方法二"+Thread.currentThread().getName());
	}
	@Override
	public void run() {
		getinfo1();
		getinfo2();
	}
	
}
