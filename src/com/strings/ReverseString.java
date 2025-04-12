package com.strings;

import java.util.Arrays;

public class ReverseString {

    public static String reverseString(String str){
        if(str == "" || str.length() == 1){
            return str;
        }

       char[] stringArr = str.toCharArray();
       int i = 0;
       int j = stringArr.length-1;
        while(i<j){
            char temp = stringArr[i];
            stringArr[i] = stringArr[j];
            stringArr[j] = temp;
            i++;
            j--;

        }

        return new String(stringArr);
    }

    public static void main(String[] args){

        String str = "123!@#'";


        System.out.println(reverseString(str));



    }
}
