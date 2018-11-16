import java.util.*;
import java.util.ArrayList;
public class PrimeNumbers {
	
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		ArrayList <Double> factors = new ArrayList<Double>();
		System.out.println("Enter a number that you to find out if it is a prime Number.");
		double input  = keyboard.nextDouble(); 
		double resultSqrt = Math.sqrt(input);
		System.out.println("Result SquareRoot is equals to " + resultSqrt);
		for(double index = 5; index <= resultSqrt; index = index + 2) {
			double answer = resultSqrt/ index; 
			System.out.println("answer is equals to " + answer);
		if(resultSqrt % 2 == 0) {
			
		}
		if (resultSqrt % 3 == 0 ) {
			
		}
		} 

	}
	
}
