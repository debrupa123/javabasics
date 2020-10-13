import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;
public class Randomly {

	public static void main(String[] args) {
		//Using the Math.random() Method
		System.out.println("Random number: "+ Math.random());
		
		//We can also use the following formula if we want to a generate random
		//number between a specified range. Math.random() * (max - min + 1) + min  
		int min=1000,max=9999;
		System.out.println("4-digit OTP :"+ (int)(Math.random()*(max-min+1)+min));
		
		Random ra=new Random();
		int randInt1=ra.nextInt(100);
		double randDouble1=ra.nextDouble();
		float randF1=ra.nextFloat();
		long randL1=ra.nextLong();
		boolean randB1=ra.nextBoolean();
		System.out.print(randInt1+" "+randDouble1+" "+randF1+" "+randL1+" "+randB1);
		
		System.out.println();
		
		int randInt=ThreadLocalRandom.current().nextInt(100,200);
		double randDouble=ThreadLocalRandom.current().nextDouble(100.5,200.5);
		float randF=ThreadLocalRandom.current().nextFloat();
		long randL=ThreadLocalRandom.current().nextLong();
		boolean randB=ThreadLocalRandom.current().nextBoolean();
		System.out.print(randInt+" "+randDouble+" "+randF+" "+randL+" "+randB);
		
	}

}
