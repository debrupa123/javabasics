//Java Program to Print Odd and Even Numbers from an array
package javaPoint_Array;

import java.util.Arrays;

public class OddEvenElement {

	public static void main(String[] args) {
		int[] arr= {67,98,02,64};
		//Displaying the elements
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				//EvenNumbers
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)	
		{
			if(arr[i]%2!=0)
				//OddNumbers
				System.out.print(arr[i]+" ");
		}

	}

}
