package SynchronizedTest.property;
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
