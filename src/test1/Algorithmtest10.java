package test1;

public class Algorithmtest10 {
	
	public static void main(String[] args) {
		
		int count=0;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int j2 = 1; j2 < 5; j2++) {
					
					if (i!=j&&j!=j2&&j2!=i) {
						
						count++;
						int y = i*100+j*10+j2;
						System.out.println(y);
					}
					
					
				}
			}
		}
		
		System.out.println(count);
	}
}
