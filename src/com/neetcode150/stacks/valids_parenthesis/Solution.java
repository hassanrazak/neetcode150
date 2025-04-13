package com.neetcode150.stacks.valids_parenthesis;

import java.util.HashMap;
import java.util.Stack;

public class Solution {


    public static void main(String[] args){
        String s = "{{}}";
        isValid(s);

    }

    public static boolean isValid(String s){

        HashMap<Character, Character> mappedBracket = new HashMap<>();

        mappedBracket.put(')','(');
        mappedBracket.put('}','{');
        mappedBracket.put(']','[');

        Stack<Character> stackt = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!mappedBracket.containsKey(c)){
                stackt.push(c);
            }else{
                if(stackt.isEmpty()){
                    return false;
                }
                char topElement = stackt.pop();
                if(topElement != mappedBracket.get(c)){
                    return false;
                }

            }

        }

return true;

    }
}
