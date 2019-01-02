package TenAlgorithm;
/*
 *  找出待排序的数组中最大和最小的元素；
	统计数组中每个值为i的元素出现的次数，存入数组C的第i项；
	对所有的计数累加（从C中的第一个元素开始，每一项和前一项相加）；
	反向填充目标数组：将每个元素i放在新数组的第C(i)项，每放一个元素就将C(i)减去1。
 * */
import java.util.Arrays;

public class CountingSort {
	
	public static int [] countingSort(int [] arr) {
		
		if (arr.length==0) {
			return arr;
		}
		int min = arr[0],max = arr[0];
		int bias = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < arr.length; i++) {
            bucket[arr[i] + bias]++;
        }
        int index = 0, i = 0;
        while (index < arr.length) {
            if (bucket[i] != 0) {
            	arr[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
		countingSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}	
