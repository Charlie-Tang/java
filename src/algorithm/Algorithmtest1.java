package algorithm;

public class Algorithmtest1 {
	
	public static void main(String args[]) {
		
		int f1=1;
		int f2=1;
		int f;
		int Month=30;
		for (int i = 3; i < Month; i++) {
			
			f=f2;
			f2=f1+f2;
			f1=f;
			
		}
		System.out.println("1".equals(new String("1")));
		
	}
}
