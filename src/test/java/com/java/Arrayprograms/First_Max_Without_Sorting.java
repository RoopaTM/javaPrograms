package com.java.Arrayprograms;

public class First_Max_Without_Sorting 
{

	public static void main(String[] args) 
	{
		int arr[]= {10,30,3,52,32};
		int maxNumber=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(maxNumber<arr[i])
			{
				maxNumber=arr[i];
			}
		}
		System.out.println(maxNumber);

	}

}
