package main.java.com.homework.sort;

import java.util.Random;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{10,15,56,25,30,70};
//		int[] array = new int[10];
//		for(int i = 0 ;i < 10;i++){
//			array[i] = new Random().nextInt(200);
//		}
		logger(array);
		heapSort(array,6);
		logger(array);
		
	}
	
	public static int[] heapAdjust(int[] arr ,int i,int size){
					
		int max = i;
//		System.out.println("max = "+max);
		int lchild = 2*i ;
		int rchild = 2*i + 1;
		
		
		
		if((i == size/2&& size%2 !=0)||(i < size/2)){
		if(lchild <=size && arr[max-1] < arr[lchild-1])
			max = lchild;	
		
		if(rchild <=size && arr[max-1] < arr[rchild-1])
			max = rchild;		
			
		if( i != max)
			swap(arr,i-1,max-1);
			heapAdjust(arr,max,size);
		
		}
		
		if(i == size/2 && size%2 == 0){
			if(lchild <= size && arr[max -1] < arr[lchild - 1]){
				max = lchild;
				swap(arr,i-1,max - 1);
				heapAdjust(arr,max,size);

			}
		}
		
		return arr;
	}
	
	public static int[] buildHeap(int[] arr,int size){
		for(int i = size/2;i > 0;i--){
			heapAdjust(arr,i,size);
		}
		return arr;
	}
	
	public static void swap(int[] arr,int p,int q){
		int temp;
		temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
	}
	
	public static int[] heapSort(int[] arr,int size){
		int i;
		buildHeap(arr,size);
		for(i = size;i > 0;i--){
			swap(arr,0,i-1);
			heapAdjust(arr,1,--size);
		}
		return arr;
	}
	
	public static void logger(int[] arr){
		int j = arr.length;
		System.out.print("[");
		for(int i = 0 ;i < arr.length-1; i++){
			System.out.print(arr[i]+",");	
		}
		System.out.println(arr[j-1]+"]");
	}
}
