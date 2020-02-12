package com.cg.lab1.exercise4;

import java.util.Scanner;

public class PowerOfTwoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		PowerOfTwo obj = new PowerOfTwo();
		System.out.println(obj.checkNumber(input));
	}
}
