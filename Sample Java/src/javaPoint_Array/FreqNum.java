//Java Program to find the frequency of each element in the array
package javaPoint_Array;

public class FreqNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,6,6,8,2,2,1};
		int[] fr=new int[arr.length];
		int count,visited=-1;
		
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//to avoid those elements already counted
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
		}
		for(int i=0;i<fr.length;i++)
		{
			if(fr[i]!=visited)
			{
				System.out.println(arr[i]+" is: "+fr[i]+" times");
			}
		}

	}

}
