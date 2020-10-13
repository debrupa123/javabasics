//Java Program to determine whether a given matrix is an identity matrix
package javaPoint_Matrix;
import java.util.Scanner;
public class IdentityMatrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r1=in.nextInt();
		int c1=in.nextInt();
		int flag=1;
		System.out.println();
		if(r1!=c1)
			System.out.println("Matrix should be square");
		else
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
		
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					if(i==j && a[i][j]!=1)
					{
						flag=0;
						break;
					}
					if(i!=j && a[i][j]!=0)
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
				System.out.println("Identity Matrix");
			else
				System.out.println("Not Identity Matrix");
		}
	}
}
