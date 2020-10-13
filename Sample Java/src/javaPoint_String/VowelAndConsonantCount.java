// Java Program to count the total number of vowels and consonants in a string
package javaPoint_String;
import java.util.Scanner;
public class VowelAndConsonantCount {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int vowelCnt=0,consoCnt=0;
		str=str.toLowerCase();
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				vowelCnt++;
			else if(ch > 'a' && ch <= 'z')
				consoCnt++;
		}
		System.out.println(vowelCnt);
		System.out.println(consoCnt);
	}

}
