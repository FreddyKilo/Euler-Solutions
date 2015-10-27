package com.freddy.kilo.smallestEvenlyDivisibleBy20;

public class SmallestEvenlyDivisibleBy20 {

	public static void main(String[] args) {
		System.out.println(theNumber(20));
	}
	
	public static long theNumber(int num) {
		long factorial = getFactorial(num);
		int i = num;
		while(num < factorial){
			i += num;
			int count = 0;
			for(int j = 2; j <= num; j++){
				if(i % j == 0){
					count++;
				} else {
					break;
				}
			}
			if(count == num - 1){
				return i; 
			}
		}
		return 0;
	}

	public static long getFactorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * getFactorial(num-1);
	}
	
}
