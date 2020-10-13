//Java Program to copy all elements of one array into another array
package javaPoint_Array;
import java.util.Scanner;
public class CopyCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[] arr1=new int[num];
		int[] arr2=new int[num];
		
		for(int i=0;i<num;i++)
			arr1[i]=in.nextInt();
		
		for(int i=0;i<num;i++)
			arr2[i]=arr1[i];
		
		for(int i=0;i<num;i++)
			System.out.print(arr2[i]+"\t");
	}

}
