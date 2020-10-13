//Java Program to determine whether two matrices are equal
package javaPoint_Matrix;
import java.util.Scanner;
public class IdenticalOrNot {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int r2=in.nextInt();
		int c2=in.nextInt();
		int check=1;
		System.out.println();
		
		if(r1==r2 && c1==c2)
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
		
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=in.nextInt();
				}
			}
			System.out.println();
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=in.nextInt();
				}
			}
			System.out.println();
		
		
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						check=0;
						break;
					}
				}
			}
			if(check==1)
				System.out.println("Identical Matrices");
			else
				System.out.println("Not Identical Matrices");
		}
		else
			System.out.print("Matrices should be square");

	}

}
