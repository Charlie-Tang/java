package ThreadTest.volatileTest;

public class volatiletest1 implements Runnable{
	
	public volatile boolean stop = true ;
	@Override
	public void run() {
		while(stop)
		{
				
			int m = 0;
			int n = 10;
			System.out.println(Thread.currentThread().getName()+"n的值为:"+n);
			
			m = n+1;
			System.out.println(Thread.currentThread().getName()+"m的值为:"+m);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			setstop();
		}
		
	}
	public void setstop() {
		stop = false;
	}
	
	
	public static void main(String[] args) {
		
		volatiletest1 test1 = new volatiletest1();
		volatiletest1 test2 = new volatiletest1();
		
		Thread t1 = new Thread(test1,"线程1");
		Thread t2 = new Thread(test2,"线程2");
		
		t1.start();
		t2.start();
	}
	
}
