//Java to Program Find 2nd Smallest Number in an array
//Java to Program Find 3rd Smallest Number in an array
package javaPoint_Array;

import java.util.Arrays;

public class SecondSmallest_ThirdSmallest {

	public static void main(String[] args) {
		int[] arr= {2,6,1,8,0};
		//Displaying the elements
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		//2nd Smallest Number in an array
		System.out.println(arr[1]);
		//3rd Smallest Number in an array
		System.out.println(arr[2]);
	}

}
