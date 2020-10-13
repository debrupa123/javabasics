//Armstrong Number
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		int num,sum=0,m,d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		m=num;
		while(num!=0)
		{
			d=num%10;
			sum=sum+(d*d*d);
			num=num/10;
		}
		if(sum==m)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
