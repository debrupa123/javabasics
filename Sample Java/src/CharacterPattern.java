//import java.util.Scanner;
public class CharacterPattern {

	public static void main(String[] args) {
		/*Scanner in=new Scanner(System.in);
		System.out.print("Enter a letter between A-Z: ");
		char letter=in.next().charAt(0);*/
		int n=5;
		int alpha=64;
		//Right Triangle Alphabetic Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print((char)(alpha+j)+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Repeating Alphabet Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print((char)(alpha+i)+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //K-shape Alphabet Pattern
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print((char)(alpha+j)+" ");
			 }
			 System.out.println();
		 }
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print((char)(alpha+j)+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Triangle Character Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n-i;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print((char)(alpha+j)+" ");
			 }
			 System.out.println();
		 }
		 System.out.println();
		 //Diamond Character Pattern
		 for(int i=1;i<=n;i++)
		 {
			 for(int k=n-i;k>=1;k--)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=2*i-1;j++)
			 {
				 if(j==1 || j==2*i-1)
					 System.out.print((char)(alpha+i)+" ");
				 else
					 System.out.print(" ");
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
				 if(j==1||j==2*i-1)
					 System.out.print((char)(alpha+i)+" ");
				 else
					 System.out.print(" ");
			}
			 System.out.println();
		 }
		 System.out.println();
	}

}
