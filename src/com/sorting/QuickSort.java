package com.sorting;

public class QuickSort {

	public static void main(String [] args){
		int[] arr = {7,3,2,5,6,9,4};

			quickSort(arr,0, arr.length-1);
			
			
			System.out.println(java.util.Arrays.toString(arr));
			

			
	
		
	}


	public static void quickSort(int[] arr, int start, int end){
	
		if(end <=start) return; 

		int pivot  = partition(arr, start, end);

		quickSort(arr, start, pivot-1);

		quickSort(arr, pivot+1, end);
		
	
	}



	public static int partition(int[] arr, int start, int end)
	{
			int pivot = arr[end];
			int i  = start-1; 

			for(int j=start; j<=end-1; j++){
				if(arr[j] < pivot){
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				
				}
				
			
			
				
			}
			i++;
			int temp = arr[i];
			arr[start] = arr[end];
			arr[end] = temp;
			return i;
	}

}