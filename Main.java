import java.util.Random;
import java.util.Scanner;

public class MainRupprecht {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int random = new Random().nextInt(100);
			System.out.println("Try to guess the number between 0 and 99. Type 100 to quit");
			Scanner sc = new Scanner(System.in);
			while (!sc.hasNext()) {

			}
			try {
				int guess = Integer.parseInt(sc.nextLine());
				if (guess == random) {
					System.out.println("Correct!");
				} else if (guess > random) {

					System.out.println("Sorry too high, the number was "
							+ random + ".");
				} else {
					System.out.println("Sorry too low, the number was "
							+ random + ".");
				}
			} catch (NumberFormatException e) {
				System.err.println("Input was not a number");
			}
			
		
		

	}

}
