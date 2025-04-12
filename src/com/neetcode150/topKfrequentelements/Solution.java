package com.neetcode150.topKfrequentelements;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public static void main(String[] args){
int[] nums = {1,1,1,1,2,2,2,3,3,4,5};
int k = 3;
        int[] result = topKfrequent(nums, k);

        for(int i=0; i< result.length; i++){
            System.out.println(result[i]);
        }

    }

    public static int[] topKfrequent(int[] nums, int k){

       HashMap<Integer, Integer> count = new HashMap<>();

       for(int n:nums){
           count.put(n, count.getOrDefault(n,0)+1);
       }

       Queue<Integer> heap = new PriorityQueue<>(
               (a,b) -> count.get(a) - count.get(b)
       );

       for(int n:count.keySet()) {
           heap.add(n);
           if (heap.size() > k) {
               heap.poll();
           }
       }

           int[] ans = new int[k];
           for(int i=0; i <k; i++){
               ans[i] = heap.poll();
           }
           return ans;
       }

    }

