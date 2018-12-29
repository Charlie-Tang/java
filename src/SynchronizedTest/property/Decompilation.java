package SynchronizedTest.property;
/*反编译一个字节码文件
javac Decompilation.java
javap -verbose Decompilation.class

*可重入原理：
*JVM负责跟踪对象被加锁的次数，synchronized在JVM被编译为monitorenter、monitorexit指令来获取和释放互斥锁.。
*线程第一次给对象加锁的时候  加锁计数器中的数值加一  当该对象再次获得这把锁的时候   计数器递增
*每当任务离开时 计数器递减  当加锁计数器中的值为0时  锁资源被释放
*/

public class Decompilation {
	private Object object = new Object();
	
	public void insert(Thread thread) {
		synchronized (object) {
			
		}
	}
}
