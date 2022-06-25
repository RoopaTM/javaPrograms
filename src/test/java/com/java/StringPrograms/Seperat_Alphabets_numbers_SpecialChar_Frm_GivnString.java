package com.java.StringPrograms;

public class Seperat_Alphabets_numbers_SpecialChar_Frm_GivnString
{

	public static void main(String[] args) 
	{
		String str="abc+&$78+%a67"; //output:abca 7867 +&$+%
		String alphabets="";
		String numbers="";
		String specialChar="";
		
	for(int i=0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
		{
			alphabets=alphabets+ch;
		}
		else if(ch>='0' && ch<='9')
		{
			numbers=numbers+ch;
		}
		else
		{
			specialChar=specialChar+ch;
		}
	}
	System.out.println(alphabets+" "+numbers+" "+ specialChar);
		

	}

}
