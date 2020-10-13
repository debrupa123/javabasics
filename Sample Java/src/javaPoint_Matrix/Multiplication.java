// Java Program to Multiply Two Matrices
package javaPoint_Matrix;
import java.util.Scanner;
public class Multiplication {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int r2=in.nextInt();
		int c2=in.nextInt();
		
		if(c1==r2)
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c2];
		
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
			System.out.print("\nResultant Matrix\n");
		
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{	
					c[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.print("Multiplication not possible");

	}

}
