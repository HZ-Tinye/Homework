package com.java.sort;

import com.java.util.Logger;

public class MergeSort {

	public static void mergeSort(int[] array){
		Long s1 = System.currentTimeMillis();
//		Logger.logger(array);
		
		merge_sort(array,0,array.length-1);
		
//		Logger.logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序MergeSort开始时刻："+s1);
		System.out.println("程序MergeSort结束时刻："+s2);
		System.out.println("程序MergeSort总共花费时间(ms)："+s3);

	}
	
	public static int[] merge_sort(int[] arr,int p ,int r){
		int q = 0;
		if(p < r){
			q = (p + r)/2;
			merge_sort(arr,p,q);
			merge_sort(arr,q+1,r);
			merge(arr,p,q,r);
		}
		
		return arr;
	}
	
	public static int[] merge(int[] arr,int p,int q,int r){
		int i = 0,j = 0,k = p;
		int n1 = q-p+1;
		int n2 = r-q;
		
		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];
		int m = 0,n = 0;
		for(int i1 = 0;i1 < n1;i1++){
			arr1[m++] = arr[p++];
		}
		for(int i2 = 0;i2 < n2;i2++){
			arr2[n++] = arr[1+(q++)];
		}
		
		while(i < n1&& j < n2){
			if(arr1[i] < arr2[j]){
				arr[k++] = arr1[i++];
			}
			else{
				arr[k++] = arr2[j++];
			}
		}
		
		while(i < n1){
			arr[k++] = arr1[i++];
		}
		while(j < n2){
			arr[k++] = arr2[j++];
		}
		
		return arr;
	}

}
