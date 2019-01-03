package ArrayListPropertyTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//ArrayList的扩容
public class test1 {
	//可以看到一开始初始化一个ArrayList的时候并没有分配容量  只有在add元素的时候才分配
	List<String> list1 = new ArrayList<>();
	//从一开始的add会给该List分配一个10长度的内容  
	//当超过10之后函数调用的是grow()方法，该方法扩容是原先的1.5倍
	//int newCapacity = oldCapacity + (oldCapacity >> 1);
	
	
	public static void main(String[] args) {
		
		/* @param      src      the source array.
	     * @param      srcPos   starting position in the source array.
	     * @param      dest     the destination array.
	     * @param      destPos  starting position in the destination data.
	     * @param      length   the number of array elements to be copied.
	     * @exception  IndexOutOfBoundsException  if copying would cause
	     *               access of data outside array bounds.
	     * @exception  ArrayStoreException  if an element in the <code>src</code>
	     *               array could not be stored into the <code>dest</code> array
	     *               because of a type mismatch.
	     * @exception  NullPointerException if either <code>src</code> or
	     *               <code>dest</code> is <code>null</code>.
	     */
		//		 System.arraycopy(Object src,int  srcPos,Object dest, int destPos,int length);
		int[] a = new int[10];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		//个人感觉该方法就是做到了自己复制自己
		System.arraycopy(a, 2, a, 3, 3);
		a[2]=99;
		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
		}
		
		int[] b = new int[3];
		b[0] = 0;
		b[1] = 1;
		b[2] = 2;
		int[] c = Arrays.copyOf(b, 10);
		//Arrays.copyOf()方法主要是为了给原有数组扩容
		System.out.println(c.length);
	}
}
