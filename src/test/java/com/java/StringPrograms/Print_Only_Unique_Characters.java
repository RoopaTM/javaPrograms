package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Print_Only_Unique_Characters 
{
			public static void main(String[] args) 
			{
				String str="Roopaatm";
				LinkedHashSet<Character> set= new LinkedHashSet<Character>();
				for(int i=0;i<str.length();i++)
				{
					set.add(str.charAt(i));
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
				if(count==1)
				{
					System.out.print(ch);
				}
				
			}

		}

}