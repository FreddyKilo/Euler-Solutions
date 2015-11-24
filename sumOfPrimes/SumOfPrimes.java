package com.freddy.kilo.sumOfPrimes;

public class SumOfPrimes {

	public static void main(String[] args){
		long sum = 0;
	    int number = 2000000;
	    	for(int i = 2; i < number; i++){
	    		if(isPrime(i)){
	    			sum += i;
	    		}
	    	}
	    System.out.println(sum);
	}

	public static boolean isPrime(int a){
		if(a % 2 == 0 && a != 2) return false;
	    for(int i = 2; i * i <= a; i++){
	    	if(a % i == 0) return false;
	    }
	    return true;
	}

}
