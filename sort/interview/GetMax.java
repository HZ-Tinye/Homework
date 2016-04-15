package main.java.com.homework;

import java.util.ArrayList;
import java.util.List;

import main.java.com.homework.sort.BubbleSort;

public class GetMax {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int[] arr1 = new int[] { 1, 4, 2, 6 };
		int[] arr2 = new int[] { 6, 3, 1, 8 };
		int a1 = arr1.length;
		int a2 = arr2.length;
		int i = a1-1;
		int j = a2-1;
		int k=5;
		int[] arr3 = BubbleSort.sortedMaoPao(arr1);
		int[] arr4 = BubbleSort.sortedMaoPao(arr2);
		if (k <= a1 + a2&&k>0) {
			while((i >= 0 && j >= 0)) {
				if (arr3[i] > arr4[j]) {
					list.add(arr3[i--]);
					continue;
				}
				if(arr3[i] <= arr4[j]){
					list.add(arr4[j--]);
					continue;
				}
			}
			// 这里i循环的过程中没判断k, list会一直add多于k个数，可以在while里加入对list大小和k的判断
			while(i>=0){
				list.add(arr3[i--]);
			}
			while(j>=0){
				list.add(arr4[j--]);
			}
			for(int z=0;z<k;z++){
				System.out.println(list.get(z));
			}
		}else{
		System.out.println("请输入正确的k值");
		}
	}

}
