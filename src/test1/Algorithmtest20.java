package test1;

public class Algorithmtest20 {

	public static void main(String[] args) {
		
		int sum =0;
		int n=1;
		for (int i = 1; i <=20; i++) {
			n = n*i;
			sum += n;
		}
		
		System.out.println(sum);
	}

}
