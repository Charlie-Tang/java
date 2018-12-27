package algorithm;

import java.util.Scanner;

public class Algorithmtest33 {

	public static void main(String[] args) {
		
		int [] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		int temp=0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				
				if (num[i]>num[j]) {
					temp = num[i];
					num[i]= num[j];
					num[j] =temp;
				}
			}
			//我这里已经排序完了
			System.out.print(num[i]+" ");
		}
		System.out.println(" ");
		int a= num[0];
		int b = num[num.length-1];
		
		
		num[0] = b;
		num[num.length-1] =a;
		
		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i]+ " ");
		}
		
	}

}
