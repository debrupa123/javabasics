//Java Program to print the elements of an array
//Java Program to print the elements of an array in reverse order
package javaPoint_Array;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr= {1,2,9,7,6};
		//Display in original order
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		//Display in reverse order
		for(int i=arr.length-1;i>=0;i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

}
