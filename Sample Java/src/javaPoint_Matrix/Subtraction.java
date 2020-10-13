//Java Program to subtract the two matrices
package javaPoint_Matrix;
import java.util.Scanner;
public class Subtraction {

	public static void main(String[] args) {
		/*int a[][]= {{1,2},{3,4}};
		int b[][]= {{8,9},{6,7}};
		int c[][]=new int[2][2];
		int row=a.length;
		int col=a[0].length;*/
		
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int r2=in.nextInt();
		int c2=in.nextInt();
		
		if(r1==r2 && c1==c2)
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c1];
		
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
				for(int j=0;j<c1;j++)
				{
					c[i][j]=a[i][j]-b[i][j];
					System.out.print(c[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else
			System.out.print("Matrices should be square");
	}

}
