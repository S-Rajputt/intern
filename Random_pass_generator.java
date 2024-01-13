package Internship_project;

import java.util.Scanner;

public class Random_pass_generator {
	public static char Random_Char() {
		// generate a possible number that represent
		// all possible character in our password.
		// 10 digit + 26 lower case + 26 upper case=62.
		int rand = (int) (Math.random() * 62);
		// rand is betwwen 0-61.
		// if rand is between 0-9 inclusive => number
		// if rand is between 10-35 => Uppercase.
		// if rand is between 36-61 => Lowercase.

		if (rand <= 9) {
			// number rand is between 0-9 => 48-57 ASCII
			int ascii = rand + 48;// 48-0=48
			return (char) (ascii);
		} else if (rand <= 35) {
			// Upperacase letter is between 10-35 => 65-90
			int ascii = rand + 55;// 65-10=55
			return (char) (ascii);
		} else {
			// lowercase letter is between 35-61 => 97-122
			int ascii = rand + 61;// 97-36=61
			return (char) (ascii);
		}
	}

	public static void printPass(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ask the user how many password they want.
		System.out.println("How many number of password do you want Enter here : ");
		int num_pass = sc.nextInt();
		// ask the user length of the password.
		System.out.println("Enter the length of the password you want : ");
		int length = sc.nextInt();

		// for store a pass we a to create a char array
		String[] randomPassword = new String[num_pass];

		// iterate the total num password user have to generate.
		for (int i = 0; i < num_pass; i++) {
			// iterate inside loop length of the password.
			String randomPass = "";
			for (int j = 0; j < length; j++) {
				randomPass = randomPass + Random_Char();
			}
			// add our random password into array
			randomPassword[i] = randomPass;
		}
		// Print the password
		printPass(randomPassword);
	}

}
