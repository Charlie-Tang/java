package Basicknowledge;
//引用调用
//此时array 被初始化 arr 的拷贝也就是一个对象的引用，也就是说 array 和 arr 指向的时同一个数组对象。 
//因此，外部对引用对象的改变会反映到所对应的对象上。

//当方法得到的是对象引用的拷贝，对象引用及其他的拷贝同时引用同一个对象。
public class Change2 {
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		System.out.println(arr[0]);
		Change(arr);
		System.out.println(arr[0]);
	}

	private static void Change(int[] arr) {
		arr[0] = 100000;
	}
}
