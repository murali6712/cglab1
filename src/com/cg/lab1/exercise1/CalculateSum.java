package com.cg.lab1.exercise1;

public class CalculateSum {
	int calculateSum(int sum)
	{
		int nSum = 0;
		for(int index=0; index<sum; index++)
		{
			if(sum % 3 == 0 || sum % 5 == 0)
			{
				sum = sum + index;
				
			}
		}
		
		return sum;
	}

}
