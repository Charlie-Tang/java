package Basicknowledge;
/*在swap方法中，a、b的值进行交换，并不会影响到 num1、num2。
因为，a、b中的值，只是从 num1、num2 的复制过来的。
也就是说，a、b相当于num1、num2 的副本，副本的内容无论怎么修改，都不会影响到原件本身。
*/
//从此可以看出，一个方法无法修改一个基本数据类型的参数
public class Change1 {
	static int num1 = 10;
	static int num2 = 20;
	
	public static void main(String[] args) {

	    System.out.println("num1 = " + num1);
	    System.out.println("num2 = " + num2);
	}

	public void swap(int a, int b) {
	    int temp = a;
	    a = b;
	    b = temp;

	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	}
	
	
}
