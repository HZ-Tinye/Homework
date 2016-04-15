package main.java.com.homework;

import java.util.Random;

public class QuickSort {
		
	public static void main(String[] args){
		int[] array = new int[]{6,2,7,3,8,9};
		Long s1 = System.currentTimeMillis();
		int num = 10000;
//		int[] array = new int[num];
//		for(int i = 0;i < num;i++){
//			array[i] = new Random().nextInt(100000);
//		}
		System.out.println("程序生成的数组：" + array);
		logger(array);
//		sort(array,0,5);
//		logger(array);
//		quickSort(array,0,num-1);
		sort(array,0,5);
		System.out.println("程序排序的数组：");
		logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序开始的时刻："+s1);
		System.out.println("程序结束的时刻："+s2);
		System.out.println("程序总共花费时间(ms)："+s3);

	}
//	public static int[] quickSort(int[] arr,int p,int r){
//		int q = 0;
//		if(p < r){
//		q = sort(arr,p,r);
//		quickSort(arr,0,q-1);
//		quickSort(arr,q+1,r);
//		}
//		
//		return arr;
//	}
	public static int[] sort(int[] arr,int low , int high){
		int l = low;
		int h = high;
		int povit = arr[low];
		while(l<h)
		{
			while(l<h&&arr[h]>=povit)
				h--;
			if(l<h){
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				l++;
			}
			
			while(l<h&&arr[1]<=povit)
				l++;
			if(l<h){
				int temp = arr[h];
				arr[h] = arr[l];
				arr[l] = temp;
				h--;
			}
			logger(arr);
		}
			if(l>low) 
				sort(arr,low,l-1);
			if(h<high)
				sort(arr,l+1,high);
			return arr;
		}
//		while(i<j){
//			for(;j>i;j--){
//			if( arr[i] > arr[j]){
//				temp = arr[j];
//				arr[j] = arr[i];
//				arr[i] = temp;
//				break;
//			}
//			}
//			for(;i<j;i++){
//			if(arr[j] < arr[i]){
//				temp = arr[i];
//				arr[i] = arr[j];
//				arr[j] = temp;
//				break;
//			}
//			}
//		}
//		System.out.println("i = "+i);
//		return i;
//	}
	
	public static void logger(int[] arr){
		System.out.println("[");
		for(int i = 0;i < arr.length/10;i++){
			for(int m = 0;m < 10;m++){
			System.out.print(arr[i*10+m]+",");
			}
			System.out.println("");
		}
		System.out.println("]");

	}
	
}
