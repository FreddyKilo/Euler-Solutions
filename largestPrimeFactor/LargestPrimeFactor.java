package com.freddy.kilo.largestPrimeFactor;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		long theNumber = 600851475143L;
		System.out.println(getLargestPrimeFactor(theNumber) + " is the largest prime factor of " + theNumber + "!");
	}

	public static long getLargestPrimeFactor(long theNumber) {
		int j = 0;
		for(int i=2; i<theNumber; i++){
			if(theNumber % i == 0){
				System.out.println("getLargestPrimeFactor took " + (i-j) + " iterations to return " + (theNumber/i));
				j = i;
				if (isPrime(theNumber/i)) {
					return theNumber/i;
				}
			}
		}
		return 0;
	}
	
	public static boolean isPrime(long number) {
		for(int i=2; i <= number/2; i++){
			if(number % i == 0){
				System.out.println("and isPrime took " + i + " iterations to return that number as false");
				System.out.println("");
				return false;
			}
		}
		return true;
	}
}
