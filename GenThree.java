/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args [1]);
		
		// Generates three random numbers in the range
		int random1 = (int) (a + (Math.random() * (b-a)));
		int random2 = (int) (a + (Math.random() * (b-a)));
		int random3 = (int) (a + (Math.random() * (b-a)));
		int min_num = Math.min(Math.min(random1, random2), random3);

		System.out.println(random1);
		System.out.println(random2);
		System.out.println(random3);
		System.out.println("The minimal generated number was " + min_num);
	}
}
