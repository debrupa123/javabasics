import java.util.Scanner;
import java.util.Arrays;
public class Basic {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String sub ="";
		int[] set=new int[26];
		int[] subset=new int[26];
		for(int i=0;i<26;i++)
		{
			set[i]=0;
		}
		String str=userInput.nextLine();
		str=str.toLowerCase();
		int num = userInput.nextInt();
		String[] subStr = new String[num];
		for(int i = 0; i< subStr.length;i++)
		{
			subStr[i] = userInput.next();
			sub=sub+subStr[i];
		}
		sub=sub.toLowerCase();
		
		for(int i=0;i<sub.length();i++)
		{
			if(sub.charAt(i)>=97 && sub.charAt(i)<=122)
				subset[str.charAt(i)-97]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
				set[str.charAt(i)-97]++;
		}

		boolean status=Arrays.equals(set, subset);
		if(status == true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
