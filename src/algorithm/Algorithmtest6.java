package algorithm;

import java.util.Scanner;

public class Algorithmtest6 {
	public static void main(String[] args) 
	{		
		Scanner input =new Scanner(System.in);		
		int a=input.nextInt();		
		int b=input.nextInt();				
		Algorithmtest6 test=new Algorithmtest6();		
		int i = test.gongyinshu(a, b);				
		System.out.println("最小公因数"+i);		
		System.out.println("最大公倍数"+a*b/i);		
	}	
	public int gongyinshu(int a,int b) 
	{		
		if(a<b) 
		{			
			int t=b;			
			b=a;			
			a=t;		
			}				
		while(b!=0) 
		{			
			if(a==b)				
			return a;			
			int x=b;			
			b=a%b;			
			a=x;		
			}		
		return a;	
		}
	}



