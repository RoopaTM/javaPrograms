package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Print_Occurance_of_Each_Character 
{

	public static void main(String[] args) 
	{
		String str="Roopa";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++)  
		{
			set.add(str.charAt(i)); //add all char from string into set,and it will check the element is already present
			                        //set is having i n d a
		}
		for(char ch:set)
		{ 
			int count=0;  // to keep track of number of occurance
			for(int i=0;i<str.length();i++) //read all character from the string str
			{
				if(ch==str.charAt(i))   //if the elemet is matching inc the count value
				{
					count++;
				}
			}
			System.out.print(" "+ch+"="+count);
		}

	}

}
