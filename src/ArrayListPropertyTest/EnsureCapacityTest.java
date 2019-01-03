package ArrayListPropertyTest;

import java.util.ArrayList;
//如果要往list中(大量)添加元素的时候      可使用ensureCapacity 方法，以减少增量从新分配的次数
public class EnsureCapacityTest {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		final int N = 10000000;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("使用ensureCapacity方法前："+(endTime - startTime));

		list = new ArrayList<Object>();
		long startTime1 = System.currentTimeMillis();
		list.ensureCapacity(N);
		for (int i = 0; i < N; i++) {
			list.add(i);
		}
		long endTime1 = System.currentTimeMillis();
		System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));
	}
}
