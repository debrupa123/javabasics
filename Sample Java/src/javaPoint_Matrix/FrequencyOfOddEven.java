package javaPoint_Matrix;

import java.util.Scanner;

public class FrequencyOfOddEven {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int counteven=0,countodd=0;
		System.out.println();
		
		int a[][]=new int[r1][c1];
					
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println();
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				if(a[i][j]%2==0)
					counteven++;
				else
					countodd++;
			}
		}
		System.out.println("Even Numbers: "+counteven);
		System.out.println("Odd Numbers: "+countodd);
	}

}
