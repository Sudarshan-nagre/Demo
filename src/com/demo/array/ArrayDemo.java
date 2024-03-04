package com.demo.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[] = new int[100];
		
		int arr1[]= {10,20,30,40,50};
		
		String strArr[] = {"abc","mno","kmo"};
		
		int j =10;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]= j;
			j = j+10;
		}

		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
	}
}
