package com.java.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;



public class Login {
	
	private static final String CONTENT_CHARSET = "UTF-8";

	
	public static void weiboPage() throws IOException{

		HttpClient client = new HttpClient();
				
		GetMethod getMethod = new GetMethod("http://weibo.com/");
		
		getMethod.setRequestHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		getMethod.setRequestHeader("Accept-Encoding", "gzip, deflate, sdch");
		getMethod.setRequestHeader("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6");
		getMethod.setRequestHeader("Connection", "keep-alive");
		getMethod.setRequestHeader("Host", "weibo.com");
		getMethod.setRequestHeader("If-Modified-Since", "Mon, 25 Apr 2016 12:41:36 GMT");
		getMethod.setRequestHeader("Upgrade-Insecure-Requests", "1");
		getMethod.setRequestHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/44.0.2403.130 Safari/537.36");
		
		int statusCode = 0;
		try {
			statusCode = client.executeMethod(getMethod);
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		InputStream in = null;
		try {
			in = getMethod.getResponseBodyAsStream();
			System.out.println("statusCode = "+statusCode);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(getMethod.getStatusCode()==200){
		byte[] b = new byte[100000];
		int len = in.read(b) ;
		in.close();
		System.out.println("response = ");
		System.out.println(new String(b,0,len));
		}
		
		
		getMethod.releaseConnection();
	}
	
}
