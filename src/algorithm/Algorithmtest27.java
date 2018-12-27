package algorithm;

import java.util.Scanner;

public class Algorithmtest27 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i]=scanner.nextInt();
		}
		
		
		int temp=0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if (num[i]>num[j]) {
					temp=num[i];
					num[i]= num[j];
					num[j]= temp;
				}
				
			}
			System.out.println(num[i]);
		}
		
		
		
	}

}
