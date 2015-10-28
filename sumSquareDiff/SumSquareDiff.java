package com.freddy.kilo.sumSquareDiff;

public class SumSquareDiff {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(getSumOf(num) * getSumOf(num) - sumOfSquares(num));
	}

	public static int getSumOf(int num){
		if(num == 1){
			return 1;
		}
		return num + getSumOf(num-1);
	}
	
	public static int sumOfSquares(int num){
		if(num == 1){
			return 1;
		}
		return num * num + sumOfSquares(num - 1);
	}
	
}
