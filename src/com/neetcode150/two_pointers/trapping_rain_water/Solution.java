package com.neetcode150.two_pointers.trapping_rain_water;

public class Solution {

    public static int trap(int[] height){
        int left = 0;
        int right = height.length-1;
        int leftMax = height[0];
        int rightMax = height[right];
        int total = 0;

        while(left < right){
            if(height[left] < height[right]){
                leftMax = Math.max(leftMax, height[left]);
                if(leftMax - height[left] > 0){
                    total = total + leftMax - height[left];
                }
                left++;
            }else{
                rightMax = Math.max(rightMax, height[right]);
                if(rightMax - height[right] > 0){
                    total = total + rightMax-height[right];
                }
                right--;
            }
        }

        return total;
    }


    public static void main(String[] args){
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

    int result = trap(height);

    System.out.println("Answer :" + result);

    }
}
