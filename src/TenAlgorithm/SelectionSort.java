package TenAlgorithm;
/*
 * 表现最稳定的排序算法之一，因为无论什么数据进去都是O(n2)的时间复杂度，所以用到它的时候，数据规模越小越好。
 * 唯一的好处可能就是不占用额外的内存空间了吧。理论上讲，选择排序可能也是平时排序一般人想到的最多的排序方法了吧。
 */
public class SelectionSort {
	//选择排序就是  选到第一个值之后  往后去找哪个值比该值要大或者要小   然后将这个排序之后的最大值放到头或者尾
	public int [] Selection(int [] arr) {
		if (arr.length==0) {
			System.out.println("该数组长度为0");
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					int temp = 0;
					if (arr[i]>arr[j]) {
						temp = arr[j];
						arr[j]=arr[i];
						arr[i] = temp;
					}
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
		new SelectionSort().Selection(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
