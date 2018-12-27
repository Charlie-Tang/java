package algorithm;

import java.util.Scanner;

public class Algorithmtest24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String toString = scanner.nextLine();
		
		char num [] = toString.toCharArray();
		
		for (int i = 0; i < num.length/2; i++) {
			if (num[i]!=num[num.length-i]) {
				System.out.println("这不是一个回文数");
				
			}
			else
			{
				System.out.println("这是一个回文数");
			}
		}
	}

}
