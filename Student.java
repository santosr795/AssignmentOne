import java.util.*;
public class Student {
	private String firstName;
	private String lastName; 
	private String address; 
	private String phoneNumber; 
	Scanner keyboard = new Scanner(System.in); 
	
	public void readInput() {
		System.out.println("Enter Name");
		firstName = keyboard.nextLine(); 
		System.out.println("Enter Last Name");
		lastName = keyboard.nextLine(); 
		System.out.println("Enter address."); 
		address = keyboard.nextLine(); 
		System.out.println("Enter Phone Number");
		phoneNumber = keyboard.nextLine(); 
				
	}
	
	
	
	public void  writeOutput() {
	System.out.print("Student Name " + firstName +" "+ lastName);
	System.out.print("Address " + address);
	System.out.print("Phone Number " + phoneNumber);
		
	}
	public void calculateData() {
		
		
	}

}
