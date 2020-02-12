package com.cg.lab1.exercise2;

public class SumOfSquares {
	int calculateDifference(int n)
	{
		int SumOfSquare = (n*(n+1)*(2*n+1)) / 6;
		int SquareOfSum = ((n*(n+1)) / 2)*((n*(n+1)) / 2);
		int difference = SumOfSquare - SquareOfSum ;
		System.out.print("Difference of SumOfSquare and SquareOfSum is:");
		return difference;
	}
}
