package com.neetcode150.arrays_hashing.anagram;


public class Solution {
    public static void main(String[] args){

        String str1 =  "cat";
        String str2 =  "abt";

        boolean result = isAnagram(str1,str2);

        if(result){
            System.out.println("Yes the two strings are anagrams!");

        }else{
            System.out.println("Not an anagram!");
        }

    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] count = new int[26];

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) -'a']--;
        }

        for(int i=0; i < 26; i++){
            if(count[i] !=0){
                return false;
            }
        }
        return true;
    }
}
