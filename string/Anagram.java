package assignment.week3.string;

import java.util.Arrays;

public class Anagram {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		int length1 = text1.length();
		System.out.println("text1 length="+length1);
		int length2 =text2.length();
		System.out.println("text2 length="+length2);
		if(length1==length2) {
			System.out.println("continue");
		}
		else {
			System.out.println("Mismath string are not anagram");
		}
		char[] ch1 = text1.toCharArray();
		char[] ch2 = text2.toCharArray();
	Arrays.sort(ch1);
			Arrays.sort(ch2);
			//System.out.println(ch1);
			//System.out.println(ch2);
			if(Arrays.equals(ch1, ch2)) {
		
				System.out.println("The given text are Anagram");
		
     
			
		}
	}
	
	}


