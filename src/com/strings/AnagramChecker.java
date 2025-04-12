package com.strings;

public class AnagramChecker{

	public static boolean isAnagram(String s, String t){
		s = s.replaceAll("\\s","").toLowerCase();
		t = t.replaceAll("\\s","");
//				.toLowerCase();

//		%% edge : lengths of the strings do not match  %%
			if(s.length() != t.length()){
			return false; 
		}
		int[] charCount = new int[26];
		
		for(char c : s.toCharArray()){
				charCount[c-'a']++; 
		
		}

			for(char c: t.toCharArray()){
				charCount[c-'a']--; 
				if(charCount[c-'a'] < 0){
				return false; 
				
				}
			
			}
			return true; 
			
	
	
	}


public static void main(String[] args){

	String s = "Silent";
	String t = "listen"; 


	if(isAnagram(s,t)){
		System.out.println("is An Anagram ");
	}else{
			System.out.println("Not an anagram");
	}

}

}