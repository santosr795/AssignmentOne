import java.util.Scanner;
/*
 * Repeat the calorie-counting program described in Programming Project 8 from Chapter 2. 
 * This time ask the user to input the string “M” if the user is a man and “W” if
 *  the user is a woman. Use only the male formula to calculate calories if “M” is
 *   entered and use only the female formula to calculate calories if “W” is entered. Output the number of chocolate bars to consume as before.



 */
public class bmr {
public static void main(String [] args) {
	Scanner keyboard = new Scanner(System.in);
	int age;
	double height , weight , BMR;
	double chocolate = 230;
	 String again = "yes";
	do {// The program will run at leat once. 
	System.out.println("Want to find out your BMR ?");
	System.out.println("Enter your gender M OR W");
	String gender = keyboard.nextLine();

		if(gender.equalsIgnoreCase("W")){
			System.out.println("Enter your age ");
			age = keyboard.nextInt();
			System.out.println("What is your Weight ");
			weight = keyboard.nextDouble();
			
			System.out.println("Enter your height in two phase first the feets ");// The user is going enter there Height
			height = keyboard.nextDouble();
			height = height * 12; // Converting feets into inches
			System.out.println("Now Enter the rest in inches ");
			double heightInches = keyboard.nextDouble();
			
			height = height + heightInches;
			// Finding the BMR
			//BMR  for women = 655 + (4.3 × weight in pounds) + (4.7 × height in inches) - (4.7× age in years)
			
			BMR = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
			System.out.println("Your BMR IS " + BMR + " calories.");
			chocolate = BMR / chocolate;
			System.out.println( "You can eat up to " + chocolate + " chocolate bars at day and not gain any weight.");
			System.out.println("Want to calculate your BMR again? Enter Yes or No.");
			again = keyboard.next();
	}
		else if(gender.equalsIgnoreCase("M")) {
			System.out.println("Enter your age");
			age = keyboard.nextInt();
			System.out.println("Enter your weight");
			weight= keyboard.nextDouble(); 
			System.out.println("Enter  your height in two phase first in feets and then in inches");
			height = keyboard.nextDouble();
			height = height * 12;
			System.out.println("Enter the rest of your height in inches");
			double heightInches = keyboard.nextDouble();
			
			height = heightInches + height;
			//calculating the BMR
			//	BMR = 66 + (6.3 × weight in pounds) + (12.9 × height in inches) - (6.8 × age in years)
			BMR = 66 + (6.3 *weight) + (12.9 * height) - (6.8 * age);
			System.out.println("Your BMR is " + BMR + "Calories.");
			chocolate = BMR / chocolate;
			System.out.println("You can eat to " + chocolate + "Chocolate bars a day and not gain any weight.");
			System.out.println("Want to calculate your BMR again? Enter Yes or No.");
			again = keyboard.next();
		}
		else {
			System.out.println("Sorry that gender does not exist. Enter a real gender.");
		}
		// IF the user enter no the program will stop running.
		
	}while(again.equalsIgnoreCase("yes")); //end do while 
}
}
