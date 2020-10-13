import java.util.Scanner;
public class FiboWithRec {
	static int n1=0,n2=1,n3,limit;
	static void calculateFibo(int limit)
	{
		if(limit>0)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			calculateFibo(limit-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit:");
		limit=sc.nextInt();
		System.out.print(n1+" "+n2);
		calculateFibo(limit-2);
		
	}

}
