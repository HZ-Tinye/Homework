package com.java.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordsCount {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/yeting/test/cp.txt")));
		String s = null;
		int count = 0 ;
		while(null != (s = br.readLine())){
			if(s.isEmpty())
				continue;
			String[] ss = s.split(" ");				
			count = count + ss.length;
		}
		System.out.println("此文件共有字数："+count);
	}
}
