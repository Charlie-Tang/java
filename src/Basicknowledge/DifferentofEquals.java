package Basicknowledge;

//将此字符串与指定的对象进行比较。 当且仅当参数不为null并且是表示与此对象相同的字符序列的String对象时，结果才为真。
//String中的equals方法是被重写过的，因为object的equals方法是比较的对象的内存地址，而String的equals方法比较的是对象的值。
public class DifferentofEquals {
	public static void main(String[] args) {
		String aa = "aa";
		String bb = "aa";
		String cc = new String("aa");
		System.out.println(aa==bb);//true  此时由于bb是从常量池中去找有没有已经被创建的值为aa的对象  如果有就直接赋给引用  所以此时两个是==
		System.out.println(aa==cc);//false  此时不==   因为cc是被创建的新的string对象  两者的地址都不同
		System.out.println(aa.equals(cc));//true  因为string类型中的equals方法被重写过了  只是比较对象的值
//		System.out.println(42==42.000);//true  因为在基本数据类型的比较时  ==只比较对象的值
//		System.out.println(42.244==42.2440000);
	}
}
