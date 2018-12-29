package SynchronizedTest.property;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExceple {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();
		try {
			
		} finally {
			lock.unlock();
		}
		//尝试上锁
		lock.tryLock();
		try {
			//可设置获取锁的超时时间
			// boolean tryLock(long time, TimeUnit unit) throws InterruptedException;
			lock.tryLock(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
