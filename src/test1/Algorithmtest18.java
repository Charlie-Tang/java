package test1;

public class Algorithmtest18 {

	public static void main(String[] args) {

			int H = 7;
			int W = 7;
			
			for(int i=0; i<(H+1) / 2; i++) {
			for(int j=0; j<W/2-i; j++) {
				System.out.print(" ");
						}
			for(int k=1; k<(i+1)*2; k++)
			{
				System.out.print('*');
				}
			System.out.println();
			}
			for(int i=1; i<=H/2; i++) {
				for(int j=1; j<=i; j++) {
						System.out.print(" ");
						}
			for (int k = 1; k <=W-2*i; k++) {
				System.out.print("*");
			}
				System.out.println();
				
			}




		}
	}

