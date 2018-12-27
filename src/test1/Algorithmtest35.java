package test1;

import java.util.Scanner;

public class Algorithmtest35 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		boolean arr[] = new boolean[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = true;
		}
		
		int leftCount=n;
		int index=0;
		int countNum=0;
		
		while(leftCount>1)
		{			
			if(arr[index]==true)
			{			
				countNum++;		
				if(countNum==3)
				{				
					arr[index]=false;		
					leftCount--;		
					countNum=0;			
					}		
				}			
			index++;		
			if(index==n) 
			{		
				index=0;	
				}		
			}


		for(int i=0;i<n;i++) {
			if(arr[i]==true) {
				System.out.println(i+1);
				}
			}
	}

}
