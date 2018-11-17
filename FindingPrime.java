import java.util.*;
import java.util.ArrayList;
public class PrimeNumbers {
	
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		ArrayList <Double> factors = new ArrayList<Double>();
		System.out.println("Enter a number that you to find out if it is a prime Number.");
		double input  = keyboard.nextDouble(); 
		double squareRootInput = Math.sqrt(input);
		squareRootInput = Math.round(squareRootInput);
		System.out.println("Square root is Equals to " + squareRootInput);
		for(double factorials = 2; factorials <= squareRootInput; factorials++) {
			double answerDivision = input / factorials; 
			/*
			 * The following If Statement will check if 
			 * input divide factorial has decimal point equals 
			 * to Zero.
			 * 
			 */
			if( input%factorials == 0 ) {
				/*
				 * It will printOut the factorials as its a factor.
				 * squareRootInput will change by answerDivision being 
				 * square root it. squareRootInput will become a smaller number
				 * than before.
				 * At the End the squareRootInput will be round the nears number. 
				 * As it will be easier to calculate. 
				 */
					System.out.println(factorials);
					squareRootInput = Math.sqrt(answerDivision);
					squareRootInput = Math.round(squareRootInput);
				
			}
			/*
			 * after running all throught the scale from 2 to value 
			 * of squareRootInput the program will printout that the 
			 * number is not a prime number.
			 */
			else if(factorials >= squareRootInput) {
				System.out.println("Not a Prime number");
				
			}
		
			
			
		}
	}
}
