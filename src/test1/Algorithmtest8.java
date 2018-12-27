package test1;

import java.util.Scanner;

public class Algorithmtest8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		int a = 2;
		int b = 0, sum=0;
		
		for (int i = 0; i < s; i++) {
			
			b+=a;
			sum+=b;
			a= a*10;
		}
		
		System.out.println(sum);
	}

}
