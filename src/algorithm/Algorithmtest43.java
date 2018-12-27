package algorithm;

import java.util.Scanner;

public class Algorithmtest43 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Algorithmtest43 aaa = new Algorithmtest43();
		
		int a1 = scanner.nextInt();
		int b1 = scanner.nextInt();
		int c1 = scanner.nextInt();
		int d1 = scanner.nextInt();
		
		int num1 = a1*1000 + b1*100 + c1*10 +d1;
		System.out.println(num1);
		int a2 = aaa.get(a1);
		int b2 = aaa.get(b1);
		int c2 = aaa.get(c1);
		int d2 = aaa.get(d1);
		int x,y;
		
		x=a2;
		a2=d2;
		d2=x;
		
		y=b2;
		b2=c2;
		c2=y;
		
		int num2 = a2*1000 + b2*100 + c2*10 +d2;
		System.out.println(num2);
	}
	
	public int get(int a)
	{
		a=(a+5)%10;
		
		return a;
	}

}
