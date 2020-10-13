//Java Program to sort the elements of an array in ascending order
package javaPoint_Array;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr= {1,3,5,33,21,4};
		int temp=0;
		//original order
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//ascending order
		System.out.println(Arrays.toString(arr));
	}
}
