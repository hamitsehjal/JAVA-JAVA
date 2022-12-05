

// We will create a JAVA  program that prints a random number between a specified range

// Math.random() * (max - min + 1) + min  
// In the above formula,  the min value is inclusive while the max value is exclusive.

// Let's create a program that generates random numbers between 200 to 400.

public class RandomNumberExample2 {

		public static void main(String[] args) {
			int min=200;
			int max=400;
			double a=Math.random()*(max-min+1)+min;
		    System.out.println("Random Number between 200 and 400 is: "+(Math.random()*(max-min+1)+min));
		    System.out.println("Random Number between 200 and 400 is: "+a);
			
		}
}
