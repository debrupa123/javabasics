//Java Program to count the total number of characters in a string
package javaPoint_String;
import java.util.Scanner;
public class CountCharacters {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		/*next() takes tokens which comes before whitespace & nextLine() takes all the
		 *  tokens in the buffer*/ 
		String str=in.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				continue;
			else
				count++;
		}
		System.out.println(count);
	}

}
