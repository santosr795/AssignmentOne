import java.util.Scanner; 

@SuppressWarnings("unused")
public class University {
	//University totalTution = new University();  
	private double totalTution = 0; 
	private String inOutStateTution; 
	private int inState = 0;
	private int outState = 0;
	private double lateFee; 
	private double healthCare;
	private double incidentalFee;
	private int numberOfStudent = 0; 
	private double mealPlan;
	OutPut outPut = new OutPut(); 
	
	
	
	Student person = new Student(); 
	Scanner keyboard = new Scanner(System.in);
	public void printDataForSchoolReport() {
		System.out.println("Tution " + totalTution); 
		System.out.println("Number of Students " + numberOfStudent); 
		System.out.println("InState " + inState); 
		System.out.println("OutState " + outState); 
		//System.out.println(x); 
		//System.out.println(x); 

		
	}
	public void collectDataForReport(Student person) {
		numberOfStudent = numberOfStudent + 1; 
		totalTution =  totalTution + person.getTution();
		lateFee = lateFee + person.getLateFee(); 
		mealPlan = mealPlan + person.getMealPlan();
		healthCare = healthCare + person.getHealthCare();
		incidentalFee = incidentalFee + person.getHealthCare();
		inOutStateTution = person.getInOutState(); 
		if(inOutStateTution.equalsIgnoreCase("Yes")) {
			inState = inState + 1; 
			
		}
		else {
			outState = outState + 1; 
		}
		
}

}
