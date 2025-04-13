package com.neetcode150.arrays_hashing.anagram.twosums;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args){
      int[]  nums = new int[]{7,2,14,11};
        int target = 9;
        int[] resultant = twoSums(nums,target);

        for(int result : resultant){
            System.out.println(result);
        }
    }

    public static int[] twoSums(int[] nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i < nums.length; i++){
    int complement =  target-nums[i];

    if(map.containsKey(complement)){
        return new int[]{map.get(complement), i};
    }

    map.put(nums[i], i);
    }
    return new int[]{};
    }
}
