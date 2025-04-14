package com.neetcode150.two_pointers.container_with_most_h20;

public class Solution {

    public static void main(String[] args){
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);

        System.out.println("Max :"+ result);
    }

    public static int maxArea(int[] height) {
        int maximum = 0;
        int left = 0;
        int right = height.length-1;

        while(left < right){
            int width = right-left;
            int area = Math.min(height[left],height[right])*width;
            maximum = Math.max(maximum, area);

            if(height[left] <= height[right]){
                left++;
            }else{
                right--;
            }
        }
return maximum;
    }
}
