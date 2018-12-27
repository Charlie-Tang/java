package test1;

import java.util.Scanner;

public class Algorithmtest11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float earn = scanner.nextInt();
		double get = 0;
		
		if (earn<=10) {
			
			get = earn*0.1;
		}
		else if (earn>10&&earn<20)
		{
			get = 10*0.1+(earn-10)*0.075;
		}
		else if (earn>20&&earn<40) {
			
			get = 10*0.1+20*0.075+(earn-20)*0.05;
		}
		else if (earn>40&&earn<60) {
			
			get = 10*0.1+20*0.075+40*0.05+(earn-40)*0.03;
		}
		else if (earn>60&&earn<100) {
			
			get = 10*0.1+20*0.075+40*0.05+60*0.03+(earn-60)*0.015;
		}
		else if (earn>100) {
			
			get = 10*0.1+20*0.075+40*0.05+60*0.03+100*0.015+(earn-100)*0.01;
		} 
		
		
		System.out.println(get);
	}

}
