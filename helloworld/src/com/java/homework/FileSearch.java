package com.java.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileSearch {
	public static void main(String[] args) throws IOException{
		List<File> list = new ArrayList<File>();
		File path = new File("/Users/yeting/test");
		list = getFiles(path);
		List<Integer> array = new ArrayList<Integer>();
		for(File f : list){
			array.add(search(f,"full"));
		}
		selectSort(array);
	}
	
	static List<File> result = new ArrayList<File>();

	public static List<File> getFiles(File path){
		File[] fs = path.listFiles();
		for(int i = 0;i < fs.length;i++){
		if(!fs[i].exists()){
			return result;
		}
		if(fs[i].isFile()){
			result.add(fs[i]);
		}
		if(fs[i].isDirectory()){
			getFiles(fs[i]);
		}
	}
		return result;
	}
	
	public static int search(File path,String ss) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String s = null;
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
			while((null != (s = br.readLine()))){
				i++;
				if(s.contains(ss)){
					list.add(i);
					j++;
				}
			}
			br.close();
			if(0 == j)
				return 0;
			return list.get(j-1);
			
	}
	
	static Integer temp = 0;
	 public static void selectSort(List<Integer> list)  
     {  
         for(int x=0; x<list.size()-1; x++)  
         {  
             for(int y=x+1; y<list.size(); y++)  
             {  
                 if(list.get(x)>list.get(y))  
                 {  	
                      temp = list.get(x);
                     
                 }  
             }  
         }  
         System.out.println("最大行数为："+ temp);
     }  
}
