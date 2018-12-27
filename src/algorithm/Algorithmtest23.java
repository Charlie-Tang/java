package algorithm;

import java.util.Scanner;

public class Algorithmtest23 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String toString = scanner.nextLine();
		
		char num [] = toString.toCharArray();
		
		System.out.println(num.length);
		
		for (int i = num.length; i > 0; i--) {

			System.out.print(" "+num[i-1]);
		}
		
	}
}
