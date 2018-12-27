package test1;

public class Algorithmtest26 {

	public static void main(String[] args) {
		
		boolean flag = true;
		for (int i = 3; i < 100; i+=2) {
			for (int j = 2; j < Math.sqrt(i); j++) {
					
				if (i%j==0 ) {
					flag = false;
					break;
				}
				
				else
				{
					flag = true;
				}
				
			}
			if (flag== true) {
				
				System.out.println(i);
			}
			
		}
	}

}
