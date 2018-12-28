package SynchronizedTest.property;

public class Demo2 {
	
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		demo.method1();
	}
	private synchronized void method1() {
		System.out.println("这是method1");
		method2();
	}
	private synchronized void method2() {
		System.out.println("这是method2");
	}
}
