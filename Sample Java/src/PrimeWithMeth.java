//Prime Number Program using Method
import java.util.Scanner;
public class PrimeWithMeth {
	
	static void checkPrime(int num)
	{
		int flag=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i == 0)
				flag++;
		}
		if(flag == 2)
			System.out.println(num+ " is prime");
		else
			System.out.println(num+ " is not prime");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkPrime(num);

	}

}
