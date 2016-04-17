package com.java.util;

import java.util.Random;

public class GenerateNum {
	public static int[] generaetNum(int num){
		int[] arr = new int[num];
		for(int i = 0;i < num; i++){
			arr[i] = new Random().nextInt(num*2);
		}
		return arr;
	}
}
