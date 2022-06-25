package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Remove_Duplicates_And_PRint 
{

	public static void main(String[] args) 
	{
		
		String string="Hello world 123 Hello Hello";
		  String[] str = string.split(" ");
		  
		  LinkedHashSet<String> set=new LinkedHashSet<String>();
		  for(int i=0;i<str.length;i++)
		  {
			  set.add(str[i]);
		  }
		  
		  for(String word:set)
		  {
			
			  System.out.print(word+" ");
		  }
	}
	}

