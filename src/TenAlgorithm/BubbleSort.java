package TenAlgorithm;
//我们知道冒泡排序就是每次排序将一个数沉降到最下面
public class BubbleSort {
	
	int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
	
	public void Bubble() {
		if (arr.length==0) {
			System.out.println("数组长度为0");
		}
		else {
			for (int i = 0; i < arr.length; i++) {
				//由于最左边的数值一直在往右边移动 那么它所比较的数应该也会随之改变
				for (int j = 0; j < arr.length-1-i; j++) {
					int temp = 0;
					if (arr[j]>arr[j+1]) {
						temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		new BubbleSort().Bubble();
	}
}
