package Basicknowledge;

public class hashcodeAndequals {
	public static void main(String[] args) {
		String a = "aaa";
		
		String b = new String("aaa");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		//两个对象有相同的hashcode值，它们也不一定是相等的
		//所以我们在重写equals方法 时也需要重写hashCode方法
		System.out.println(a==b);
		//因为hashCode() 所使用的杂凑算法也许刚好会让多个对象传回相同的杂凑值。
		//越糟糕的杂凑算法越容易碰撞，但这也与数据值域分布的特性有关（所谓碰撞也就是指的是不同的对象得到相同的 hashCode）。
		
	}
}

