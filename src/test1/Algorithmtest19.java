package test1;

public class Algorithmtest19 {
	public static void main(String[] args) {
		
		int n =2;
		int sum =0;
		for (int i = 1; i < 21; i++) {
			
			sum += n/i;
			n += i;
		}
		System.out.println(sum);
	}
}	
