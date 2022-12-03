
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberExample4 {

	public static void main(String[] args) {
		int a = ThreadLocalRandom.current().nextInt(100, 200);
		int b = ThreadLocalRandom.current().nextInt(1000, 1001);

		System.out.println("Value of a is: " + a);
		System.out.println("Value of a is: " + b);

		double p = ThreadLocalRandom.current().nextDouble(32);
		double q = ThreadLocalRandom.current().nextDouble(1);

		System.out.println("Value of a is: " + p);
		System.out.println("Value of a is: " + q);

	}

}
