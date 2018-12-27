package algorithm;

import java.util.Scanner;

public class Algorithmtest7 {
	public static void main(String[] args) {
		
		int abccount=0;		
		int spacecount=0;		
		int numcount=0;		
		int othercount=0;				
		Scanner input=new Scanner(System.in);		
		String toString=input.nextLine();		
		char [] ch=toString.toCharArray();			
		for(int i=0;i<ch.length;i++) 
		{			
			if(Character.isLetter(ch[i])) 
			{				
				abccount++;			
				}else if
			(Character.isDigit(ch[i])) 
				{			
					numcount++;			
				}
				else if(Character.isSpaceChar(ch[i]))
				{			
					spacecount++;	
					}
				else 
				{			
					othercount++;	
					}		
			}		
		System.out.println(abccount);	
		System.out.println(spacecount);	
		System.out.println(numcount);	
		System.out.println(othercount);		
		}

}
