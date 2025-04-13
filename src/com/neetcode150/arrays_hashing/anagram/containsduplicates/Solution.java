package com.neetcode150.arrays_hashing.anagram.containsduplicates;

import java.util.HashSet;

public class Solution {


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};

        boolean result = isDuplicate(nums);

        if(result){
            System.out.println("Contains duplicates");
        }else{
            System.out.println("Does NOT Contains duplicates");
        }
    }

    public static boolean isDuplicate(int[] nums){
        HashSet<Integer> seenNumbers = new HashSet<>();

        for(int num:nums){

            if(seenNumbers.contains(num)){
                return true;
            }
            seenNumbers.add(num);
        }

        return false;

    }
}
