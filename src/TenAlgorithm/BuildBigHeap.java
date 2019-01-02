package TenAlgorithm;
//此方法是测试如何创建一个大根堆
//现在能想到的当然是递归的一层一层创建
public class BuildBigHeap {
	static int length;
	public static void main(String[] args) {
		int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
		length = arr.length;
		buildBigHeap(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	private static int[] buildBigHeap(int[] arr) {
		if (length<=0) {
			return arr;
		}
		//需要从最后一个非叶子节点往上构造
		for (int i = length/2-1; i >=0; i--) {
			adjustHeap(arr,i);
		}
		return arr;
	}
	private static void adjustHeap(int[] arr, int i) {
		int maxIndex = i;
        //如果有左子树，且左子树大于父节点，则将最大指针指向左子树
        if (i * 2 < length && arr[i * 2] > arr[maxIndex])
            maxIndex = i * 2;
        //如果有右子树，且右子树大于父节点，则将最大指针指向右子树
        if (i * 2 + 1 < length && arr[i * 2 + 1] > arr[maxIndex])
            maxIndex = i * 2 + 1;
        //如果父节点不是最大值，则将父节点与最大值交换，并且递归调整与父节点交换的位置。
        if (maxIndex != i) {
            swap(arr, maxIndex, i);
            adjustHeap(arr, maxIndex);
        }
	}
	 private static void swap(int[] array, int maxIndex, int j) {
	    	int temp = 0;
	    	if (array[maxIndex]>array[j]) {
				temp = array[maxIndex];
				array[maxIndex] = array[j];
				array[j] = temp;
			}
		}
}
