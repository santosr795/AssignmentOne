import java.util.*;
public class findingRoots {
	Scanner keyboard = new Scanner(System.in); 
	private double leadingCoefficient; 
	private double coefficient4;
	private double coefficient3; 
	private double coefficient2; 
	private double coefficient1; 
	private double constant;
	private static double lowerXScale = -10;
	private static final double upperXScale = 10; 
	private double upperBound = 0 ;
	private double lowerBound = 0;	
	private double guessX; 
	
	
	findingRoots(){
		this.leadingCoefficient = 0;
		this.coefficient4 = 0;
		this.coefficient3 = 0; 
		this.coefficient2 = 0; 
		this.coefficient1 = 0; 
		this.constant = 0; 
	}
	findingRoots(double coeff5, double coeff4, double Constant){
		this.leadingCoefficient = coeff5; 
		this.coefficient4 = coeff4; 
		//this.coefficient3 = coeff3; 
		//this.coefficient2 = coeff2; 
		//this.coefficient1 = coeff1; 
		this.constant = Constant;
		//double coeff4, double coeff3, double coeff2, double coeff1, double Constant)
	}

	private double OriginalFormula() {
		double answer_Y = 0; 
		//Come back and check this out; 
		answer_Y = this.leadingCoefficient; 
		return answer_Y; 
	}
	public double scaleCalculation() {
		for(int j = 0; j  < upperXScale; j++) {
			
			upperBound = lowerXScale; //Previews X Value 
			
				lowerXScale = lowerXScale + 1; 
			lowerBound = lowerXScale; // New X value
			/*
			 * Getting the average of the two 
			 * to get a new X value. 
			 */
			
			/*
			 * With the new X Value(guessX) we will take 
			 * it and put it to the Original Polynomial; 
			 */
			guessX = (lowerBound + upperBound)/2;
		}
		return guessX; 

	}
}
