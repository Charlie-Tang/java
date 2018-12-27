package algorithm;

import java.util.Scanner;

public class Algorithmtest13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int days = 0;
		int d = 0;
		
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 4:
			case 6:
		    case 9:
		    case 11:
		    	days = 30;
		    	break;
		    	
		    case 2:
		    	if (year%400==0 || year%4==0 && year%100!=0) {
					
		    		days = 29;
				}
		    	else {
					days = 28;
				}
		    	break;
			}
			d += days;
		}
			
			System.out.println(year + "-" + month +"-" + day + "是这年的第" +(d+day) + "天。");
	}

}
