import java.util.*;
public class dream {

	public static void main(String[] args) {
	 Scanner keyboard = new Scanner(System.in);

		//Third part 
	/* 3) Write a program that asks the user to enter a favorite color, 
		a favorite food, a favorite animal, and the first name of a friend or relative. 
		The program should then print the following two lines, with the user’s input replacing the items in italics:
		
			*I had a dream that Name ate a Color Animal
			*and said it tasted like Food!
			
		For example, if the user entered blue for the color,
	 	hamburger for the food, dog for the animal, and Jake for the person’s name, 
	 	the output would be
	 	
	 		*I had a dream that Jake ate a blue dog
	 		*and said it tasted like hamburger!
			*Don’t forget to put the exclamation mark at the end.

	---------------------------------------------------------------------------------------
*/
		
		String DREAM = "I had a drean that Name ate a Color Animal \n and said it tasted like Food!";
		System.out.println("Enter a Name ");
		String NAME = keyboard.nextLine();
		String dreamName = DREAM.replaceAll("Name", NAME);
		String dreamColor = dreamName;
		System.out.println("Enter your favorite Color ");
		String COLOR = keyboard.nextLine();
		dreamColor = dreamName.replaceAll("Color", COLOR);
		System.out.println("Enter favorite Animal ");
		String dreamAnimal = dreamColor; 
		String ANIMAL = keyboard.nextLine();
		dreamAnimal= dreamColor.replaceAll("Animal", ANIMAL);
		System.out.println("Enter Favorite Food ");
		String dreamFood = dreamAnimal; 
		String FOOD = keyboard.nextLine();
		dreamFood = dreamAnimal.replaceAll("Food", FOOD);
		System.out.println(dreamFood);

	}

}
