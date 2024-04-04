package CognoriseTasks;
                              // NUMBER GUESSING GAME
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   
	public static void main(String[] args) {
		//Create a Random class object to generate a Randon number
		Random ran = new Random();
		int ranNumber = ran.nextInt(100) + 1; // Generate a Random number between 1 to 100
	
		System.out.println("Welcome to the number Guessing game...!!");
		Scanner sc=new Scanner(System.in);
		
		// Set a predefined limit for attempts
		int maxAttempts = 5;
		int attempts = 0;
		
		  // Use a loop to allow multiple attempts
		while(attempts < maxAttempts) {
			
			System.out.print("Enter your Guess between 1 to 100 : ");
			int userNum = sc.nextInt();
			attempts++;
			
			// Compare the user's guess with the generated number
			if(userNum == ranNumber) {
				System.out.println("Congratulations, Your Guessing Number is Correct..");
				break;
			}
			else if(userNum < ranNumber) {
				System.out.println("Wrong Guessing, your number Lower than Random numbers...");
			}
			else {
				System.out.println("Wrong Guessing, your number Higher than Random numbers...");
			}
			 // Display remaining attempts
			int remainingAtt = maxAttempts - attempts;
			if(remainingAtt > 0) {
				System.out.println("Your Remaining Attempts : "+remainingAtt);
			}
			else {
				System.out.println("Sorry, your attempts is completed . The correct number was : " + ranNumber);
			}
		}
		sc.close();   // Close the Scanner class
	}
}
