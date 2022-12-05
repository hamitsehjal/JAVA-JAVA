import java.util.Random;

public class RandomNumberExample5 {

	public static void main(String[] args) {

		// OUTPUT we need
		// I should call function "randomInts", give it a value, let's say its 5, it
		// should get back
		// a nice representation of 5 random number generated

		randomInts(5);
		randomIntsInBounds(12, 5, 7);
	}

	// IMP: IF YOU DON'T SPECIFY THE "the number of random number you want, you will
	// caught up in infinite loop
	public static void randomInts(int value) {
		// Create an object of Random class
		Random randomNumbers = new Random();

		System.out.println("Randomly Genereated Values: ");
		randomNumbers.ints(value).forEach(System.out::println);
	}

	public static void randomIntsInBounds(int value, int lower, int upper) {
		Random randomNumbers = new Random();

		System.out.println("Randomly Genereated Values: ");
		randomNumbers.ints(value, lower, upper).forEach(System.out::println);
	}
}

// RANDOM VALUES generated for You
// 1sst value
// secon value
// ..