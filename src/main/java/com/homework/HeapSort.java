package main.java.com.homework.sort;

import java.util.Random;

public class HeapSort {

	public static void main(String[] args) {
		Long s1 = System.currentTimeMillis();
		// TODO Auto-generated method stub
//		int[] array = new int[]{10,15,56,25,30,70};
		int num = 10000;
		int[] array = new int[num];
		for(int i = 0 ;i < num;i++){
			array[i] = new Random().nextInt(100000);
		}
		System.out.println("这是原始数组：");
		logger(array);
//		heapSort(array,num);
		buildMaxHeapify(array);
		heapSort(array);
		System.out.println("这是最终数组：");
		logger(array);
		Long s2 = System.currentTimeMillis();
		Long s3 = s2 - s1;
		System.out.println("程序开始时刻："+s1);
		System.out.println("程序结束时刻："+s2);
		System.out.println("程序用时："+s3);

		
	}
	
	public static void buildMaxHeapify(int[] data){
		int startIndex = getParentIndex(data.length - 1);
		for(int i = startIndex;i>=0;i--){
			maxHeapify(data,data.length,i);
		}
	}
	public static void maxHeapify(int[] data,int heapSize,int index){
		int left = getChildLeftIndex(index);
		int right = getChildRightIndex(index);
		
		int largest = index;
		if(left<heapSize&&data[index]<data[left]){
			largest = left;
		}
		if(right<heapSize&&data[largest]<data[right]){
			largest = right;
		}
		if(largest!=index){
			int temp = data[index];
			data[index] = data[largest];
			data[largest] = temp;
			maxHeapify(data,heapSize,largest);
		}
	}
	
	public static void heapSort(int[] data){
		for(int i=data.length-1;i>0;i--){
			int temp = data[0];
			data[0] = data[i];
			data[i] = temp;
			maxHeapify(data,i,0);
		}
	}
	
	public static int getParentIndex(int current){
		return (current-1)>>1;
	}
	public static int getChildLeftIndex(int current){
		return (current<<1)+1;
	}
	public static int getChildRightIndex(int current){
		return (current<<1)+2;
	}
	
	
	
//	public static int[] heapAdjust(int[] arr ,int i,int size){
//					
//		int max = i;
//		System.out.println("max = "+max);
// 		int lchild = 2*i ;
//		int rchild = 2*i + 1;
//		
//		
//		
//		if((i == size/2&& size%2 !=0)||(i < size/2)){
//		if(lchild <=size && arr[max-1] < arr[lchild-1])
//			max = lchild;	
//		
//		if(rchild <=size && arr[max-1] < arr[rchild-1])
//			max = rchild;		
//			
//		if( i != max)
//			swap(arr,i-1,max-1);
//		if(size !=1 )
//			heapAdjust(arr,max,size);
//		
//		}
//		
//		if(i == size/2 && size%2 == 0){
//			if(lchild <= size && arr[max -1] < arr[lchild - 1]){
//				max = lchild;
//				swap(arr,i-1,max - 1);
//				heapAdjust(arr,max,size);
//
//			}
//		}
//		
//		return arr;
//	}
//	
//	public static int[] buildHeap(int[] arr,int size){
//		for(int i = size/2;i > 0;i--){
//			if(size == 1){
//				break;
//			}
//			heapAdjust(arr,i,size);
//		}
//		return arr;
//	}
//	
//	public static void swap(int[] arr,int p,int q){
//		int temp;
//		temp = arr[p];
//		arr[p] = arr[q];
//		arr[q] = temp;
//	}
//	
//	public static int[] heapSort(int[] arr,int size){
//		int i;
//		buildHeap(arr,size);
//		for(i = size;i > 0;i--){
//			swap(arr,0,i-1);
//			if(size == 1){
//				break;
//			}
//			heapAdjust(arr,1,--size);
//		}
//		return arr;
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
