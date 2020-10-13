//Java Program to print the largest element in an array
//Java Program to print the smallest element in an array
package javaPoint_Array;
import java.util.Arrays;
public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr= {22,44,111,55,6};
		//display the array
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		//print the smallest element in the array
		System.out.println(arr[0]);
		//print the largest element in the array
		System.out.println(arr[arr.length-1]);
	}

}
