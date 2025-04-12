package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		List<String> predefinedFruits = new ArrayList<>(Arrays.asList("Banana","Apple", "Apple", "Cherry")); 
		List<String> predefinedCapacity = new ArrayList<>(1);

//		COLLECTIONS INTERFACE
//		----LIST INTERFACE IMPLEMENTS COLLECTIONS
//		-------ABSTRACTLIST CLASS IMPLEMENTS LIST INTERFACE 
//		-----------ARRAYLIST, LINKEDLIST, VECTOR, STACK
		
//		SOME CORE CONCEPTS
//		-----INSERTION ORDER IS MAINTAINED AS OPPOSED TO SETS {1,2,3}
//		-----INDEXED ACCESS [0], [1], [2]
//		-----DUPLICATES ARE ALLOWED AS OPPOSED TO SETS {1,1,2,2}
//		-----DYNAMIC SIZING
		
//		System.out.println(fruits);
//		System.out.println((predefinedFruits));
//		System.out.println((predefinedCapacity));
//		predefinedCapacity.add(0,"hello");
//		predefinedCapacity.add(1,"WORLD");
//		System.out.println(predefinedCapacity);
		
		
		
//		%% Common Methods %%

//		System.out.println(fruits);
//		fruits.add("orange"); 
//		System.out.println(fruits);
//		fruits.add(1,"grape"); 
//		System.out.println(fruits);
//
//
//		String firstFruit = fruits.get(0); 
//		System.out.println(firstFruit);
//		int size = fruits.size();
//		System.out.println(size);
//
//		System.out.println(predefinedFruits);
//		predefinedFruits.remove(0);
//		System.out.println(predefinedFruits);
//		predefinedFruits.remove("Banana");
//		System.out.println(predefinedFruits);
//		predefinedFruits.clear();
//		System.out.println(predefinedFruits);
		
		
		LinkedList<Integer> nums = new LinkedList<>(); 
//		List<Integer> nums = new LinkedList<>(); 
//		System.out.println(nums);
//		nums.addFirst(0);
//		System.out.println(nums);
//		nums.addLast(4);
//		System.out.println(nums);
//		Integer firstNum = nums.getFirst();
//		System.out.println(firstNum);
//
//		Integer secondNum =  nums.getLast();
//		System.out.println(secondNum);

//		Treat it like a Queue
//		System.out.println(nums);
//		nums.offer(5);
//		System.out.println(nums);
//		nums.poll();
//		System.out.println(nums);

////		Treat it like a stack 
//		nums.add(0);
//		nums.add(1);
//		nums.push(6);
//		System.out.println(nums);
//		nums.pop(); 
//		System.out.println(nums);

	}

}
