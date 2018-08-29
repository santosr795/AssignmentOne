import java.util.*;
public class alphabaticaly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
/*
 * Write a program that reads three strings from the keyboard.
 *  Although the strings are in no particular order, 
 *  display the string that would be second if they were arranged lexicographically.
 */

System.out.println("Write a word or letter");
String lineOne = keyboard.nextLine();
System.out.println("Write another word or letter");
String lineTwo = keyboard.nextLine();
System.out.println("Write a Final word or letter");
String lineThree = keyboard.nextLine();
//L stands for Line

// * Getting an Input from the keyboard
 //* Grabbing the first CHAR of the string 
// * Storing the in a CHAR
 

char L_ONE = lineOne.charAt(0);
char L_TWO = lineTwo.charAt(0);
char L_THREE = lineThree.charAt(0);
//System.out.println(L_ONE+ "" + L_TWO +""+ L_THREE);

// * Converting the CHAR into a Integer
// * The CHAR becomes a integer in the ASCII TABLE		
//I Stands for Integer
 
int ASCII_ONE = (int) L_ONE;
int ASCII_TWO = (int) L_TWO;
int ASCII_THREE = (int) L_THREE;
//System.out.println(ASCII_ONE + "," + ASCII_TWO + "," + ASCII_THREE);

if(ASCII_ONE >= ASCII_TWO && ASCII_ONE <= ASCII_THREE ) {
	System.out.println(lineOne);
}
else if (ASCII_ONE >= ASCII_THREE && ASCII_ONE <= ASCII_TWO ) {
	System.out.println(lineOne);
}
else if (ASCII_TWO >= ASCII_ONE && ASCII_TWO <= ASCII_THREE) {
	System.out.println(lineTwo);
}
else if (ASCII_TWO >= ASCII_THREE && ASCII_TWO <= ASCII_ONE) {
	System.out.println(lineTwo);
}
else {
	System.out.println(lineThree);
}


//compare = lineOne.compareToIgnoreCase(lineThree);
//compare = lineTwo.compareToIgnoreCase(lineThree);
/*	if (compare < 0) {
	System.out.println(lineOne);
}
else if(compare > 0) {
	System.out.println(lineTwo);
}
else {
	System.out.println(lineThree);
}
This was my orginal way i was going to do it, but i could not figure out to make 
work.
	*/
	}

}
