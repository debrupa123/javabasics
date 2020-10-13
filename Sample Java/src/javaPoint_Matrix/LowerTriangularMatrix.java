//Java Program to display the lower triangular matrix
package javaPoint_Matrix;
import java.util.Scanner;
public class LowerTriangularMatrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		
		if(r1==c1)
		{
			int a[][]=new int[r1][c1];
					
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=in.nextInt();
				}
			}
			System.out.println();
			System.out.print("\nLower Triangular Matrix\n");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(j>i)
					{
						a[i][j]=0;
						System.out.print(a[i][j]+" ");
					}
					else
					{
						System.out.print(a[i][j]+" ");
					}	
				}
				System.out.println();
			}
		}
		else
			System.out.print("Matrices should be square");

	}

}
