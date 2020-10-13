//Java Program to Find 2nd Largest Number in an array
//Java Program to Find 3rd Largest Number in an array
package javaPoint_Array;

import java.util.Arrays;

public class SecondLargest_ThirdLargest {

	public static void main(String[] args) {
		int[] arr= {2,77,9,5,90};
		//Displaying the elements
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		// 2nd Largest Number in an array
		System.out.println(arr[arr.length-2]);
		// 3rd Largest Number in an array
		System.out.println(arr[arr.length-3]);
	}

}
