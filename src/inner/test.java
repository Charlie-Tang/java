package inner;

public class test {
	
	 class test1 implements innertest{

		@Override
		public void run() {
			System.out.println("内部类继承的方法");
		}
		
	}
	
	public void test12(String temp) {
		 class test123{
			public void function() {
				System.out.println("这是方法体的内部类方法");
				System.out.println("外部函数的参数"+temp);
			}
		 };
		 new test123().function();
	}
	
	
	public void run() {
		System.out.println("这是自己的方法");
	}
	
	public static void main(String[] args) {
		
		String temp = "tangqichang";
		test test = new test();
//		test.test1 inner = test.new algorithm();
//		inner.run();
		test.test12(temp);
	}
}
