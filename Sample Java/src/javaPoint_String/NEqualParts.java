//Java Program to divide a string in 'N' equal parts.
package javaPoint_String;
import java.util.Scanner;
public class NEqualParts {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int N = in.nextInt();
		int len=str.length();
		int temp=0;
		String[] equalprt=new String[N];
		int ch=len/N;
		if(len%N!=0)
		{
			System.out.println("String cannot be divided into "+N+" equal parts.");
		}
		else
		{
			for(int i=0;i<len;i=i+ch)
			{
				equalprt[temp]=str.substring(i,i+ch);
				temp++;
			}
			for(int i=0;i<equalprt.length;i++)
			{
				System.out.print(equalprt[i]+" ");
			}
		}
	}
}
