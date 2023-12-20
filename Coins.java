/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Gets and parses The quantity of cents from the command-line
		int total_cents = Integer.parseInt(args[0]);

		int num_of_quarters = (total_cents / 25);
		int num_of_cents = (total_cents % 25);
		System.out.println("Use " + num_of_quarters + " quarters and " + num_of_cents + " cents");
	}
}