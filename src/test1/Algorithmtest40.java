package test1;

public class Algorithmtest40 {
	
	public static void main (String[] args) 
	{
		int a=809,b,i;
		//设计小于13的原因是会超过1W?
		for(i=10;i<13;i++)
		{b=i*a ;
		if(8*i<100&&9*i>=100)
			System.out.println("809*"+i+"="+"800*"+i+"+"+"9*"+i+"="+b);
		}
		}
}
