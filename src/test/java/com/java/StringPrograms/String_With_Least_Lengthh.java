package com.java.StringPrograms;

public class String_With_Least_Lengthh 
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
		
		System.out.println(maxLengthOfString);
	}

}
