package com.java.Arrayprograms;

public class Find_Frist_Max_And_Second_Minimum 
{

	public static void main(String[] args) 
	{

		int[] arr= {89,3,100,45,30};
		int Fmin=arr[0];
		int Smin=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(Fmin>arr[i])
			{
				Smin=Fmin;
				Fmin=arr[i];
			}
			else if(Smin>arr[i])
			{
				Smin=arr[i];
			}
		}
		System.out.println(Fmin+" "+Smin);
	}

}


