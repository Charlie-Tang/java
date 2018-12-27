package test1;

import java.util.Scanner;

public class Algorithmtest25 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String toString = scanner.nextLine();
		String s = toString.substring(0, 2);
		char c = toString.charAt(0);
		
		switch (s) {
		case "Mo":
			System.out.println("Monday");
			break;
		case "Tu":
			System.out.println("Tuesday");
			break;
		case "We":
			System.out.println("Wednesday");
			break;
		case "Th":
			System.out.println("Thursday");
			break;
		case "Fr":
			System.out.println("Friday");
			break;
		case "Sa":
			System.out.println("Saturday");
			break;
		case "Su":
			System.out.println("Sunday");
			break;

		
		}
		
		
	}

}
	




