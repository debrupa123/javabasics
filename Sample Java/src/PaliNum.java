//Palindrome number
import java.util.Scanner;
public class PaliNum {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,rev=0,d,m;
		System.out.print("Enter a number :");
		num=sc.nextInt();
		m=num;
		while(num != 0)
		{
			d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(m==rev)
			System.out.println("Palidrome Number");
		else
			System.out.println("Not Palidrome Number");
	}

}
