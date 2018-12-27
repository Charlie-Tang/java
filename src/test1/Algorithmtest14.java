package test1;

import java.util.Scanner;

public class Algorithmtest14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		int temp = 0;
		
		if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}
		if(y>z) {
			temp=z;
			z=y;
			y=temp;
		}
		if(x>y) {
			temp=x;
			x=y;
			y=temp;
		}
			
			System.out.println(x+" "+y+" "+z);
	}
}


