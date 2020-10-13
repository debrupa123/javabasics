//Java Program to find the sum of each row and each column of a matrix
package javaPoint_Matrix;
public class SumOfRowNCol {

	public static void main(String[] args) {
		
		int [][] a= {	
						{1,2},
						{6,1},
						{5,0}
					};
		int row=a.length;
		int col=a[0].length;
		int srow,scol;
		for(int i=0;i<row;i++)
		{
			srow=0;
			for(int j=0;j<col;j++)
			{
				srow=srow+a[i][j];
			}
			System.out.println("Summation of "+(i+1)+"th row: "+srow);
		}
		for(int j=0;j<col;j++)
		{
			scol=0;
			for(int i=0;i<row;i++)
			{
				scol=scol+a[i][j];
			}
			System.out.println("Summation of "+(j+1)+"th coloumn: "+scol);
		}
	}

}
