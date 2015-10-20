package com.freddy.kilo.muliples3and5of1000;

import java.util.HashSet;

public class MultiplesOf3And5 {

	public static void main(String[] args) {
		int result = 0;
		System.out.println(getSumOfMuliples(3, 5, 1000));
	}

	public static int getSumOfMuliples(int multipleOf1, int multipleOf2, int limit) {
		HashSet<Integer> resultList = new HashSet<Integer>();
		int sum = 0;
		for(int i = 0; i < limit; i++){
			if(i % multipleOf1 == 0 || i % multipleOf2 == 0){
				resultList.add(i);
			}
		}
		for (Integer integer : resultList) {
			sum += integer;
		}
		return sum;
	}
}
