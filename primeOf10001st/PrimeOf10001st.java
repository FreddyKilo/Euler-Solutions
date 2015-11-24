package com.freddy.kilo.primeOf10001st;

public class PrimeOf10001st {

	public static void main(String[] args) {
		
		System.out.println(nthPrimeNumber(10001));

	}
	
	public static int nthPrimeNumber(int n){
		int result = 1;
		int count = 2;
		
		while(count <= n){
			result += 2;
			if(isPrime(result) && count <= n){
				count++;
			}
		}
		return result;
	}
	
	public static boolean isPrime(int num) {
		if(num % 2 == 0 && num != 2) return false;
		for(int i = 3; i*i <= num; i+=2){
			if(num % i == 0) return false;
		}
		return true;
	}
}
