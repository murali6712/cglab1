package com.cg.lab1.exercise2;

import java.util.Scanner;

public class DifferenceOfSumOfSquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to Calculate Sum of Squares and Squares of sum");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		SumOfSquares obj = new SumOfSquares();
		System.out.println(obj.calculateDifference(input));
	}

}
