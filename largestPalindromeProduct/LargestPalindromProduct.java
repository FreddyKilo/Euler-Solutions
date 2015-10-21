package com.freddy.kilo.largestPalindromeProduct;

public class LargestPalindromProduct {

	public static void main(String[] args) {
		System.out.println(getLargestPalindrome());
	}

	public static int getLargestPalindrome(){
		String productStr;
		int candidate = 100 * 100;
		for(int i = 100; i<999; i++){
			for(int j = 100; j<999; j++){
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
