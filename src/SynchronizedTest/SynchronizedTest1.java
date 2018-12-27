package SynchronizedTest;

//由于两个线程的读速度非常快，往往还没有把+1之后的值赋给m 另一个线程就已经取值了
public class SynchronizedTest1 implements Runnable{
	
	static SynchronizedTest1 test1 = new SynchronizedTest1(); 
	static int m = 0;
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(m);
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 100000; i++) {
			m++;
		}
		
	}
	
}
