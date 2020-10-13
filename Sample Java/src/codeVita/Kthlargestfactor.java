package codeVita;
import java.util.Scanner;
public class Kthlargestfactor {

	public static void main(String[] args) {
		int arr[]=new int[1000];
		int j=0,fact=0;
		Scanner in=new Scanner(System.in);
		int N= in.nextInt();
		//System.out.print(",");
		int k=in.nextInt();
		for(int i=N;i>=1;i--)
		{
			if(N%i==0)
			{
				arr[j]=i;
				j++;
				fact++;
			}
		}
		if(k<=fact)
		{
				System.out.print(arr[k-1]);
		}
		else
			System.out.print(1);
	}

}
