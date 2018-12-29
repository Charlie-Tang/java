package SynchronizedTest.property;
//加锁和释放锁的原理
//现象：每个方法在持有锁之后，只有抛出异常或者运行结束的时候才会释放锁资源
//获取锁和释放锁的时机：内置锁(即该类的.class对象锁  在方法运行完之后对象锁会被释放)
//等价代码 (并发编程实战)
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedToLock {
	Lock lock = new ReentrantLock();
	
	public synchronized void name1() {
		System.out.println("这是一个synchronized类型的锁");
	}
	
	public void name2() {
		lock.lock();
		try {
			System.out.println("这是lock类型的锁");
		} catch (Exception e) {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		SynchronizedToLock test = new SynchronizedToLock();
		test.name1();
		test.name2();
	}
}
