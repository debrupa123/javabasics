
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String name = "Debrupa";
		System.out.println(name.length());
		
		//Using the Math.random() Method
		System.out.println("Random number: "+ Math.random());
		
		//We can also use the following formula if we want to a generate random
		//number between a specified range. Math.random() * (max - min + 1) + min  
		int min=1000,max=9999;
		System.out.println("4-digit OTP :"+ (int)(Math.random()*(max-min+1)+min));
		
		int i=2%3;
		System.out.println(i);//2
		int j=2/3;
		System.out.println(j);//0
	}

}
