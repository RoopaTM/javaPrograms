package com.java.StringPrograms;

public class Print_Voweles_In_Given_String 
{

	public static void main(String[] args) 
	{
		String str="india";  //output:i i a
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i')
			{
				System.out.print(ch);
			}
		}
	}

}
