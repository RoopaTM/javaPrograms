package com.java.Arrayprograms;

public class First_Max
{

	public static void main(String[] args) 
	{
		int[] arr= {20,40,80,79,10,3};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("maximum num "+ arr[0]);

	}

}
