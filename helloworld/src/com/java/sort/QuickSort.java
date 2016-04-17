package com.java.sort;

import com.java.util.Logger;

public class QuickSort {
		
	public static void quick(int[] array){
		Long s1 = System.currentTimeMillis();
//		Logger.logger(array);
		
		sort(array,0,array.length-1);
		
//		Logger.logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序QuickSort开始时刻："+s1);
		System.out.println("程序QuickSort结束时刻："+s2);
		System.out.println("程序QuickSort总共花费时间(ms)："+s3);

	}
			
	public static void sort(int[] arr,int left,int right){
		if(left >= right){
			return ;
		}
		int key = arr[left];
		int i = left;
		int j = right;
		while(i<j){
			while(i<j&&key<=arr[j])
				j--;
			arr[i]=arr[j];
			while(i<j&&key>=arr[i])
				i++;
			arr[j]=arr[i];
		}
		arr[i] = key;
		if(i>left)sort(arr,left,i-1);
		if(j<right)sort(arr,i+1,right);
	}
}
