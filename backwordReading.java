package chapter4;
import java.util.*;
import java.io.*;
/*
 * 

For all of the following words, if you move the first letter to the end of the word, 
and then spell the result backwards, you will get the original word:
banana dresser grammar potato revive uneven assess
Write a program that reads a word and determines whether
 it has this property. Continue reading and testing words
  until you encounter the word quit. Treat uppercase letters as lowercase letters.
1) ask for a String 
2) Grab the first letter of the String 
3) Put the letter in the end 
4) compare both words 
5)if is the same word end program.
6) if is not continue running the program.

 */
public class backwordReading {
	public static void main(String []args) {
		
		/*Scanner keyboard = new Scanner(System.in);
		
		
		String inPut = keyboard.nextLine();
		
		char firstChar = inPut.charAt(0);
		System.out.println(firstChar);
		int i;
		
		 * grabbing the length of string 
		 * to find how much to delete of the string
		 * subtract the length by to delete the first 
		 * letter in the string.
		 
		int length = inPut.length();
		int strip = inPut.length();
		boolean True = true;
		while(True = true) {
			 i = 0;
			
			
			String firstDeletion = inPut.substring(inPut.length()-strip);
				System.out.println( firstDeletion );
				String finalString; 
				i = i++;
				
			if(i >= length) {
				
				if(i >= length );{
					String secondLetter = first
				}
				
			}
			else {
				strip = strip - 1;
			}
		
		}
			*/
	
		// Grabbing the string and deleting the first letter. 
		//inPut.substring(inPut.length()-length); grab the length of substring then grabbing 
		//String and striping the first letter.
		
		/*
		 * Write if statement after combining compare the first letter 
		 * with the last one. if they are the same one continue with
		 * the next letter. until the all check in. At the end compare both word
		 * or combine the word first and compare to each other.
		 */
		String word="";
	    int j;
	    char[] chr;
	    System.out.println("Enter a Word:");
	    Scanner keyboard = new Scanner(System.in);
	    word= keyboard.nextLine();
	    chr= word.toCharArray();
	    for (j=word.length()-1; j>=0; j--) {
	    System.out.println("The word in reverse is " + (chr[j]) + ".");
	    }
	
		
	}//end main
}
package chapter4;
import java.util.*;
import java.io.*;
/*
 * 

For all of the following words, if you move the first letter to the end of the word, 
and then spell the result backwards, you will get the original word:
banana dresser grammar potato revive uneven assess
Write a program that reads a word and determines whether
 it has this property. Continue reading and testing words
  until you encounter the word quit. Treat uppercase letters as lowercase letters.
1) ask for a String 
2) Grab the first letter of the String 
3) Put the letter in the end 
4) compare both words 
5)if is the same word end program.
6) if is not continue running the program.

 */
//Top is my first try ill see if can reused later on
public class backwordReading {
	public static void main(String []args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		

		
		
		
		/*
		 * grabbing the length of string 
		 * to find how much to delete of the string
		 * subtract the length by to delete the first 
		 * letter in the string.
		 */

		boolean True = true;
		
				do{
					System.out.println("Enter a word");
					String inPut = keyboard.nextLine();
					char firstChar = inPut.charAt(0);
					System.out.println(firstChar);	
					int length = inPut.length();
					int strip = inPut.length();
				int i = 1;
		
			String lastLetter = inPut.substring(inPut.length()-1);
			char lastChar = lastLetter.charAt(0);
				System.out.println( lastLetter + lastChar);
				
				
				
				if(True = true) {
				
					/*
					 * The following sequence 
					 * will allow my code get the second 
					 * to last char and it will compare 
					 * it with the second char. If they 
					 * are similar they will continued to
					 * the next IF STATEMENT.
					 * 
					 * -secondLast is the the last two letter 
					 * in the String inPut.
					 * 
					 * -secondLastChar will come and delete the 
					 * the last index.					 */
					i = i++;
					char secondChar = inPut.charAt(2);
					String secondLast = inPut.substring(inPut.length()- i);
					System.out.println(secondChar);
					char secondLastChar = secondLast.charAt(0);
					char secondLetter = inPut.charAt(1);
					Systs
					
					if(length > i );{
						i = i++;
						True = false;
					
					}					
				
				}
				else {
					System.out.println("Try another word.");
					
				}
		
			}while(True == true);
		
	
		// Grabbing the string and deleting the first letter. 
		//inPut.substring(inPut.length()-length); grab the length of substring then grabbing 
		//String and striping the first letter.
		
		/*
		 * Write if statement after combining compare the first letter 
		 * with the last one. if they are the same one continue with
		 * the next letter. until the all check in. At the end compare both word
		 * or combine the word first and compare to each other.
		 */
		
		
	}//end main
}

