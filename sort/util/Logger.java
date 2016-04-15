package com.java.util;

public class Logger {
	
	public static void loggerOne(int[] arr){
		int l = arr.length;
		System.out.print("[");
		for(int i = 0; i < arr.length-1;i++){
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[l-1]+"]");
	}

	public static void logger(int[] arr){
		System.out.println("[");
		for(int i = 0;i < arr.length/20;i++){
			for(int m = 0;m < 20;m++){
			System.out.print(arr[i*20+m]+",");
			}
			System.out.println("");
		}
		System.out.println("]");
	
		}
}