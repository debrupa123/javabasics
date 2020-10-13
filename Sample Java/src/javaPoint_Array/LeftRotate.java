//Java Program to left rotate the elements of an array
package javaPoint_Array;

public class LeftRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,0,8,6};
		int i,n=3;
		for(int k=0;k<arr.length;k++) 
		{
			System.out.print(arr[k]+" ");	
		}
		System.out.println();
		//n is the number of times the elements are to be left rotated
		for(int j=0;j<n;j++)
		{
			int first=arr[0];
			for(i=0;i<arr.length-1;i++)
				arr[i]=arr[i+1];
			arr[i]=first;
		}
		//after n times left rotation
		for(int k=0;k<arr.length;k++) 
		{
			System.out.print(arr[k]+" ");
			
		}
	}

}
