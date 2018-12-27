package test1;

import java.util.Scanner;

public class Algorithmtest37 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		
		if (n>=0) {
			float sum = 0;
			if (n%2 == 0) {
				
				float arr[] = new float[n/2];
				for (int i = 0; i < arr.length; i++) {
					int a = ((i+1)*2);
					arr[i] = (float)1/a;
					sum += arr[i];
				}
				System.out.println(sum);
			}
			else
			{
				for(int i=1;i<=n;i+=2) {
					sum+=(double)1/i;
					}
					}
			
		}
		
		else
		{
			System.out.println("请输出一个正数");
		}
	}

}
