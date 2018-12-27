package test1;

import java.util.Scanner;

public class Algorithmtest31 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		String toString = scanner.nextLine();
		char [] chr = toString.toCharArray();
		
		if (chr.length<7) {
			throw new Exception("这个字符串长度不够");
			
		}
		else
		{
			System.out.println(chr[chr.length-4]+" "+chr[chr.length-5]+" "+chr[chr.length-6]+" "+chr[chr.length-7]);
		}
	}

}
