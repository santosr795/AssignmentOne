
public class FindingTheRoots {
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
	private double Yanswer; 
	
	
	FindingTheRoots(){
		this.leadingCoefficient = 0;
		this.coefficient4 = 0;
		this.coefficient3 = 0; 
		this.coefficient2 = 0; 
		this.coefficient1 = 0; 
		this.constant = 0; 
	}
	FindingTheRoots(double coeff5, double coeff4, double coeff3, double coeff2, double coeff1, double Constant){
		this.leadingCoefficient = coeff5; 
		this.coefficient4 = coeff4; 
		this.coefficient3 = coeff3; 
		this.coefficient2 = coeff2; 
		this.coefficient1 = coeff1; 
		this.constant = Constant;
		//double coeff4, double coeff3, double coeff2, double coeff1, double Constant)
	}
	FindingTheRoots(double coeff5, double coeff4, double Constant){
		this.leadingCoefficient = coeff5; 
		this.coefficient4 = coeff4; 
		this.constant = Constant;
		//double coeff4, double coeff3, double coeff2, double coeff1, double Constant)
	}
	private  double walkingXScale(double xScale) {
		double y1 ; 
		 double y2 = 0;
		upperXScale = 10;
		System.out.println("upperXScale is equals to " + upperXScale);
		System.out.println("XScale is equals to " + xScale);
		while(upperXScale > xScale) {
		 upperBound = xScale;
		 xScale = xScale + .7; 
		 lowerBound = xScale; 
		  y1 = originalFormula(upperBound); 
		  y2 = originalFormula(lowerBound); 
		  if(y1> 0 && y2 < 0 ) {
			
			upperXScale = xScale; 
			// lowerXScale = xScale;
			 return y2; 
			 
		 }
		}
		return y2; 
	}
	private void setXScale(double GuessX) {
		lowerXScale = GuessX; 
		
	}
	private double average(double Upper_Bound, double Lower_Bound) {
		return (Upper_Bound + Lower_Bound)/ 2; 

	}
	private  double originalFormula(double xValue) {
		
		double tempY =  leadingCoefficient*((double) Math.pow(xValue, 2)) + coefficient4*(xValue) + this.constant;
	//	double tempY = leadingCoefficient*((double) Math.pow(xValue, 5)) + coefficient4*((double) Math.pow(xValue, 4)) +
		//coefficient3*((double) Math.pow(xValue, 3)) + coefficient2*((double) Math.pow(xValue,2)) + coefficient1*(xValue) + constant ;
		return tempY; 
	}
	public void calculate() {
		//for(int i = 0; i == 1; i++) {
		int i = 0; 
	while(i != 1) {
			lowerBound = walkingXScale(lowerXScale);
			System.out.println("Lower bound is " + lowerBound + "Upper Bound is " + upperBound);
			guessX = average(upperBound, lowerBound); 
			System.out.println("Guess is equals to " + guessX);
			Yanswer = originalFormula(guessX); 
			System.out.println("Yanswer is equals to " + Yanswer);
			if(Yanswer > -.9 && Yanswer < .001) {
				System.out.println(Yanswer);
				i = i +1;
			}
		}
	}
	 	
}
