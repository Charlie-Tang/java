package test1;

import java.util.Arrays;
import java.util.Scanner;

public class Algorithmtest29 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int [] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		Arrays.sort(num);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		int input = scanner.nextInt();
		num = sort(num, input);
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
	
	public static int[] sort(int a[],int b)
	{
		int [] c = new int[a.length+1];
		boolean flag = true;
		for (int j = 0; j < a.length; j++) {
			if (flag==true) {
				if (b>a[j]) {
					c[j]=a[j];
				}else {
				c[j]=b;
				flag=false;
				System.arraycopy(a, j, c, j+1, a.length-j);
				}
				}else {
				break;
				}
				
			
		}
	
		
		
		return c;
		
	}

}
