//Prime Number Program
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number(except 0 & 1) : ");
		int num=sc.nextInt();
		int flag=1;

		for(int i=2;i<num;i++)
		{
			if(num%i == 0)
			{
				flag=0;
				break;
			}	
			else
				continue;
		}
		if(flag == 1)
			System.out.println(num+ " is prime");
		else
			System.out.println(num+" is not prime");
	}

}
