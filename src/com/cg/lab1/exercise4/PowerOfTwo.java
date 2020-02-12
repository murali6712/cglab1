package com.cg.lab1.exercise4;

public class PowerOfTwo {
	boolean flag = true;
	boolean checkNumber(int number) {
		// TODO Auto-generated method stub
		if (number <= 1)
		{
			return false;
		}
		while (number > 1)
		{
			if (number % 2 != 0)
			{
				return false;
			}
			number = number/2;
		}
		return flag;
	}
	
}
