package com.imooc.Singleton;

/*
 * 懒汉模式
 * 区别：饿汉模式的加载比较慢，但运行时获取对象的速度比较快，线程安全的
 *     懒汉模式的加载比较快，但运行时获取对象的速度比较慢，线程不安全的
 **/
public class Singleton2 {
	
	//1.将构造方法私有化，不允许外部直接创建对象
	private  Singleton2() {
	}
	
	//2.创建类的唯一实例，使用private static去修饰
	private static Singleton2 instance;
	
	public static Singleton2 getInstance() {
		if (instance==null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
}
