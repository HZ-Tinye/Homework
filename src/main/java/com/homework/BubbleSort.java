package main.java.com.homework.sort;

import java.util.Random;

public class BubbleSort {
	
	// 这有何用?
	public static int temp = 0;
	
	public static void main(String[] args){
		Long s1 = System.currentTimeMillis();
		int[] array = new int[1000000];			
		System.out.println("开始产生随机数");
		
		for(int i = 0;i < 10000;i++){
			array[i] = new Random().nextInt(10000000);
			System.out.println("产生的随机数为："+array[i]+"，这是第"+i+"个随机数");
		}
		//int[] array = new int[]{10,100,12,90,44,36,89,90,20,33,5,1,0,34,};
		System.out.println("结束产生随机数");

		int[] arr = sortedMaoPao(array);
		System.out.print("[");
		int j = arr.length - 1;
		for(int i = 0;i < arr.length/10;i++){
			for(int m = 0;m < 10;m++){
			System.out.print(arr[i*10+m]+",");
			}
			System.out.println("");
		}
		System.out.println("]");
		Long s2 = System.currentTimeMillis();
		System.out.println("programm start time :" + Long.toString(s1));
		System.out.println("programm end time :" + Long.toString(s2));
		Long s3 = s2 - s1;
		System.out.println("the sum time :" + Long.toString(s3));

	}
	
	public static int[] sortedMaoPao(int[] array){
		for(int i = 0;i < array.length;i++){
			for(int j = 0;j < array.length - i -1;j++){
				if(array[j] > array[j+1]){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
}
