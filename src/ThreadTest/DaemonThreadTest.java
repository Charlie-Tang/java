package ThreadTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import javax.sql.rowset.Joinable;
//使用jstack观察CPU的占用情况和线程占用情况
public class DaemonThreadTest {
	
	public static void main(String[] args) {
		System.out.println("程序进入主线程"+Thread.currentThread().getName());
		DaemonThread daemonThread = new DaemonThread();
		Thread t1 = new Thread(daemonThread);
		//设置为守护线程
		t1.setDaemon(true);
		t1.start();
//		该方法能够释放线程占用的资源
//		t1.yield();
		
//		currentThread()可以返回当前运行的线程引用
//		t1.currentThread().getName();
		
//		join()方法使得其他线程都等待调用方法的该线程执行结束后再调用  提高优先级
//		t1.join();
		
//		stop()方法由于会使进程戛然而止 已经被淘汰了  现在我们正确的运行和停止线程一般都是设置一个对应的标志位来进行操作
		
		Scanner scanner = new Scanner(System.in);
		scanner.next();
		System.out.println("程序退出主线程"+Thread.currentThread().getName());
	}
}

//同步代码块和同步方法都可以通过synchronized来通过私有化一个不可改变的object对象进行加锁
//可以使用wait()方法将错的放到waitset区域  而后在执行完的时候使用notifyAll()方法进行通知等待占用资源的线程
class DaemonThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"进入守护线程");
		try {
			writetoFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"退出守护线程");
	}

	private void writetoFile() throws IOException, Exception {
		File filename = new File("F://daemon.txt");
		@SuppressWarnings("resource")
		OutputStream outputStream = new FileOutputStream(filename);
		int count = 0;
		while(count<99)
		{
			outputStream.write(("\r\n" +"word"+count).getBytes());
			System.out.println("守护线程"+Thread.currentThread().getName()+
					"向文件中写入了"+count++);
			Thread.sleep(1000);
		}
		
	}
	
}