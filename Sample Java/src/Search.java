import java.util.Scanner;
public class Search {
	static int linearSearch(int arr[],int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
				return i+1;
		}
		return -1;
	}
	static int binarySearch(int arr[],int n,int key)
	{
		int lb=0,ub=n-1,mid;
		mid=(lb+ub)/2;
		for(int i=lb;i<=ub;i++)
		{
			if(arr[ mid]==key)
				return mid+1;
			else if(arr[mid]>key)
				ub=mid-1;
			else
				lb=mid+1;
			mid=(lb+ub)/2;
		}
		return -1;
	}

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
	System.out.print("Enter the key element :");
	int key=in.nextInt();
	
	System.out.println(key+" is found at position "+linearSearch(numSet,key));
	System.out.print(key+" is found at position "+binarySearch(numSet,limit,key));
	}

}
