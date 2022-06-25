package com.java.Arrayprograms;

public class Find_PrimeNum_in_Given_Array 
{

	public static void main(String[] args) 
	{
		int[] arr= {2,1,9,0,7,6,4,3};
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			int j=2;
			while(num>=j)
			{
				if(num%j==0)
				{
					break;
				}
				{
					j++;
				}
			}
			if(num==j)
			{
				System.out.print(" "+num);
			}
		}

	}

}
