package Internship_project;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		// Take the number from user as a input through scanner class.
		Scanner sc = new Scanner(System.in);
		// use random class to generate a number 
		Random random = new Random();
		
		// Set LowerBound 
		int lowerBound=1;
		// Set HighrBound 
		int upperBound=100;
		int target_Numb=random.nextInt(upperBound-lowerBound+1);
		int numofAttempts=0;
		
		 System.out.println("Welcome to the Number Guessing Game!");
	     System.out.println("I have selected a number between " + lowerBound + " and " + upperBound);
	     
	     while(true) {
	    	 System.out.println("Enter you guess Number :");
	    	 int guessNum=sc.nextInt();
	    	 numofAttempts++;
	    	 
	    	 if(guessNum>upperBound || guessNum<lowerBound) {
	    		 System.out.println("please enter the correct number Between " + lowerBound + " to " + upperBound);
	    	 }else if(guessNum<target_Numb) {
	    		 System.out.println("too low.. please enter again");
	    	 }else if(guessNum>target_Numb) {
	    		 System.out.println("too high.... please enter again");
	    	 }
	    	 else {
	    		 System.out.println("Yahh You Win.... Congrates...in " + numofAttempts + " attempts");
	    		 break;
	    	 }
	     }

	}

}
