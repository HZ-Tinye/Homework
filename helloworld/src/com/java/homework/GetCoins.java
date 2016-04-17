package com.java.homework;

public class GetCoins {
	
	public static int getCoins(int sum){
		if(sum > 0){
		int i = sum/5;
		int j = sum%5/2;
		int m = sum - 5*i - 2*j;
		System.out.println("5块钱的个数为："+i);
		System.out.println("2块钱的个数为："+j);
		System.out.println("1块钱的个数为："+m);
		System.out.println("最少的总的个数为："+(i+j+m));

		return i+j+m;
	}System.out.println("请输入正确的总金额！");
	return -1;
	}
}
