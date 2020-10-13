
public class StarPattern {

	public static void main(String[] args) {
		int n=5;
		//Right Triangle Star Pattern
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Pyramid Star Pattern
		for(int i=1 ;i<=n ;i++  )
		{
			for(int k=n-i ;k >=1 ;k--)
			{
				System.out.print(" ");
			}
			for(int j=1 ;j<=i ;j++  )
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Left Triangle Star Pattern
		for (int i=1; i<=n; i++)   
		{  
			for (int k=2*(n-i); k>=1; k--)         
			{  
				System.out.print(" ");   
			}  
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");   
			}
			System.out.println();
		}
		System.out.println();
		//Downward Triangle Star Pattern
		for(int i=n;i>=1;i--)
		{
			for(int j= 1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Mirrored Right Triangle Star Pattern
		for(int i=1 ;i<=n ;i++  )
		{
			for(int k=n-i ;k >=1 ;k--)
			{
				System.out.print(" ");
			}
			for(int j=1 ;j<=i ;j++  )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Reverse Pyramid Star Pattern
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Right Down Mirror Star Pattern
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Right Pascal's Triangle
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Left Pascal's Triangle
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		//Sandglass Star Pattern With A Twist
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//Alphabet Star Pattern
		for(int i=1;i<=n+1;i++)
		{
			for(int j=1;j<=n/2+1;j++)
			{
				if((j==1 || j==n/2+1) && i!=1 || i==1 && j!=n/2+1 || i==n/2+1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//Triangle Star Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n-i;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 if(j==1 || j==2*i-1 || i==n)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Down Triangle Pattern
		 for(int i=n;i>=1;i--)
		 {
			 for(int k=i;k<n;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 if(j==1 || j==2*i-1 || i==n)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Diamond Star Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n-i;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 if(j==1 || j==2*i-1)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--)
		 {
			 for(int k=i;k<n;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 if(j==1 || j==2*i-1)
					 System.out.print("*");
				 else
					 System.out.print(" ");
			 }
			 System.out.println();
		 }
	}

}
