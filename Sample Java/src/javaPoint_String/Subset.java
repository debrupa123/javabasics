//Java Program to find all subsets of a string
package javaPoint_String;
import java.util.Scanner;
public class Subset {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		String str=in.nextLine();
		int len=str.length();
		int n=(len*(len+1))/2;
		String[] subset=new String[n];
		int temp=0;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				subset[temp]=str.substring(i, j+1);
				temp++;
			}
		}
		for(int i=0;i<subset.length;i++)
		{
			System.out.println(subset[i]);
		}
	}

}
