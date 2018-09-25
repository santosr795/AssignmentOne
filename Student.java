import java.util.*;
public class Student {
	private String firstName;
	private String lastName; 
	private String address; 
	private String phoneNumber;
	private String inStateString ;
	private String lateFeeString = "Yes"; 
	private String onCampusFoodString = "Yes"; 
	private String healthCareString = "Yes"; 
	
	private int credit; 
	private int planMealSelection;
	private double lateFee;
	private double onCampusFood; 
	private double healthCareOption; 
	private double tution; 
	private double creditRate; 
	
	
	

	Scanner keyboard = new Scanner(System.in); 
	public Student() {
		firstName = "No name "; 
		lastName = "NO last name"; 
		credit = 0; 
	}
	public Student(String firstName, String lastName, int credit) {
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.credit = credit; 
	}
	
	public void readInput() {
		System.out.println("Enter Name");
		firstName = keyboard.nextLine(); 
		System.out.println("Enter Last Name");
		lastName = keyboard.nextLine(); 
		System.out.println("Enter address."); 
		address = keyboard.nextLine(); 
		System.out.println("Enter Phone Number");
		phoneNumber = keyboard.nextLine(); 
		System.out.println("Does student live inState or out State.Enter yes for instate or No for outstate. "); 
		inStateString = keyboard.nextLine(); 
		System.out.println("late Fee: Yes or No.");
		lateFeeString = keyboard.nextLine(); 
		System.out.println("Do you want health care to be providate by the school. Yes or No.");
		healthCareString = keyboard.nextLine();  
		System.out.println("on Campus Food. Yes or No. ");
		onCampusFoodString = keyboard.nextLine(); 
			if(onCampusFoodString.equalsIgnoreCase("Yes")) {
				/*
				 * The program will ask the user 
				 * to select one of the 3 inputs.
				 * If the Input is not a valid the 
				 * program will ask the user to
				 * enter a valid input. 
				 * The program will assign 
				 * onCampusFoodString a meal 
				 * plan.
				 * 
				 */
				System.out.println("Please select one of the three options of the plan meals.\n1) Meal plan stuiff-your-face is $4,999.00.\n2) Meal Plan I-can't-stand-this-food is $3,499.00.\n3) Meal plan I'm-on-a-diet is $2,599.00.");
				planMealSelection = keyboard.nextInt(); 
				while(planMealSelection > 3) {
					System.out.println("That's not a food option.\nPlease enter a valid food plan");
					planMealSelection = keyboard.nextInt(); 
				}
				if(planMealSelection ==1) {
					onCampusFoodString = "Meal plan stuff-your-face"; 
					
				}
				else if(planMealSelection == 2) {
					onCampusFoodString = "Meal plan I-can't-stand-this-food";
				}
				else {
					onCampusFoodString = "Meal plan I'm-on-a-diet";
					
				}
			}
		System.out.println("Enter Number of credit you want to enroll");
		credit = keyboard.nextInt(); 
		while(credit <= 0) {
			System.out.println("Cannot put a negative number of credit or zero. Enter number credits. ");
			credit = keyboard.nextInt(); 
		}		
		
			
		}
	private double calculateOnCampusFood() {
		/*
		 * The program will check the what meal
		 * plan the user has pick. If the user picks
		 * meal plan 1 then (onCampusFood) will be
		 * assign to $4999.00. If the user picks
		 * meal plan 2 then (onCampusFood) will be 
		 * assign to $3499.00. if the user picks
		 * meal plan 3 then (onCampusFood) will be 
		 * assign to $2599.00.		 * 
		 */
		if(planMealSelection ==1) { 
			onCampusFood = 4999.00; 
			
		}
		else if(planMealSelection == 2) {

			onCampusFood = 3499.00; 
		}
		else {
			onCampusFood = 2599.00; 
			
		}
		return onCampusFood; 
		
	}
	private double calculateHealthCare() {
		/* 
		 * This will calculate healthCare 
		 * by checking the numbers of credits 
		 * a student is taking. If the a student is 
		 * taking less than 10 credits then (healthCareOption) 
		 * will assign to $25. 
		 * if a student is taking up too 15 credits
		 * then (healthCareOption will be assign to $20.
		 * Anything over 15 will be assign to $15.
		 */
		if(credit < 10) {
			healthCareOption = 25; 
		}
		else if(credit < 15) {
			healthCareOption = 20; 
		}
		else {
			healthCareOption = 15; 
		}
		return  healthCareOption; 
	}

	private double calculateCreditRate() {
		/*
		 * This will allow to find the creditRate 
		 * by checking if the student the students lives
		 * inState or OutState. The program will also 
		 * check the amount of credits the student is taking 
		 * and will assign the proper rate. 
		 */
	
		if(inStateString.equalsIgnoreCase("No")) {
			if(credit < 12) {
				creditRate = credit * 351; 
			}
			else if(credit < 18) {
				creditRate = credit * 255; 
			}
			else {
				creditRate = credit * 304; 
			}
		}
		else {
			
				if(credit < 12) {
					creditRate = credit * 105.50; 
				}
				else if(credit < 18) {
					creditRate = credit * 75.45; 
				}
				else {
					creditRate = credit * 93; 
				}
			}
		return creditRate; 
		
	}
	private double calculateLateFee() {
		lateFee = 0; 
		if(lateFeeString.equalsIgnoreCase("Yes")) {
			lateFee = .1; 
		}
		return lateFee; 
		}
	
		
	
	public void  writeOutput() {
	System.out.println("Student Name: " + firstName +" "+ lastName);
	System.out.println("Address: " + address);
	System.out.println("Phone Number: " + phoneNumber);
	System.out.println("Credit Enrolled " + credit );
	System.out.println("Instate Tution: " + inStateString); 
	System.out.println("Late Fees: " + lateFeeString);
	System.out.println("Food Plan: " + onCampusFoodString);
		
	}
	 public void calculationData() {
		
		
		
		
	}//end calulateDAta 
	public double getTution(Student Person) {
		double answer = 0; 
		return answer; 
	}
}
