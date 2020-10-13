import java.util.Scanner;
import java.util.Arrays;
public class Sort {  
	
	/*static void bubbleSort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("--Sorted Array--");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	static void selectionSort(int arr[],int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("--Sorted Array--");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}*/
	

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.print("Enter the number of elements :");
		 int limit=in.nextInt();
		 
		 int[] numSet=new int[limit];
		 System.out.print("Enter the elements :");
		 for(int i=0;i<numSet.length;i++)
		 {
			numSet[i]=in.nextInt();
		 }
		 Arrays.sort(numSet);
		 for(int i=0;i<limit;i++)
				System.out.print(numSet[i]+" ");
			System.out.println();
		 
		 /* bubbleSort(numSet,limit);
		  selectionSort(numSet,limit);*/
		  
	}

}
