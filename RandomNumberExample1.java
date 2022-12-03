

// Using the Math.random method

// Before we start,
// 1. The random() method is a static method of the Math class. 
// 2. It generates only double type random number greater than or equal to 0.0 and less than 1.0. 
// 3. Before using the random() method, we must import the java.lang.Math class.


import java.lang.Math;

public class RandomNumberExample1 {

	public static void main(String[] args) {
		// We can directly invoke the random() method
		System.out.println("First Random Number is: "+Math.random());
		System.out.println("Second Random Number is: "+Math.random());
		System.out.println("Third Random Number is: "+Math.random());
		System.out.println("Fourth Random Number is: "+Math.random());

		
	}

}
