//Java Program to print the duplicate elements of an array
package javaPoint_Array;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr= {1,8,7,7,0,8,0,1,1};
		
		//displaying the array
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					//printing the duplicate elements
				System.out.print(arr[i]+" ");
			}
		}
	}

}
