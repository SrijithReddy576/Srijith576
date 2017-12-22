package com.dao.task;

import java.util.Scanner;

public class BubbleSortTask {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of array");
		int size = sc.nextInt();
		System.out.println("Enter the elements");
		
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
			
			arr[i] = sc.nextInt();
			
		}
		
		sc.close();
		System.out.println("Before sorting :");
		for(int k:arr){
			System.out.println(k);
		}
		int length = arr.length;
		for(int j=0;j<length;j++){
			for(int k=j+1;k<length;k++){
				if(arr[j]>arr[k]){
				arr[j] = arr[j]+arr[k];
				arr[k] = arr[j]-arr[k];
				arr[j] = arr[j]-arr[k];
				
			}
			}
		}
System.out.println("After Sorting:");
for(int s:arr){
	System.out.println(s);
}
	}

}
