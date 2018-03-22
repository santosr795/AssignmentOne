import javax.swing.JOptionPane;

public class AssignmentOne {

	public static void main(String[] args) {
		String dash = "------------------\n\n";
			
		System.out.println("Hello my name is Ronald\n");
		
		System.out.println("I'm majoring in computer science\n");
	
		System.out.println("I like to draw" + "n" + "and  play video games.\n");
		
		System.out.println(dash);
	
		
		String myName, myBirth;
		myName = "Ronald"; 
		myBirth = "10/18/1997";
	
				System.out.println("Hello my name is "+ myName + "I was born in "+ myBirth + "\n");
			;
				System.out.println(dash);
				
				int numOne, numTwo, sum;
				numOne = 12;
				numTwo = 34;
				sum = numOne + numTwo; 
				System.out.println(sum + "\n");
				
				System.out.println(dash);
				
				String stringOne, stringTwo, bigString; 
				stringOne = "All Work and no play. ";
				stringTwo = "Make Jack a dull boy"; 
				bigString = stringOne + stringTwo;
				System.out.println(bigString + "\n");
			
				System.out.println(dash);
				int answer; 
				numOne = 47;
				numTwo = 10; 
				answer = numOne / numTwo;
				System.out.println(answer + "\n" );
				
				System.out.println(dash);
			
				int theReminder;
				theReminder = numOne % numTwo; 
				System.out.println(theReminder + "\n");
				System.out.println(dash);
			
				double numThree, numFour, result; 
				numThree = 47.0;
				numFour = 10.0; 
				result = numThree / numFour; 
				System.out.println(result + "\n");
			
				System.out.println(dash);
			
				
				JOptionPane.showMessageDialog(null,  "Dialog Boxes are really \"cool.\"");// I give up on the quotation
				JOptionPane.showMessageDialog(null, "Hickory\n\nDickory\n\nDock ");  
				JOptionPane.showMessageDialog(null, "Good bye from Ronald");
	}//end of main 

}// end

