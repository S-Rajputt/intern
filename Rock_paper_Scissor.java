package Internship_project;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_Scissor {
	public static String determineWinner(String userChoice, String computerMove) {
		if (userChoice.equals(computerMove)) {
			return "its a tie";
		} else if ((userChoice.equals("Rock") && computerMove.equals("Scissors"))
				|| (userChoice.equals("Scissors") && computerMove.equals("Paper"))
				|| (userChoice.equals("Paper") && computerMove.equals("Rock"))) {
			return "You Win....";
		} else {
			return "Computer Win...";
		}

	}
	// Helper method to check if the user's choice is valid
    private static boolean isValidChoice(String choice, String[] validChoices) {
        for (String validChoice : validChoices) {
            if (validChoice.equalsIgnoreCase(choice)) {
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// Scanner class is used to take a user-input.
		Scanner sc = new Scanner(System.in);

		// Use random Class for Generate a Computer Choice Number.
		Random random = new Random();
		String[] choices = { "Rock", "Paper", "Scissors" };
		String userChoice;
        do {
            System.out.println("Enter your Choice [Rock, Paper or Scissors...]");
            userChoice = sc.nextLine().trim();

            if (!isValidChoice(userChoice, choices)) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
            }
        } while (!isValidChoice(userChoice, choices));
        int computerChoice = random.nextInt(3);
        String computerMove = choices[computerChoice];

        String result = determineWinner(userChoice, computerMove);

        System.out.println("Your Choice is: " + userChoice);
        System.out.println("Computer Choice is: " + computerMove);
        System.out.println(result);
    }
	}

