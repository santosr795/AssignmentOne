import java.util.*;
public class Student {
	private String firstName;
	private String lastName; 
	private String address; 
	private String phoneNumber; 
	private int credit; 
	private boolean inStateTution;  
	private boolean lateFee; 
	private boolean onCampusFood; 
	private boolean healthCareOption; 
	

	Scanner keyboard = new Scanner(System.in); 
	public Student() {
		firstName = "No name "; 
		lastName = "NO last name"; 
		credit = 0; 
	}
	public Student(String firstName, String lastName, int credit) {
		
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
		System.out.println("Enter Number of credit you want to enroll");
		credit = keyboard.nextInt(); 
		while(credit <= 0) {
			System.out.println("Cannot put a negative number of credit or zero. Enter number credits. ");
			credit = keyboard.nextInt(); 
		}
		System.out.println("Does student live inState or out State. Enter yes for instate or No for outstate. "); 
		String inStateString = keyboard.nextLine(); 
		while(!inStateString.equalsIgnoreCase("Yes")||!inStateString.equalsIgnoreCase("No")) {
			System.out.println("please Enter Yes for Instate or No for outState ");
			inStateString = keyboard.nextLine(); 
		}
		if (inStateString.equalsIgnoreCase("Yes")) {
			inStateTution = true; 
		}
		else if(inStateString.equalsIgnoreCase("No")) {
			inStateTution = false; 
		}
				
	}
	
	
	
	public void  writeOutput() {
	System.out.print("Student Name: " + firstName +" "+ lastName);
	System.out.print("Address: " + address);
	System.out.print("Phone Number: " + phoneNumber);
	System.out.print("Credit Enrolled " + credit );
	System.out.print("Instate Tution: " + inStateTution); 
	
		
	}
	public void calculateData() {
		
		
	}

}
