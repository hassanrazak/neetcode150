package com.strings;

public class IsPrimeChecker{

public static boolean isPrime(int n){

if(n <= 1) return false; 
if(n == 2) return false; 

boolean isPrimeNumber = false;
for(int i = 3; i < Math.sqrt(n); i += 2){
	if( n % i == 0){ 
	isPrimeNumber =  false;
		
		
	}else {
		isPrimeNumber = true;
	}
	

}
return isPrimeNumber; 

}

public static void main(String[] args){

int n = 12; 	

	if(isPrime(n)){
		System.out.println(n +  "is a prime number");
		
	
	}else{
		System.out.println(n + " is NOT a prime number");
	}

}

}