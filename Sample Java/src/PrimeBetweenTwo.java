//prime numbers between two numbers
 import java.util.Scanner;
public class PrimeBetweenTwo {
	static void checkPrime(int num)
	{
		int flag = 0;
		for(int i=1;i<=num;i++) 
		{
			if(num%i == 0)
				flag++;
		}
		if(flag == 2)
			System.out.print(num + " ");
		
	}

	public static void main(String[] args) {
		int start,end;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the starting :");
		start=sc.nextInt();
		System.out.println();
		System.out.print("Enter the ending :");
		end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			checkPrime(i);
		}
	}

}
