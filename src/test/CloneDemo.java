package test;


// Java中一个类要实现clone功能必须实现Cloneable接口，否则在调用clone()会报CloneNotSupportedException异常。
//在JAVA中克隆一个对象常见的有三种形式 
//1.通过自己写一个克隆方法里面 new 一个同样的对象来进行 get、set 依次赋值实现深度克隆（很繁琐且易出错）； 
//2.通过实现 Cloneable 接口并重写 Object 类的 clone() 方法（分为深浅两种方式）； 
//3.通过实现 Serializable 接口并用对象的序列化和反序列化来实现真正的深度克隆；
public class CloneDemo implements Cloneable{
	
	private static CloneDemo cloneDemo = new CloneDemo();
	private CloneDemo() {
	}
	public static CloneDemo getcloneDemo() {
		return cloneDemo;
	}
	public void setcloneDemo(CloneDemo cloneDemo) {
		this.cloneDemo = cloneDemo;
	}
	
	//使用Cloneable实现浅克隆
	//对基本数据类型就是值复制，而对非基本类型变量保存的仅仅是对象的引用
	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		
		CloneDemo cloneDemo = (CloneDemo)super.clone();
		cloneDemo.setcloneDemo((CloneDemo)cloneDemo.clone());
		return cloneDemo;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		CloneDemo cloneDemo = new CloneDemo();
		try {
			CloneDemo cloneDemo2 = (CloneDemo)cloneDemo.clone();
			System.out.println(cloneDemo.hashCode());
			System.out.println(cloneDemo2.hashCode());
			
			System.out.println(cloneDemo.getcloneDemo().hashCode());
			System.out.println(cloneDemo2.getcloneDemo().hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}
