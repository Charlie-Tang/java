package TenAlgorithm;

import java.util.ArrayList;

/*
 * 	取得数组中的最大数，并取得位数；
	arr为原始数组，从最低位开始取每个位组成radix数组；
	对radix进行计数排序（利用计数排序适用于小范围数的特点）；
 * */
public class RadixSort {
	public static int[] radixSort(int [] arr) {
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max<arr[i]) {
				max = arr[i];
			}
		}
		int maxDigit = 0;
        while (max != 0) {
        	//每整除一次10就给位数计数器加一
            max /= 10;
            maxDigit++;
        }
        //这里的基数排序感觉和桶排序所使用的方法是一样的  由于数字是只有10位的  所以设计的是10个桶去保存各个位数的数字
        int mod = 10, div = 1;
        ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < 10; i++)
            bucketList.add(new ArrayList<Integer>());
        for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
        	//先将这些数字安排到不同的list中
            for (int j = 0; j < arr.length; j++) {
                int num = (arr[j] % mod) / div;
                bucketList.get(num).add(arr[j]);
            }
            int index = 0;
            //然后看看这里有多少个list  进行遍历
            for (int j = 0; j < bucketList.size(); j++) {
                for (int k = 0; k < bucketList.get(j).size(); k++)
                	//从第一个list开始开始给arr赋值
                    arr[index++] = bucketList.get(j).get(k);
                //每赋值一个就清空一个list
                bucketList.get(j).clear();
            }
        }
        return arr;
	}
	
	public static void main(String[] args) {
		int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
		radixSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
