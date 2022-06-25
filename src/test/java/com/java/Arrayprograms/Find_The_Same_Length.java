package com.java.Arrayprograms;

public class Find_The_Same_Length 
{

	public static void main(String[] args) 
	{
		String str[]= {"hi0","a","hello","b","name"};
		String maxLengthOfString=str[0];
		for(int i=1;i<str.length;i++)
		{
			if(maxLengthOfString.length()>str[i].length())
			{
				maxLengthOfString=str[i];
			}
		}
		for(int i=0;i<str.length;i++)
		{
			if(maxLengthOfString.length()==str[i].length())
			{
				System.out.println(str[i]);
			}
		}
		
		//System.out.println(maxLengthOfString);
	}
}
