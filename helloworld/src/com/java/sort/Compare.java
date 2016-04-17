package com.java.sort;

import com.java.util.GenerateNum;

public class Compare {
	public static void main(String[] args){
		int num = 10000000;
		int arr[] = GenerateNum.generaetNum(num);
		QuickSort.quick(arr);
//		BubbleSort.bubbleSort(arr);
		MergeSort.mergeSort(arr);
		HeapSort.heap(arr);
	}
}
