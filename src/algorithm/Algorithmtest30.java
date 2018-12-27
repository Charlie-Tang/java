package algorithm;

import java.util.Scanner;

public class Algorithmtest30 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] num = new int [5];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		for (int i = num.length-1; i >-1 ; i--) {
			
			System.out.print(num[i]+ " ");
		}
	}

}
