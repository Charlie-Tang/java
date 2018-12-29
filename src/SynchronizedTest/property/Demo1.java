package SynchronizedTest.property;
/*
 * 可重入：指的是同一线程中的外部函数获得锁之后，
 * 内层函数可以再次获得该锁。
 * 
 * 好处：避免死锁、提升封装性
 * 
 * 粒度：证明可重入性在于整个线程而非在于反复调用
 * 具体在1：证明同一个方法是可重入的
 * 		2：证明可重入不要求是一个方法
 * 		3：证明可重入不要求在同一个类中
 * 
 * 不可中断性：当线程持有锁的时候，无法中断，只能等待它将锁资源释放才能够获取锁资源
 * */
public class Demo1 {
	int a = 0;
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		demo.method();
	}
	private synchronized void method() {
		System.out.println("这是method，a的值应为："+a);
		if (a==0) {
			a++;
			method();
		}
	}
}
