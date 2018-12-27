package SynchronizedTest;
//对象锁  在方法中
public class SynchronizedObjectCodeMethod implements Runnable{
	static SynchronizedObjectCodeMethod test = new SynchronizedObjectCodeMethod();
	static int m = 0;
	public static void main(String[] args) {
		Thread t1 = new Thread(test);
		Thread t2 = new Thread(test);
		t1.start();
		t2.start();
		
		while(t1.isAlive()||t2.isAlive()) {
		}
		System.out.println("线程结束");
		System.out.println(m);
	}

	@Override
	public void run() {
		getinfo();
	}

	private synchronized void getinfo() {
		System.out.println("使用的是方法上的对象锁  "+Thread.currentThread().getName());
		for (int i = 0; i < 100000; i++) {
			m++;
		}
	}
}
