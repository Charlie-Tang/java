package SynchronizedTest.property;
//synchronized锁的缺点
//不可中断  使用效率低  没有提供中断的方法
//灵活度不够  无法自由的进行读写等操作的适用
//无法判断是否成功拿到锁资源
class Demo4 {
	public synchronized void method1() {
		System.out.println("这是父类中的方法");
	}
}

public class Demo3 extends Demo4{
	public synchronized void method1()
	{
		System.out.println("这是子类中的方法");
		super.method1();
	}
	public static void main(String[] args) {
		Demo3 demo = new Demo3();
		demo.method1();
	}
}
