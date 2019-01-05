package Basicknowledge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//三种获得类对象的方法
public class ReflectDemo {
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		//反射类不但可以用于加载XML中的配置加载各个类的
		//还可以通过获取这些类对象中的方法和私有对象去进行配置整个框架
		
//		ReflectDemo reflectDemo = new ReflectDemo();
//		Class stuClass = reflectDemo.getClass();
//		System.out.println(stuClass.getSimpleName());
//		
//		Class test1 = ReflectDemo.class;
//		System.out.println(test1==stuClass);
		
		try {
			Class test2 = Class.forName("Basicknowledge.test");
			//这个方法看起来好像可以返回所有的公有构造方法
			Constructor[] conArray = test2.getConstructors();
//			for(Constructor c : conArray){
//				System.out.println(c);
//			}
			
			Constructor[] conArray1 = test2.getDeclaredConstructors();
			for (Constructor constructor : conArray1) {
//				System.out.println(constructor);
			}
			
			//还有一个是公有的无参方法  但是我个人认为只有一个  不需要演示了
			
			Constructor con = test2.getConstructor(null);
			//可以通过无参方法创建新的类实例对象
			Object obj = con.newInstance();
			
			//获取所有的成员变量
			Field [] field1 = test2.getFields();
			for (Field field : field1) {
				System.out.println(field);
			}
			
			//可以通过该类获取所有的类的方法名
			Method [] methods = test2.getDeclaredMethods();
			for (Method method : methods) {
				System.out.println(method);
			}
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//这三种方法常用第三种  由于第一种是直接从实例对象获得类对象的  而第二种则需要导入对应的包获取.class对象
		//只有第三种是常用的  我们可以通过xml对各个类进行导入
		
		
		
	}
}
class test{
	//该测试类用于调试
	public String name;
	private int age;
	public int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private test(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public test() {
		super();
	}
	
}