package com.java.StringPrograms;
public class Pattern_printing
{
	/*output:h
             he
             hel
             hell*/
	public static void main(String[] args) 
	{
		String str="hell"; 
		String add="";
		for(int i=0;i<str.length();i++)
		{
	
			add=add+str.charAt(i);
			System.out.println(add);
		}
		
	
		}

	}


