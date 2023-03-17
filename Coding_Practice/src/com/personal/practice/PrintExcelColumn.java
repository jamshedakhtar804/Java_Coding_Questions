package com.personal.practice;

import java.util.Scanner;

public class PrintExcelColumn {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(convertToColumns(num));
	}
	
	public  static String convertToColumns(int n){
	    StringBuilder sb=new StringBuilder();
	    while(0 < n){
	        int rem = (n-1)%26;
	        sb.append((char)('A'+rem));
	        n=(n-1)/26;
	    }
	    
	    return sb.reverse().toString();
	}

}
