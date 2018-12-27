package test;

//我个人认为for循环优化太少了
public class UseTime {
	int a;
	public void test1() {
		long startTime = System.currentTimeMillis();
		int []arr = new int[5000000];
		for (int i = 0; i < arr.length; i++) {
			a++;
		}
		long endtime =  System.currentTimeMillis();
		long usetime = endtime - startTime;
		System.out.println("这类方法的消耗时间为"+ usetime);
	}
	
	public void test2() {
		long startTime = System.currentTimeMillis();
		int []arr = new int[5000000];
		for (int i = 0, len = arr.length; i < len; i++) {
			a++;
		}
		long endtime =  System.currentTimeMillis();
		long usetime = endtime - startTime;
		System.out.println("这类方法的消耗时间为"+ usetime);
	}
	
	
	public static void main(String[] args) {
		UseTime useTime = new UseTime();
		useTime.test1();
		useTime.test2();
	}
}
