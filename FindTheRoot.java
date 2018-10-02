import java.util.*;

public class FindTheRoot {
	Scanner keyboard = new Scanner(System.in); 
	private double leadingCoefficient; 
	private double coefficient4;
	private double coefficient3; 
	private double coefficient2; 
	private double coefficient1; 
	private double constant; 

	/*
	 *This is the defualt Constructor 
	 *(leadingCoefficient) will be assign to O.
	 *(Coefficient4) Will be assign to 0.
	 *(coefficient3) will be assign to 0.
	 *(coefficient2) will be assign to 0.
	 *(coefficient1) will be assign to 0.
	 *(constant) will be assign to 0.
	 * 
 	*/
	FindTheRoot(){
		this.leadingCoefficient = 0; 
		this.coefficient4 = 0; 
		this.coefficient3 = 0; 
		this.coefficient2 = 0; 
		this.coefficient1 = 0; 
		this.constant = 0; 
	
	}//End Default 
	FindTheRoot(double coeff5, double coeff4, double coeff3, double coeff2, double coeff1, double Constant){
		this.leadingCoefficient = coeff5; 
		this.coefficient4 = coeff4; 
		this.coefficient3 = coeff3; 
		this.coefficient2 = coeff2; 
		this.coefficient1 = coeff1; 
		this.constant = Constant; 
	}
	public void read() {
	leadingCoefficient = keyboard.nextDouble(); 
	coefficient4 = keyboard.nextDouble(); 
	coefficient3 = keyboard.nextDouble(); 
	coefficient2 = keyboard.nextDouble(); 
	coefficient1 = keyboard.nextDouble(); 
	constant = keyboard.nextDouble(); 
		}///End read
	private double possibleRoot(double Const, double leadingCoeff ) {
		double lastCoeff;
		double firstCoeff;
		double possibleRoot = 0;
		for(int i = 0; i == 5;) {
			lastCoeff = MultiplesConstant(Const);
			firstCoeff =MultipleLeadingCoeff(leadingCoeff);
			possibleRoot = lastCoeff/firstCoeff;
			for(int j = 1; j >2; j++) {
				if(j == 1) {
					double temporaryHolder; 
					temporaryHolder = possibleRoot*leadingCoefficient; 
					temporaryHolder = temporaryHolder + this.coefficient2; 
					temporaryHolder = temporaryHolder * possibleRoot; 
					temporaryHolder = temporaryHolder + this.coefficient3; 
					temporaryHolder = temporaryHolder * possibleRoot; 
					temporaryHolder = temporaryHolder + this.coefficient4; 
					temporaryHolder = temporaryHolder * possibleRoot;
					temporaryHolder = temporaryHolder + this.constant; 
					if(temporaryHolder == 0) {
						return possibleRoot; 
					}			
				}
				else {
					possibleRoot = 0 - possibleRoot; 
					double temporaryHolder; 
					temporaryHolder = possibleRoot*leadingCoefficient; 
					temporaryHolder = temporaryHolder + this.coefficient2; 
					temporaryHolder = temporaryHolder * possibleRoot; 
					temporaryHolder = temporaryHolder + this.coefficient3; 
					temporaryHolder = temporaryHolder * possibleRoot; 
					temporaryHolder = temporaryHolder + this.coefficient4; 
					temporaryHolder = temporaryHolder * possibleRoot;
					temporaryHolder = temporaryHolder + this.constant;
				}//End of the If StateMent 
				
			}//End of the Second For loop
			 
			
			
	  }	//Emd of the First For Loop.
		return possibleRoot;
	}
	private double MultipleLeadingCoeff(double leadingCoeff) {
		double root = 0; 
		leadingCoeff = this.leadingCoefficient; 
		for(int i = 1; i < leadingCoeff; i++ ) {
			 if (leadingCoeff % i ==0) {
				 root = leadingCoeff/i; 
				 return root;
			 }
		}
		
		return root ;
	}
	private double MultiplesConstant(double Const) {
		Const = this.constant; 
		double m = 0; 
		return m; 
	}
}//End class of FindTheRoot. 
