package test;

import java.io.UnsupportedEncodingException;

public class test1 {
	
	private final static int a = 5;
	
	public static void main(String[] args) {
		
		int a = 100;
		test1 test1 = new test1();
		System.out.println(test1.set(a));
		
		byte  [] data = {(byte) 312,(byte) 31231};
		String isoString;
		try {
			isoString = new String(data,"ISO-8859-1");
			System.out.println(isoString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public final int set(int a)
	{
		return a;
	}
}
