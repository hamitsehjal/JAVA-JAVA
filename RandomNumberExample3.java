// Using the Random Class


// The nextDouble() and nextFloat() method generates random value between 0.0 and 1.0.
import java.util.Random;

public class RandomNumberExample3 {

	public static void main(String[] args) {
		
		// Create a Random Object
		Random randomNumber=new Random();
		
		// get a random value between 0 to 99
		int x=randomNumber.nextInt(100);
		
		// get a random value between 0 to 45
		int y=randomNumber.nextInt(46);
		
		System.out.println("Randomly Generated Numbers: \n");
		System.out.println("First Time: "+ x);
		System.out.println("Second Time: "+ y);
		
	
				double p=randomNumber.nextDouble();
			
				double q=randomNumber.nextDouble();
				
				System.out.println("Randomly Generated Numbers-DOUBLE: \n");
				System.out.println("First Time: "+ p);
				System.out.println("Second Time: "+ q);
				
				

				boolean a=randomNumber.nextBoolean();
			
				boolean b=randomNumber.nextBoolean();
				
				System.out.println("Randomly Generated Numbers-Boolean: \n");
				System.out.println("First Time: "+ a);
				System.out.println("Second Time: "+ b);
	}

}
