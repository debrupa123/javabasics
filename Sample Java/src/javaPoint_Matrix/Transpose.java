// Java Program to find the transpose of a given matrix
package javaPoint_Matrix;
import java.util.Scanner;
public class Transpose {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int row=in.nextInt();
		int col=in.nextInt();
		int[][] a=new int[row][col];
		int[][] transpose=new int[col][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				transpose[i][j]=a[j][i];
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println();
		}
	}

}
