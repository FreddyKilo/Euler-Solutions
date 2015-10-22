package com.freddy.kilo.largestPalindromeProduct;

public class LargestPalindromProduct {

	public static void main(String[] args) {
		System.out.println(getLargestPalindrome(3));
	}

	public static int getLargestPalindrome(int digits){
		int upper = (int) Math.pow(10, digits);
		int lower = (int) Math.pow(10, digits - 1);
		String productStr;
		int candidate = 0;
		for(int i = lower; i<upper; i++){
			for(int j = lower; j<upper; j++){
				productStr = String.valueOf(i*j);
				if(productStr.equals(new StringBuilder(productStr).reverse().toString())){
					if(i * j > candidate)
					candidate = i*j;
				}
			}
		}
		return candidate;
	}
}
