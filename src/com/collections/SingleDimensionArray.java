package com.collections;

public class SingleDimensionArray {
	int arr[] = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i=0; i< arr.length-1; i++) {
			arr[i] = Integer.MIN_VALUE;
			
		}
	}
	
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location] ==  Integer.MIN_VALUE) {   
				arr[location] = valueToBeInserted;
				System.out.println("Sucessfully inserted");
				
			}else {
				System.out.println("This cell is already occupied");
				
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Index to access array!");
			
		}
	}

	public static void main(String[] args) {
		SingleDimensionArray newArray = new SingleDimensionArray(10);
		
//		System.out.println(java.util.Arrays.toString(newArray));
		newArray.insert(0,10);
		newArray.insert(1,20);
		newArray.insert(2,30);	
		
		
//		 newArray.transverArray();
		newArray.searchInArray(100);
		
		

	}

	
//	Array Transversal 
	
	public void transverArray() {
		
		try {
			
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		}catch(Exception e) {
			System.out.println("Array ....");
		}
	}
	
	
//	Search method 
	
	public void searchInArray(int valueToSearch) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == valueToSearch) {
				System.out.println("Match!...at index of: " + i);
				return;
			}
			
		}
		System.out.println("Value not found");
	}
}
