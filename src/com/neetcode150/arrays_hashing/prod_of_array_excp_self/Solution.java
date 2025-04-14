package com.neetcode150.arrays_hashing.prod_of_array_excp_self;

import java.util.Arrays;

public class Solution {


    public static void main(String[] args){
        int[] nums = new int[]{1,2,3,4};

        int[] resultant = prodOfSelf(nums);

        System.out.println(Arrays.toString(resultant));
    }

    public static int[] prodOfSelf(int[] nums){

        int[] result = new int[nums.length];

        Arrays.fill(result,1);

        int pre = 1, post = 1;

        for(int i=0; i< nums.length; i++){
            result[i] = pre;
            pre = nums[i] * pre;
        }

        for(int i=nums.length-1; i >=0; i--){
            result[i] = result[i]*post;
            post = post*nums[i];
        }

        return result;
    }
}
