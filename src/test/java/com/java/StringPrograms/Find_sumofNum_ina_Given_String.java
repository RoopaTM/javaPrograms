package com.java.StringPrograms;

public class Find_sumofNum_ina_Given_String 
{

	public static void main(String[] args) 
	{
		String str="abc++$)67"; //output:6+7=13
		int sum=0;
	
		
	for(int i=0;i<str.length();i++)
	{
		
		if(str.charAt(i)>='0' && str.charAt(i)<='9')
		{
			int num=str.charAt(i)-48;
			System.out.println(num);
			sum=sum+num;
		}
		
	}
	System.out.println("sum of given numbers "+sum);
	}

}
