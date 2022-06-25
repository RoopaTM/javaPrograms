package com.java.Arrayprograms;

public class Find_FristMax_And_Second_Maximum
{

	public static void main(String[] args) 
	{
		int[] arr= {20,3,100,45,30};
		int Fmax=arr[0];
		int Smax=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(Fmax<arr[i])
			{
				Smax=Fmax;
				Fmax=arr[i];
			}
			else if(Smax<arr[i])
			{
				Smax=arr[i];
			}
		}
System.out.println(Fmax+" "+Smax);
	}

}
