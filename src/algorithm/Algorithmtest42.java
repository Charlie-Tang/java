package algorithm;

import java.util.Scanner;

public class Algorithmtest42 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		if (num>0 && num<50) {
			
			for (int i = 0; i < num; i++) {
				
				System.out.print("*");
			}
			
		}
		
	}

}
