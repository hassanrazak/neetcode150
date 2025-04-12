package com.dsa.sorting;

public class BubbleSortAlgorithm {
	
	public static void main(String[] args) {
		int nums[] = {9,4,5,6,7,2,3,1};
		
//		printArr(nums);
		sort(nums);
//		printArr(nums);
	}
	
	public static void printArr(int[] arr) {
		
		for(int a : arr) {
			System.out.print(a + " ");
			
		}
		System.out.println();
	}
	
	
	public static void sort(int[] arr) {
		
		int size = arr.length; 
		
		for(int i = 0; i < size; i++) {
			
			for(int j = 0; j < size-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				printArr(arr);	
				}
			}
		}
	}
	
	
	
	

}
