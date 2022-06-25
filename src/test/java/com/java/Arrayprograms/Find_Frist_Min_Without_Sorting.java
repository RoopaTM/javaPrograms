package com.java.Arrayprograms;

public class Find_Frist_Min_Without_Sorting 
{

	public static void main(String[] args) 
	{
		int[] arr= {100,43,22,56,71};
		int minNumber=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(minNumber>arr[i])
			{
				minNumber=arr[i];
			}
		}
		System.out.println(minNumber);

	}

}
