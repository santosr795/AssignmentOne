import java.util.*;
import java.util.ArrayList;
public class PrimeNumbers {
	
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		int arrayIndex = 0; 
		ArrayList <Double> factors = new ArrayList<Double>();
		System.out.println("Enter a number that you to find out if it is a prime Number.");
		double input  = keyboard.nextDouble(); 
		double squareRootInput = Math.sqrt(input);
		squareRootInput = Math.round(squareRootInput);
		System.out.println("Square root is Equals to " + squareRootInput);
		for(double i = 2; i< input; i++) {
	         while(input%i == 0) {
	        	 factors.add(arrayIndex, i );
	        	 arrayIndex = arrayIndex + 1;
	            System.out.println(i+" m ");
	            input = input/i;
	           
	         }
	      }
	      if(input >2) {
	    	  
	    	   System.out.println(input);
	    	   factors.add(arrayIndex, input);
	      } 
	      for(int m = 0; m < factors.size(); m++) {
	        	 System.out.println("Array factors are "+factors.get(m));
	       }
	   }
	/*	for(double possibleFactorS = 2; possibleFactorS <= squareRootInput; possibleFactorS++) {
			double answerDivision = input / possibleFactorS; 
			System.out.println("answerDivision is equals to " + answerDivision + " Plus possible factors " + possibleFactorS );
			/*
			 * The following If Statement will check if 
			 * input divide factorial has decimal point equals 
			 * to Zero.
			 * 
			 *
			if( input%possibleFactorS == 0 ) {
				/*
				 * It will printOut the factorials as its a factor.
				 * squareRootInput will change by answerDivision being 
				 * square root it. squareRootInput will become a smaller number
				 * than before.
				 * At the End the squareRootInput will be round the nears number. 
				 * As it will be easier to calculate. 
				 *
				System.out.println("Square Root " + squareRootInput);
				//squareRootInput = Math.sqrt(answerDivision);

				//squareRootInput = Math.round(squareRootInput);
				//int i = 1; 
				//for(int o = 0; arrayIndex < i;arrayIndex++) {	
				while()
						factors.add(arrayIndex, possibleFactorS);
						System.out.println("This is the array list values " + factors.get(arrayIndex));
						arrayIndex++; 
						//possibleFactorS = 2; 
					/*System.out.println(factorials);
					for(int m = 0;m <= factors.size(); m++) {
						
					}
				}
				i = i + 1;
				*/
						
			//}
			/*
			 * after running all throught the scale from 2 to value 
			 * of squareRootInput the program will printout that the 
			 * number is not a prime number.
			 *
			else if(possibleFactorS >= squareRootInput) {
				System.out.println(" Prime number");
				
			}
		
		
			
			
		}*
		
		
		for(int i = 0; i < factors.size(); i++) {
			System.out.println("This is the array list values " + factors.get(i));
			double answer = factors.get(0) * factors.get(i);
			System.out.println("Answe is " + answer);
		}*/
	}

