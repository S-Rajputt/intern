package Internship_project;

import java.util.Scanner;

public class Binary_To_Decimal {
		public static int bin_to_dec(String bin) {
			int decimalResult=0;
			// convert binary to decimal 
			 for(int i=bin.length()-1; i>=0; i--) {
				 for(int j=0; j<=i; j++) {
					int bit=Character.getNumericValue(bin.charAt(i));
					decimalResult=(int) (decimalResult+(bit*Math.pow(2, j)));
				}
			 }
			return decimalResult;
			 
		}
		 private static boolean isValidBinary(String bin) {
		        // Regular expression to check if the input is a valid binary number
		        return bin.matches("[01]+");
		    }
		 
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a binary number");
			String binaryNum=sc.nextLine();
			
			 // Validate the input to ensure it is a valid binary number
	        if (isValidBinary(binaryNum)) {
	            int decimalResult = bin_to_dec(binaryNum);
	            System.out.println("Decimal equivalent: " + decimalResult);
	        } else {
	            System.out.println("Invalid binary input. Please enter a valid binary number.");
	        }
	}

}
