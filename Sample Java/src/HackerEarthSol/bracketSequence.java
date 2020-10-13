/*A bracket sequence is a string that contains only characters '(' and ')'.

A correct bracket sequence is a bracket sequence that can be transformed into a correct 
arithmetic expression by inserting characters '1' and '+' between the original characters 
of the sequence. For example, bracket sequences '()()' and '(())' are correct. The 
resulting expressions of these sequences are: '(1)+(1)' and '((1+1)+1)'. 
However, '(', ')(', and '(' are incorrect bracket sequences. 

You are given a bracket sequence s(s1,s2,..) , where si denotes the type of i's bracket 
(open or close). It is not mandatory that s is necessarily correct. Your task is to 
determine the number of i's such that sisi+1..sn-1s1..si-1 is a correct bracket sequence.

Input format:

The single line contains sequence s.

Output format :

Print the number of shifts denoting the correct bracket sequence.

Constraints
|s|<=5X10^5

SAMPLE INPUT 
)()()(
SAMPLE OUTPUT 
3
Explanation
For all i=2,4,6, shift of string will be ()()(), which is correct bracket sequence. 
Since, answer is 3

Time Limit:	3.0 sec(s) for each input file.
Memory Limit:	256 MB
Source Limit:	1024 KB*/

package HackerEarthSol;
import java.util.Scanner;
public class bracketSequence {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		/*String s=in.next();
		int count=0,j,l=s.length();
		char[] seq=new char[l];*/
		int l=in.nextInt();
		int[] seq=new int[l];
		int j;
		for(int i=0;i<l;i++)
		{
			//seq[i]=s.charAt(i);
			seq[i]=in.nextInt();
		}
		
		for(int i=0;i<l;i++)
		{
			/*if(seq[0]=='(' && seq[l-1]==')')
			{
				count++;
			}*/
			int first=seq[0];

			for(j=0;j<l-1;j++)
				seq[j]=seq[j+1];
			
			seq[j]=first;
		} 
		//System.out.println(count);
		for(int i=0;i<l;i++)
			System.out.print(seq[i]);
	}

}
