/*Java Program to determine whether two strings are the anagram 
-Two Strings are called the anagram if they contain the same characters. 
However, the order or sequence of the characters can be different.*/
package javaPoint_String;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length())
			System.out.println("Strings are not anagram");
		else
		{
			//Converting both the strings to character array  
			char[] string1 =str1.toCharArray();
			char[] string2=str2.toCharArray();
			//Sorting the arrays using in-built function sort ()  
			Arrays.sort(string1);
			Arrays.sort(string2);
			//Comparing both the arrays using in-built function equals ()  
			if(Arrays.equals(string1, string2)==true)
				System.out.println("Strings are anagram");
			else
				System.out.println("Strings are not anagram");
		}
	}

}
