package algorithm;

import java.lang.reflect.Method;

public class test2 {

	public static void main(String[] args) {
		
		test2 aaa = new test2();
		String string = "aaa";
		aaa.getInformation(string);
		
	}
	
	
	public void getInformation(Object obj)
	{
		Class c = obj.getClass();
		
		System.out.println("传入参数的类名为"+c.getName());
		
		Method m[] = c.getDeclaredMethods();
		for(Method a:m)
		{
			System.out.println(a);
		}
		
//		c.getField(name)
	}

}
