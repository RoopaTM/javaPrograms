package com.java.Arrayprograms;

public class First_Min
{

	public static void main(String[] args) 
	{
		int[] arr= {20,81,78,3,5};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]);

	}

}
