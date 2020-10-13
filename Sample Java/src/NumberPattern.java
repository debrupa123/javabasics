
public class NumberPattern {

	public static void main(String[] args) {
		int n=5;
		//Pattern-1
		for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-2
		 int p=1;
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(p+" ");
				 p++;
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-3
		 for(int i = 1; i <= n; i++) 
		    { 
		          for(int k=n-i;k>=1;k--)
		          {
		        	  System.out.print(" ");
		          }
		    int C=1;// used to represent C(line, i) 
		    for(int j = 1; j <= i; j++) 
		    {  
		        // The first value in a line is always 1 
		        System.out.print(C+" "); 
		        C = C * (i - j) /j;  
		    } 
		    System.out.println(); 
		    } 
		 	System.out.println(); 
		 	
		 	/*int coe=1,rows = 6;  
		    for(int i = 0; i < rows; i++) {  
		           for(int space = 1; space < rows - i; ++space) {  
		               System.out.print("  ");  
		           }  
		  
		           for(int j = 0; j <= i; j++) {  
		               if (j == 0 || i == 0)  
		                   coe = 1;  
		               else  
		                   coe = coe * (i - j + 1) / j;  
		  
		               System.out.printf("%4d", coe);  
		           }  
		     System.out.println();  
		       }  */
		 //Pattern-4
		for(int i=1;i<=n;i++)
		{
			for(int k=n-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		System.out.println();
		 //Pattern-5
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-6
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=n;j>=i;j--)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-7
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-8
		 for(int i=1;i<=n;i++)
		 {
			 int num;
			 if(i%2 == 0)
			 {
				 num=0;
				 for(int j=1;j<=n;j++)
				 {
					 System.out.print(num);
					 num=(num==0)?1:0;
				 }
				 System.out.println();
			 }
			 else
			 {
				 num=1;
				 for(int j=1;j<=n;j++)
				 {
					 System.out.print(num);
					 num=(num==0)?1:0;
				 }
				 System.out.println();
			 }
		 }
		 System.out.println();
		 
		 //Pattern-9
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j%2+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-10
		 for(int i=n;i>=1;i--)
		 {
			 for(int k=i;k<n;k++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=n-i+1;j<=n;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--)
		 {
			 for(int k=i-1;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-11
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-12
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=n;j>=i;j--)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 // Pattern-13
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-14
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-15
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 for(int l=i-1;l>=1;l--)
			 {
				 System.out.print(l+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-16
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 for(int i=2;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 // Pattern-17
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=i;k>1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 for(int i=n-1;i>=1;i--)
		 {
			 for(int k=i-1;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print(j);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-18
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n-i;k>=1;k--)
			 {
				 System.out.print(1);
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-19
		 for(int i=1;i<=n;i++)
		 {
			 int num=i;
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(num+" ");
				 num+=n-j;
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Pattern-20
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=i;j<=n;j++)
			 {
				 System.out.print(j+" ");
			 }
			 for(int l=1;l<=i-1;l++)
			 {
				 System.out.print(l+" ");
			 }
			 System.out.println();
		 }
		 //Pattern-21
		 
	}  

}

