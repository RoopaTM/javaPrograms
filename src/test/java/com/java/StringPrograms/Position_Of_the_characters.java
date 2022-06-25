package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Position_Of_the_characters 
{

	public static void main(String[] args) 
	{
		String str="Roopaa";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
        	set.add(str.charAt(i));
        }
        
        for(char ch:set)
        {
        	for(int i=0;i<str.length();i++)
        	{
        		if(ch==str.charAt(i))
        		{
        			System.out.print(" "+ch+"="+(i+1));
        			break;
        		}
        	}
        }
	}

}
