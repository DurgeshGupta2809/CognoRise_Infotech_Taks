package CognoriseTasks;
                                // CALCULATOR APP
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number : ");
		double num1 = sc.nextDouble();  // for First number
		
		System.out.print("Enter the Second number : ");
		double num2 = sc.nextDouble();  // for Second number
		
		System.out.println("Enter the Operator ( + , - , * , / )");
		char operator = sc.next().charAt(0);   // for Operator
		
		double result = 0;   // Varible for Result
		
	try {
		//  To get a result
		switch(operator) {
		
		case '+' :
			result = num1 + num2 ;
			break;
			
		case '-' :
			result = num1 - num2;
			break;
			
		case '*' :
			result = num1 * num2;
			break;
			
		case '/' :
			if(num2 != 0) {
				result = num1 / num2;
			}
			else {
				 throw new ArithmeticException("Cannot divide by zero...!!");  // if throws Exception
			}
            break;
		
		default : 
			throw new IllegalArgumentException("Invalid operator : " + operator);  // if User take a Wrong Operator
	    }
		System.out.println("Your Result : " +result);  // for Final Result
		
	  }
		catch(Exception e) {
			e.printStackTrace();   // To Handle the Exception
		}
		
	sc.close();   // Close the Scanner class
  }
}
