//Java Program to sort the elements of an array in descending order
package javaPoint_Array;
import java.util.Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		int[] arr= {8,3,1,5,6};
		int temp=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
