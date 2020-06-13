package edu.lewisu.cs.klump.practice;

/* Ray Klump
 * This program repeatedly asks the user to guess a randomly generated number between
 * 1 and 10.
 */
import java.util.Scanner;
import java.util.Random;

public class GuessMyNumberApp {
	// this program asks the user to guess a random number
	// I think you will really like it.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target, guess;
		String keepGoing;
		Random rnd = new Random();
		do {
			target = 1+rnd.nextInt(10);
			do {
				System.out.print("Enter your guess: ");
				guess = sc.nextInt();
				if (target == guess) {
					System.out.println("Congratulations.");
				} else {
					System.out.println("Sorry. That is incorrect.");
				}
			} while (target != guess);
			System.out.print("Go again (y or n)? ");
			keepGoing = sc.next().toLowerCase().strip();
		} while (keepGoing.equals("y"));
		System.out.println("Thank you for playing.");
	}
}
