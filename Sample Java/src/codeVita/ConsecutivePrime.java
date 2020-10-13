package codeVita;
import java.util.Scanner;
public class ConsecutivePrime {
	static int getprime(int num)
	{
		int check=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				check++;
		} 
		if(check == 2)
			return num;
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime[]=new int[1000];
		int j=0,count=0;
		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		for(int i=1;i<=N;i++)
		{
			if(getprime(i)!=0)
			{	
				prime[j]=getprime(i);
				j++;
			}
		}
		for(int k=2;k<j;k++)
		{
			int sum=0;
			for(int l=0;l<j;l++)
			{
				sum+=prime[l];
				if(sum==prime[k])
				{
					count++;
					break;
				}
				if(sum>prime[k])
					break;
			}
		}
		System.out.print(count);
	}

}
