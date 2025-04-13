package com.neetcode150.two_pointers.validpalindrome;

public class Solution {


    public static void main(String[] args){

        String str = "A man, a plan, a canal: Panama";

        boolean result = isPalindrome(str);
        if(result){
            System.out.println("Its a palindrome");
        }else{
            System.out.println("Its NOT a palindrome");
        }


    }

    public static boolean isPalindrome(String str){

        String inputStr =  str.toLowerCase().replaceAll("[^a-zA-A]", "");

        int left = 0;
        int right=inputStr.length()-1;



        char[] charArray = inputStr.toCharArray();

        while(left < right){
            if(charArray[left] == charArray[right]){
                left++;
                right--;
            }else{
                return false;
            }

        }

        return true;

    }
}
