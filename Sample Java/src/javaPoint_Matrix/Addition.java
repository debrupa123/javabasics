//Java Program to Add Two Matrices
package javaPoint_Matrix;

public class Addition {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4}};
		int b[][]= {{8,9},{6,7}};
		int c[][]=new int[2][2];
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
