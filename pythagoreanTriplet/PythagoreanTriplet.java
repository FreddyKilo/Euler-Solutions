package com.freddy.kilo.pythagoreanTriplet;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		for (int a = 1; a < 1000; a++) {
			for (int b = 1; b < 1000; b++) {
				if (isSumNatural(a, b)) {
					int c = (int) Math.sqrt(a * a + b * b);
					if (isSumOneThousand(a, b, c)) {
						System.out.println("The product of " + a + ", " + b + ", and " + c + " is " + a * b * c);
						return;
					}
				}
			}
		}
	}

	public static boolean isSumOneThousand(int a, int b, int c) {
		return a + b + c == 1000;
	}

	public static boolean isSumNatural(int a, int b) {
		return Math.sqrt(a * a + b * b) % 1 == 0;
	}

}
