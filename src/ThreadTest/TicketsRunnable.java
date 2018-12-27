package ThreadTest;
//runnable和thread的区别就是 拥有多少个对象和对应资源的区别   由于使用接口  可以直接规避掉单继承的问题
public class TicketsRunnable{
	
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		//创建三个线程模拟三个售票窗口
		Thread t1 = new Thread(myThread1,"窗口1");
		Thread t2 = new Thread(myThread1,"窗口2");
		Thread t3 = new Thread(myThread1,"窗口3");
		
		t1.start();
		t2.start();
		t3.start();
		
		//在下方  当创建不同对象获得了对象所拥有的资源的时候  就会发生和继承thread一样的情况
//		MyThread1 myThread2 = new MyThread1();
//		MyThread1 myThread3 = new MyThread1();
//		
//		Thread t1 = new Thread(myThread1,"窗口1");
//		Thread t2 = new Thread(myThread2,"窗口2");
//		Thread t3 = new Thread(myThread3,"窗口3");
//		
//		t1.start();
//		t2.start();
//		t3.start();
	}
	
}

//runnable中的同一资源是可以被多线程共享的
class MyThread1 implements Runnable{
	
	private int ticketCount = 5;
	
	@Override
	public void run() {
		while(ticketCount>0) {
			ticketCount--;
			System.out.println(Thread.currentThread().getName()+"卖了一张票，剩余票数为:"+ticketCount);
		}
	}
	
	
}