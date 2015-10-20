package com.freddy.kilo.largestPrimeFactor;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		long theNumber = 600851475143L;
		int check = 13195;
		System.out.println(getLargestPrimeFactor(theNumber));
	}

	public static long getLargestPrimeFactor(long theNumber) {
		for(int i=2; i<theNumber; i++){
			if(theNumber % i == 0){
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
				return false;
			}
		}
		return true;
	}
}
