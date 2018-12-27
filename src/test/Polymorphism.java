package test;

//当父类对象引用变量引用子类对象时，被引用对象的类型决定了调用谁的成员方法，引用变量类型决定可调用的方法。如果子类中没有覆盖该方法，那么会去父类中寻找。
//继承链中对象方法的调用的优先级：this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)。
public class Polymorphism {
	
	public void ppp() {
		System.out.println("在P类中初始化的方法");
	}
	
public static void main(String[] args) {
		
		//向上转型
		//向上转型时，子类单独定义的方法会丢失。比如上面Dog类中定义的run方法，当animal引用指向Dog类实例时是访问不到run方法的，animal.run()会报错。
		//子类引用不能指向父类对象。Cat c = (Cat)new Animal()这样是不行的。
//		Polymorphism ppp = new B();
//		ppp.ppp();
		
		//向下转型
		//向下转型的前提是父类对象指向的是子类对象（也就是说，在向下转型之前，它得先向上转型）
		//向下转型只能转型为本类对象（猫是不能变成狗的）。
//		B bbb = (B) ppp;
//		bbb.ppp();
	}
}

//class A extends Polymorphism{
//	
//	public void aaa() {
//		System.out.println("这是A自己的方法");
//	}
//}
//
//class B extends A{
//	
//	public void bbb() {
//		System.out.println("这是B自己的方法");
//		
//	
//	}
//	
//	@Override
//	public void ppp() {
//		System.out.println("被重写了的ppp方法");
//	}
//
//}
