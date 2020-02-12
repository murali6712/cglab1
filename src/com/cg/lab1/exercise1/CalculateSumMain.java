package com.cg.lab1.exercise1;

import java.util.Scanner;

public class CalculateSumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Value to calculate the sum of natural numbers:");
		Scanner sc = new Scanner(System.in);
		int nNatural = sc.nextInt();
		CalculateSum obj = new CalculateSum();
		System.out.println(obj.calculateSum(nNatural));
	}

}
