package TenAlgorithm;
/*插入排序（Insertion-Sort）的算法描述是一种简单直观的排序算法。
 * 它的工作原理是通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序在实现上，通常采用in-place排序（即只需用到O(1)的额外空间的排序），
 * 因而在从后向前扫描过程中，需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。*/
public class InsertionSort {
	
	public int [] Insertion(int [] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			int current = arr[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            //在这里preIndex的值减一了 事实上还是发生了交换
            arr[preIndex + 1] = current;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
		new InsertionSort().Insertion(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
