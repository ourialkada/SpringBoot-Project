package com.ouri.SortingSpringBoot;

public class interviewQuestionsMethods {

	static String StringPalindrome(String s) 
	{
		int stringLength = s.length();
		String reversedString = "";
		for (int i = stringLength;i>0; i--)
		{
			reversedString = reversedString + s.charAt(i-1);
		}
		
		if(reversedString.equalsIgnoreCase(s))
		{
			return "The string IS a string palindrome";
		}
		
		
		
		return "The string IS NOT a string palindrome";
	}
	
	static String IntegerPalindrome (int number) 
	{
		String s = String.valueOf(number);
		s.trim();
		if(s == null || s=="")
		{
			return "please enter a number";
		}
	else
	{
		
		int stringLength = s.length();
		String reversedString = "";
		for (int i = stringLength;i>0; i--)
		{
			reversedString = reversedString + s.charAt(i-1);
		}
		
		if(reversedString.equalsIgnoreCase(s))
		{
			return "The number IS a string palindrome";
		}
		
	}
		
		return "The number IS NOT a string palindrome";
		
	}
	
	
}
