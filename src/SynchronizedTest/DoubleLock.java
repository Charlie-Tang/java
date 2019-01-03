package SynchronizedTest;

//使用双重检验锁实现单例模式  在多线程调用方法进行指令重排序时避免instance没有被初始化
public class DoubleLock {
	private static volatile DoubleLock instance;
	private DoubleLock() {
	}
	
	public static DoubleLock getinstance() {
		if (instance== null) {
			synchronized (DoubleLock.class) {
				instance = new DoubleLock();
            }
		}
		return instance;
	}
}
