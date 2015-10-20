package com.freddy.kilo.evenFibonacci;

import java.util.ArrayList;
import java.util.List;

public class EvenFibonacciSum {

	public static void main(String[] args) {
		
		int someNumber = 4_000_000;
		List<Integer> theResultList = createAFibonacciListUsing(someNumber);
		System.out.println(nowGetTheAnswerFromAdding(theResultList));
		
	}

	public static List<Integer> createAFibonacciListUsing(int limit) {
		int firstTerm = 1;
		int secondTerm = 2;
		int sum;
		List<Integer> fiboNumbers = new ArrayList<Integer>();
		fiboNumbers.add(firstTerm);
		fiboNumbers.add(secondTerm);
		while(firstTerm + secondTerm <= limit){
			sum = firstTerm + secondTerm;
			fiboNumbers.add(sum);
			firstTerm = secondTerm;
			secondTerm = sum;
		}
		return fiboNumbers;
	}
	
	public static int nowGetTheAnswerFromAdding(List<Integer> theList) {
		int sum = 0;
		for (Integer integer : theList) {
			if(integer % 2 == 0){
				sum += integer;
			}
		}
		return sum;
	}
	
}
