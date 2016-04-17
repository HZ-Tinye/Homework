package com.java.homework;

import java.util.ArrayList;
import java.util.List;

import com.java.sort.BubbleSort;

/**
 * 
 * @author yeting
 *
 */
public class GetMax {

	public static List<Integer> getMax(int k) {
		List<Integer> list = new ArrayList<Integer>();
		int[] arr1 = new int[] { 1, 4, 2, 6 };
		int[] arr2 = new int[] { 6, 3, 1, 8 };
		int a1 = arr1.length;
		int a2 = arr2.length;
		int i = a1 - 1;
		int j = a2 - 1;
//		int k = 5;
		int[] arr3 = BubbleSort.sortedMaoPao(arr1);
		int[] arr4 = BubbleSort.sortedMaoPao(arr2);
		if (k <= a1 + a2 && k > 0) {
			while ((i >= 0 && j >= 0 && list.size() < k)) {
				if (arr3[i] > arr4[j]) {
					list.add(arr3[i--]);
					continue;
				}
				if (arr3[i] <= arr4[j]) {
					list.add(arr4[j--]);
					continue;
				}
			}
			//arr4数组全部元素添加进list
			while (i >= 0 && j==-1 && list.size() < k) {
				list.add(arr3[i--]);
			}
			//arr3数组全部元素添加进list
			while (j >= 0 && i==-1 && list.size() < k) {
				list.add(arr4[j--]);
			}
			
			
			for (int z = 0; z < k-1; z++) {
				System.out.print(list.get(z)+",");
			}
			System.out.println(list.get(k-1));

			return list;
			
		} else {
			System.out.println("请输入正确的k值");
			return null;
		}
	}

}
