package com.java.homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IndexOf {
	
	public static void main(String[] args) throws IOException {
		isInFile("full");
	}

	public  static void isInFile(String ss) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/yeting/kk.txt"),"UTF-8"));
		String s = null;
		int i = 0;
		int j = 0;
			while((null != (s = br.readLine()))){
				if(s.contains(ss)){
					j = s.lastIndexOf(ss);
					i++;
				}
				
			}
			if(i == 0){
				System.out.println("此字符不存在");
			}else{
			System.out.println("最后一个full为第"+i+"行"+",第"+j+"列");
			}
			br.close();
					
	}

}
