package com.java.sort;

import com.java.util.Logger;

public class BubbleSort {
		
	public static void bubbleSort(int[] array){
		Long s1 = System.currentTimeMillis();
//		Logger.logger(array);
		
		sortedMaoPao(array);
		
//		Logger.logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序BubbleSort开始时刻："+s1);
		System.out.println("程序BubbleSort结束时刻："+s2);
		System.out.println("程序BubbleSort总共花费时间(ms)："+s3);
	}
	
	public static int[] sortedMaoPao(int[] array){
		for(int i = 0;i < array.length-1;i++){
			for(int j = 0;j < array.length - i -1;j++){
				if(array[j] > array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
