package test1;

import java.util.Scanner;

public class Algorithmtest28 {

	public static void main(String[] args) {
		
		int[][] num = new int[3][3];
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				num[i][j] = scanner.nextInt();
				
				if (i==j) {
					sum+= num[i][j];
				}
			}
		}
		System.out.println(sum);
		
	}

}
