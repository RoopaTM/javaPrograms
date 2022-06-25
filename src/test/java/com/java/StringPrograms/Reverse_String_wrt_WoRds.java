package com.java.StringPrograms;

public class Reverse_String_wrt_WoRds 
{

	public static void main(String[] args) 
	{
		String str="welcome to tyss";
		String[] splitedwords =str.split(" ");
		//String rev="";
		for(int i=splitedwords.length-1;i>=0;i--)
		{
			System.out.print(splitedwords[i]+" ");
		}

	}

}
