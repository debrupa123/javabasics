//Palindrome String
import java.util.Scanner;
public class PaliString {

	public static void main(String[] args) {
		String orig,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word:");
		orig=sc.nextLine();
		int l=orig.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+orig.charAt(i);
		}
		if(orig.equalsIgnoreCase(rev))
			System.out.println(orig+" is palindrome");
		else
			System.out.println(orig+" is not palindrome");
	}
	/*System.out.println("Enter the number of names:");
	int num = userInput.nextInt();
	
	String[] names = new String[num];
	
	System.out.println("Enter the names: ");
	for(int i = 0; i< names.length;i++)
	{
		names[i] = userInput.next();
	}
	
	for(int i = 0; i< names.length;i++)
	{
		char ini = names[i].charAt(0);
		if(ini == 'A' || ini == 'E' || ini == 'I' || ini == 'O' || ini == 'U')
		{
			System.out.println("Begins with vowel : " + names[i]);
		}
		else
		{
			System.out.println("Begins with consonent : " + names[i]);
		}
		
	}*/
}
