package TenAlgorithm;
/*
 * 算法思想：基于分治的思想，是冒泡排序的改进型。
 * 首先在数组中选择一个基准点（该基准点的选取可能影响快速排序的效率，后面讲解选取的方法），
 * 然后分别从数组的两端扫描数组，设两个指示标志（lo指向起始位置，hi指向末尾)，
 * 首先从后半部分开始，如果发现有元素比该基准点的值小，就交换lo和hi位置的值，
 * 然后从前半部分开始扫秒，发现有元素大于基准点的值，就交换lo和hi位置的值，如此往复循环，
 * 直到lo>=hi,然后把基准点的值放到hi这个位置。一次排序就完成了。
 * 此时就得到了基准点左右边的序列
 * 以后采用递归的方式分别对前半部分和后半部分排序，当前半部分和后半部分均有序d时该数组就自然有序了。
 * */
public class QuickSort {
	public static int partition(int []array,int lo,int hi){
        //固定的切分方式
        int key=array[lo];
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
    
    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi); 
    }
    
    public static void main(String[] args) {
    	int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
    	int lo = 0;
    	int hi = arr.length-1;
    	sort(arr, lo, hi);
    	for (int i = 0; i < arr.length; i++) {
    		System.out.print(arr[i]+" ");
    	}
	}
}
