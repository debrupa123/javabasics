//Java Program to determine whether a given matrix is a sparse matrix
package javaPoint_Matrix;
import java.util.Scanner;
public class SparseMatrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		int size=row*col;
		int countzero=0;
		
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==0)
					countzero++;
			}
		}
		if(countzero>(size/2))
			System.out.print("Matrix is Sparse");
		else
			System.out.print("Matrix is not Sparse");
	}

}
