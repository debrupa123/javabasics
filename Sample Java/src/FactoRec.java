//Factorial Program using recursion
import java.util.Scanner;  
public class FactoRec {
	
	static int findfacto(int n)
	{
		if(n==0 || n==1)
			return 1;
		else
			return n*findfacto(n-1);
	}
	public static void main(String[] args) {
		int fact;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		fact=findfacto(num);
		System.out.print(num+"!"+"="+fact);
	}

}
