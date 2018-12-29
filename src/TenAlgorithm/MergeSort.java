package TenAlgorithm;

/*
 *  把长度为n的输入序列分成两个长度为n/2的子序列；
	对这两个子序列分别采用归并排序；
	将两个排序好的子序列合并成一个最终的排序序列。
*/
public class MergeSort {
		public static void main(String[] args) {
			int [] arr = {47,383,121,4343,6557,87979,311,1,23,6,53353};
			new MergeSort().mergeSort(arr,4);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	
	    public int[] mergeSort(int[] A, int n) {
	       //归并排序，递归做法，分而治之

	        mSort(A,0,n-1);
	        return A;
	    }

	    private void mSort(int[] A,int left,int right){
	        //分而治之，递归常用的思想，跳出递归的条件
	        if(left>=right){
	            return;
	        }
	        //中点
	        int mid = (left+right)/2;
	        //有点类似后序遍历！
	        mSort(A,left,mid);
	        mSort(A,mid+1,right);

	        merge(A,left,mid,right);



	    }

	    //将左右俩组的按序子序列排列成按序序列
	    private void merge(int[] A,int left,int mid,int rightEnd){
	        //充当tem数组的下标
	        int record = left;
	        //最后复制数组时使用
	        int record2 = left;
	        //右子序列的开始下标
	        int m =mid+1;
	        int[] tem = new int[A.length];

	        //只要left>mid或是m>rightEnd，就跳出循环
	        while(left<=mid&&m<=rightEnd){

	            if(A[left]<=A[m]){

	                tem[record++]=A[left++];
	            }else{
	                tem[record++]=A[m++];
	            }

	        }
	        while(left<=mid){
	            tem[record++]=A[left++];
	        }
	        while(m<=rightEnd){
	            tem[record++]=A[m++];
	        }
	        //复制数组
	        for( ;record2<=rightEnd;record2++){
	            A[record2] = tem[record2];
	        }

	    }

	}
