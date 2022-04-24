package week2.day1;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss"; 
	
		if(text1.length()==text1.length())
		{
			char[] array1 = text1.toCharArray();
			char[] array2 = text2.toCharArray();
			
			Arrays.sort(array1);
			
			Arrays.sort(array2);
			
			System.out.println(array1);
			System.out.println(array2);
			
			if (text1.equals(text2))
			{
			
			System.out.println(text1 + "and " +text2 +"are anagaram");
			
			}
			else
			{
			
			System.out.println(text1 + "and " +text2 +"not an anagaram");
			
		}
	
	}

	}

}
