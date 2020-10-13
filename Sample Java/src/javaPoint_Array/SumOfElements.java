//Java Program to print the number of elements present in an array
//Java Program to print the sum of all the items of the array
package javaPoint_Array;

import java.util.Arrays;

public class SumOfElements {

	public static void main(String[] args) {
		 int[] arr= {1,22,3,5,2,1};
		 int sum=0;
		 System.out.println(Arrays.toString(arr));
		 //print the number of elements present in an array
		 System.out.println(arr.length);
		 
		 for(int i=0;i<arr.length;i++)
			 sum += arr[i];
		 //print the sum of all the items of the array
		 System.out.println(sum);
	}

}
