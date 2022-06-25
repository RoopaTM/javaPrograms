package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Remove_Only_Duplicate_in_Str
{
	public static void main(String[] args)
	{
		String str="Roopa"; //output:Ropa
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(char ch:set)
		{
			System.out.print(ch);
		}

	}

}
