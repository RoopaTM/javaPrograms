package com.java.StringPrograms;

import java.util.LinkedHashSet;

public class Print_Occurance_Of_EachWord 
{

	public static void main(String[] args)
	{
	  String string="Hello world 123 Hello";
	  String[] str = string.split(" ");
	  
	  LinkedHashSet<String> set=new LinkedHashSet<String>();
	  for(int i=0;i<str.length;i++)
	  {
		  set.add(str[i]);
	  }
	  
	  for(String word:set)
	  {
		  int count=0;
		  for(int i=0;i<str.length;i++)
		  {
			  if(word.equals(str[i]))
			  {
				  count++;
			  }
		  }
		  System.out.println(word+" "+count);
	  }

	}

}
