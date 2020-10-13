// Java Program to print the elements of an array present on even position
//Java Program to print the elements of an array present on odd position
package javaPoint_Array;

public class EvenOddPosition {

	public static void main(String[] args) {
		int[] arr= {3,6,8,66,9};
		for(int i=1;i<arr.length;i+=2)
		{
			//elements at even positions
			//if(i%2!=0)
				System.out.print(arr[i]+" ");			
		}
		System.out.println();
		for(int i=0;i<arr.length;i+=2)
		{
			//elements at odd positions
			//if(i%2==0)
				System.out.print(arr[i]+" ");			
		}
		System.out.println();
	}

}
