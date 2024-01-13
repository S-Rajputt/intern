package Internship_project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number : ");
		double num1 = sc.nextDouble();
		System.out.println("Enter the Scound number : ");
		double num2 = sc.nextDouble();

		System.out.println("\n Select operations : ");
		System.out.println("1. Addition (+) : ");
		System.out.println("2. Substraction (-) : ");
		System.out.println("3. Multiplication (*) : ");
		System.out.println("4. Division (/) : ");

		System.out.println("Enter a number Choice between 1-4");
		int choice = sc.nextInt();

		double result = 0.0;

		switch (choice) {

		case 1:
			result = num1 + num2;
			break;
		case 2:
			result = num1 - num2;
			break;
		case 3:
			result = num1 * num2;
			break;
		case 4:
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Num2 should be greater than 0 ");
			}
			break;
		default:
			System.out.println("Enter a Valid choice");
			break;
		}
		System.out.println("Result => " + result);
	}
}
