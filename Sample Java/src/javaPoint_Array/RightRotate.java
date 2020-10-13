//Java Program to right rotate the elements of an array
package javaPoint_Array;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
		int[] arr= {1,8,9,5,4};
		int last,j,n=3;
		 System.out.println(Arrays.toString(arr));
		//n is the number of times the elements are to be right rotated
		for(int i=0;i<n;i++)
		{
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--)
				arr[j]=arr[j-1];
			arr[j]=last;
		}
		//after n times right rotation
		System.out.println(Arrays.toString(arr));	
	}
}
