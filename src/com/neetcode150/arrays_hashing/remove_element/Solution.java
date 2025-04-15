package com.neetcode150.arrays_hashing.remove_element;

import java.util.Arrays;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;

            }
        }

        return count;

    }

    public static void main(String[] args){
        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        System.out.println(Arrays.toString(nums));
        removeElement(nums,val);
        System.out.println(Arrays.toString(nums));
    }


}
