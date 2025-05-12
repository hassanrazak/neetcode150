package com.neetcode150.arrays_hashing.longest_consecutive_seq;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static void main(String[] args){

        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};

        int k = longestConsecutive(nums);
        System.out.println(k);


    }




    public static int longestConsecutive(int[] nums){

        if(nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();

        for(int num:nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        for(int num : numSet){
            if(!numSet.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;

                while(numSet.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak,currentStreak);
            }


        }

        return longestStreak;


     }

}
