package com.neetcode150.two_pointers.twosumII;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args){
        int[] nums  = new int[]{2,5,6,7,10,12,21,42};
        int[] result = twoSumII(nums,13);

        System.out.println("Index of sums: "+Arrays.toString(result));


    }

    public static int[] twoSumII(int[] nums, int target){

        int left = 0;
        int right = nums.length-1;

        while(left < right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else{
                return new int[]{left+1,right+1};
            }
        }
        return null;
    }
}
