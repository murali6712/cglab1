package com.cg.lab1.exercise3;

public class IncreasingNumber {
	boolean checkNumber(int number)
	{
		boolean flag = false;
		int increasing = number % 10;
		number = number / 10;
		
		while (number > 0)
		{
			if(increasing <= number % 10)
			{
				flag = true;
				break;
			}
			increasing = number % 10;
			number = number / 10;
		}
		if(flag)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
		return flag;
	}
}
