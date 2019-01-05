package Basicknowledge;

import java.lang.reflect.Field;

public class DiffOfStringAndStringBuilder {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String s1 = "aaaaaa";
		System.out.println(s1);
		
		s1 = "kjafbka";
		System.out.println(s1);
		//很多人都会说String不是不可变的么   其实这里只是调用了String对象的引用值。
		//每当我们给同一个字符串赋值时，在内存区域就会新建一个该值的区域来给对象引用。
		
		//使用反射类给原对象的字符改变值
		//但是这里需要思考的是，当我们使用反射类获取到了value值时，该数组还是使用final修饰的么？
		//我们是不是使用另一个容器获取到了对应数组后改变了对应值呢？
		String s = "Hello World";

		System.out.println("s = " + s); // Hello World

		// 获取String类中的value字段
		Field valueFieldOfString = String.class.getDeclaredField("value");

		// 改变value属性的访问权限
		valueFieldOfString.setAccessible(true);

		// 获取s对象上的value属性的值
		char[] value = (char[]) valueFieldOfString.get(s);

		// 改变value所引用的数组中的第5个字符
		value[5] = '_';

		System.out.println("s = " + s); // Hello_World
	}
}
