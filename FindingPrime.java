import java.util.*;
import java.util.ArrayList;
public class PrimeNumbers {
	
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		ArrayList <Double> factors = new ArrayList<Double>();
		System.out.println("Enter a number that you to find out if it is a prime Number.");
		double input  = keyboard.nextDouble(); 
		double resultSqrt = Math.sqrt(input);
		int factorIndex = 0; 
		System.out.println("Result SquareRoot is equals to " + resultSqrt);
		for(double index = 5; index <= resultSqrt; index = index + 2) {
			double answer = input/ index; 
			System.out.println("answer is equals to " + answer);
			//This line will check if dividing input by index will have a reminder
			// equals to zero. if it does that means is a factor
			if(input%index == 0 )
				//In here resultSquare will change by resultS square rooting Answer; 
				
				for(factorIndex < 1; factorIndex++) {
					//In here you will create the ArrayList 
					// 
				}
			}
		if(resultSqrt % 2 == 0) {
			
		}
		if (resultSqrt % 3 == 0 ) {
			
		}
		} 

	}
	
}
