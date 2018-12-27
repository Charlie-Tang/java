package algorithm;

import java.util.Scanner;

public class Algorithmtest5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);			
		int score=input.nextInt();		
		char grade=score>=90?'A':score>=60?'B':'C';		
		System.out.println(grade);	}


}

