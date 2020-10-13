//Print ASCII Value
import java.util.Scanner;
public class Interchange {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char letter = in.nextLine().charAt(0);
		int asciii=letter;
		System.out.println("ASCII :"+ asciii);*/
		
		for(int i=65;i<=90;i++)
		{
			System.out.println("ASCII of "+(char)i+" is: "+i);
			System.out.println("ASCII of "+(char)(i+32)+" is: "+(i+32));
		}
		
		
	}

}
