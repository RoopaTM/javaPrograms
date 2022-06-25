package com.java.StringPrograms;

public class Reverse_of_String_With_Third_VAriable 
{

	public static void main(String[] args) 
	{
		String str="Roopa";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
