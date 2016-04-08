package main.java.com.homework.sort;

import java.util.Random;

public class MergeSort {

	static int temp = 0;

	public static void main(String[] args){
		Long s1 = System.currentTimeMillis();
		int[] array = new int[10000];
		for(int i = 0 ;i<10000;i++){
//			int[] array = new int[]{10,9,8,7,6,5,4,3,2,1,0};
			array[i] = new Random().nextInt(100000);
		}
		int j = array.length;
		System.out.print("这是原始数组：");
		logger(array);
		//分成两组排序
//		for(int i = 0 ;i < array.length/2;i++){
//			if(array[2*i] > array[2*i+1]){
//				temp = array[2*i+1];
//				array[2*i+1] = array[2*i];
//				array[2*i] = temp;
//			}
//		}
//		sort(array,0,10);
//		System.out.print("这是排序后数组：");
//		logger(array);
		merge_sort(array,0,j-1);
		System.out.print("这是最终数组：");
		logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序开始时刻："+s1);
		System.out.println("程序结束时刻："+s2);
		System.out.println("程序用时："+s3);

	}
	
//	public static int[] sort(int[] array,int start,int end){
//		for(int i = 0 ;i <= (end-start)/2 ;i++){
//		if((end - start + 1)%2==0){
//		if(array[start + 2*i] > array[start + 2*i + 1]){
//			temp = array[start+2*i];
//			array[start+2*i] = array[start+2*i + 1];
//			array[start+2*i + 1] = temp;
//		}
//		}else{
//			if(i != (end-start)/2){
//				if(array[start + 2*i] > array[start + 2*i + 1]){
//					temp = array[start+2*i];
//					array[start+2*i] = array[start +2*i+ 1];
//					array[start+2*i + 1] = temp;
//				}
//			}
//		}
//		}
//		return array;
//	}
	
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
	public static void logger(int[] array){
		int j = array.length;
		System.out.print("[");
		for(int i = 0;i < array.length-1;i++){
			for(int m = 0;m<20;m++){
			System.out.print(array[i] + ",");
			}
			System.out.println("");
		}
		System.out.println(array[j-1]+"]");
	}
}
