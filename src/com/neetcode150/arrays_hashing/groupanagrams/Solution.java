package com.neetcode150.arrays_hashing.groupanagrams;

import java.util.*;

public class Solution {

    public static void main(String[] args){
        String[] strs = {"eat","bat","ate","tea", "tan", "nat"};
        List<List<String>> resultant = groupAnagrams(strs);
        System.out.println(resultant);
    }

    public static List<List<String>> groupAnagrams(String[] strs){

       HashMap<String,List<String>> ansMap = new HashMap<>();

       int[] count  = new int[26];

       for(String s:strs){
           Arrays.fill(count,0);
           for(char c:s.toCharArray()){
               count[c-'a']++;
           }

           StringBuilder sb = new StringBuilder();

           for(int i = 0; i < 26; i++){
               sb.append("#");
               sb.append(count[i]);
           }

           String key = sb.toString();

           if(!ansMap.containsKey(key)){
               ansMap.put(key, new ArrayList<String>());
           }
           ansMap.get(key).add(s);
       }

       return new ArrayList<>(ansMap.values());

    }
}
