package test1;

public class Algorithmtest21 {

	public static void main(String[] args) {
		
		Algorithmtest21 a = new Algorithmtest21();
		System.out.println(a.fnc(5));
		
	}
	
	public int fnc(int i)
	{
		if (i==1) {
			return i;
		}
		
		else
		{
			return i*fnc(i-1);
		}
		
		
	}

}
