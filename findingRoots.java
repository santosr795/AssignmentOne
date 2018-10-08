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
	private static double upperXScale = 10; 
	private double upperBound = 0 ;
	private double lowerBound = 0;	
	private double guessX = 0; 
	
	
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
	 	/*
	 	 * This program will allow us to test the X Scale 
	 	 * from - 10(lowerXScale) to 10(upperXScale). First
	 	 * the program will set upperXScale to !0.
	 	 * Second, the program will put the lowerXScale in the 
	 	 * polynomial formula in which will result for why. Third,
	 	 * the program will Set upperBound equals to lowerXScale.
	 	 * Fourthly, the program will increase the lowerXScale with 1 and 
	 	 * set the lowerBound the new LowerXScale. 
	 	 * Then the program will put the new lowerXScale in the polynomial formula,
	 	 * which will result in two y2. Finally the program will check y and y2 if one
	 	 * is negative and positive at the same time, if they are they will set upperXScale
	 	 * equals to lowerXScale. Ending the program, if they y1 and y2 are not one 
	 	 * negative and one positive the program will repeat again.
	 	 */
	private void walkingTheXScale() {
		upperXScale = 10; 
		while(lowerXScale < upperXScale) {
			double y =  lowerXScale*((double) Math.pow(leadingCoefficient, 2)) + lowerXScale*(this.coefficient4) + this.constant;
			upperBound = lowerXScale; 
			lowerXScale = lowerXScale + 1;
			lowerBound = lowerXScale; 
			double y2 =  lowerXScale*((double) Math.pow(leadingCoefficient, 2)) + lowerXScale*(this.coefficient4) + this.constant;
			
			if ( y > 0 && y2 <0 ) {
				upperXScale = lowerXScale;
				
			}
			else if(y2 > 0 && y < 0) {
				upperXScale = lowerXScale;
			}
			
		}
		 
	}
	private double average (double lower_Bound, double upper_Bound) {
		 guessX = 0; 
		this.lowerBound = lower_Bound; 
		this.upperBound = upper_Bound; 
		guessX = this.lowerBound + this.upperBound/2; 
		return guessX; 
	}
	/*
	 * This will allow us find The Y value. IF the Y value 
	 * is equals to Zero it will print it out. If The Y is 
	 * less than zero the program will assign that lower bound. 
	 * if Y is greater than Zero that will be assign to the Upper
	 * bound.
	 */
	private double findingY(double guess_X) {
		this.guessX = guess_X; 
		double Y = 1 ;
		for(int i = 1; i == 5; i++) {
		Y = this.guessX*((double) Math.pow(leadingCoefficient, 2)) + guessX*(this.coefficient4) + this.constant;
		if(Y< 0 ) {
			lowerBound = Y; 
		}
		else {
			upperBound = Y; 
			i = i -1;
		}
		}
		return Y; 
	}
	/*public double OriginalFormula() {
		double answer_Y = 0; 
		double xValue = scaleCalculation() ;
		
		//Come back and check this out; 
		
		answer_Y =  xValue * ((double) Math.pow(leadingCoefficient, 2)) + xValue *(this.coefficient4) + this.constant; 
		System.out.println("The answer Y is equals too" + answer_Y);
		return answer_Y; 
	}
	public double scaleCalculation() {
			
			upperBound = lowerXScale; //Previews X Value 
			System.out.println("upperBound is equals to " + upperBound);
				lowerXScale = lowerXScale + 1; 
			lowerBound = lowerXScale; // New X value
			System.out.println("Lower bound is equals to " + lowerBound);
			/*
			 * Getting the average of the two 
			 * to get a new X value. 
			 */
			
			/*
			 * With the new X Value(guessX) we will take 
			 * it and put it to the Original Polynomial; 
			 			guessX = (lowerBound + upperBound)/2;
		
		System.out.println("Guess X is Equals to " + guessX);
		return guessX; 
		}
		*/ 

	
}
