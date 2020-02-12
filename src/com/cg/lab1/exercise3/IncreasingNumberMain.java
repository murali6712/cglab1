package com.cg.lab1.exercise3;

import java.util.Scanner;

public class IncreasingNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number to Check Weather if the number is increasing or not");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		IncreasingNumber obj = new IncreasingNumber();
		obj.checkNumber(input);
	}

}
