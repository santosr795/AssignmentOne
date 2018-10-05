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
	private double scaleCalculation(double upper_Bound, double lower_Bound) {
		upper_Bound = this.upperBound;
		lower_Bound = this.lowerBound;
		double root = 0; 
		findingRoots tester = new findingRoots();  
		for(int i = 1; i >= upperXScale; i++ ) {
			
			lowerXScale = lowerXScale + i;
			root = ( this.leadingCoefficient*(lowerXScale)+ this.coefficient4 *(lowerXScale) + this.constant);
			if(root == 0) {
				
			}
			
		}
		
		
		
		return root; 

	}
}
