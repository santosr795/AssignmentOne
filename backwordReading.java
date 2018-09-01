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
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean True = true;
		
				do{
					int i = 1;
					System.out.println("Enter a word");
					//Prime is the first Letter
					String inPut = keyboard.nextLine();
					//char primeChar = inPut.charAt(0);
					int length = inPut.length();
					//strip. I subtracted one from length cause we are ignoring 
					// The first letter of the String(inPut).
					int strip = length - 1;
				
					/*
					 * Grabbing the second letter in the String (inPut) and grabbing 
					 * the last letter in the String (inPut).
					 */
					String lastLetter = inPut.substring(inPut.length()-1);
					char lastChar = lastLetter.charAt(0);
					char firstChar = inPut.charAt(1);
					/*
					 * They are convert to chars and they could be compare as char
					 * but is not ideal do to the ASCII table. 
					 * They are convert into Strings again
					 */
					String CONVERTINGLASTCHAR = String.valueOf(lastChar);
					String converFirstChar = String.valueOf(firstChar);
					
					/*
					//Testing
					System.out.println( lastLetter );
					System.out.println(primeChar);	
					*/
					/*
					 * If the last Second letter and the last one are 
					 * the same, the program will continue to the next
					 * sequence she will be the same one as in the top.
					 * The program will compare a word that has up 
					 * to 13 letters.
					 */
				
				
				if(CONVERTINGLASTCHAR.equalsIgnoreCase(converFirstChar) && length > strip ) {
					True = false;
					/*
					 *
					 * -lastTwoLetter is the the last two letter 
					 * in the String inPut.
					 * 
					 * -secondletter will take in lastTwoLetter and strip the 
					 * first letter
					 */
					i = i + 1;
					strip = strip + 1;
					//char secondChar = inPut.charAt(2);
					String lastTwoLetter = inPut.substring(inPut.length()- i);
					//char secondLastChar = secondLast.charAt(0);
					
					char secondChar = lastTwoLetter.charAt(0);
					char secondLetter = inPut.charAt(2);
					String CONVERTINGSECONDLETTER = String.valueOf(secondChar);
					String convertSecondChar = String.valueOf(secondLetter);
					/*
					 * //Testing
					 
					System.out.println("Second Char" + secondChar);
					System.out.println("Second to last letter " + secondChar);
					System.out.println("The second letter of the String is "+secondLetter );
					System.out.println("I is equals to "+ i);
					*/
					if(strip >= length) {
						System.out.println("The word " + inPut + " is a palindrome word.\n If you want to try to find"
								+ " another word that is a palindrome");
						True = true;
						
					}//end IF
					
					if(convertSecondChar.equalsIgnoreCase(CONVERTINGSECONDLETTER) && length > strip){
						True = false;
						i = i+ 1;
						strip = strip + 1;
						
						String lastThreeLetter = inPut.substring(inPut.length()-i);
						char thirdChar = inPut.charAt(3);
						char thirdLetter = lastThreeLetter.charAt(0);
						String CONVERTINGTHIRDLETTER = String.valueOf(thirdLetter);
						String convertThirdChar = String.valueOf(thirdChar);
						if(strip >= length) {
							System.out.println("The word " + inPut + " is a palindrome word.\n If you want to try to find"
									+ " another word that is a palindrome");
							True = true;
							
						}//end IF
						/*
						//Testing
						//System.out.println("YES U MADE IT");
						System.out.println("The third char is " + thirdChar);
						System.out.println("The third letter in the String is "+ thirdLetter);
						System.out.println("I equals to " + i );
						*/
						if(CONVERTINGTHIRDLETTER.equalsIgnoreCase(convertThirdChar) && length > strip) {
							//System.out.println("yes u make it again");
							/*
							 * From here continue the same pattern 
							 * of the first 3 but add if i equals to to length to 
							 * make True equals false
							 * if (i = length){
							 * True = false;
							 * }
							 */
							i = i+1;
							String lastFourLetters = inPut.substring(inPut.length()-i);
							char fourthChar = inPut.charAt(4);
							char fourthLetter = lastFourLetters.charAt(0);
							String CONVERTINGFOURTHLETTER = String.valueOf(fourthLetter);
							String convertFourthChar = String.valueOf(fourthChar);
							if(strip >= length) {
								System.out.println("The word " + inPut + " is a palindrome word.\n If you want to try to find"
										+ " another word that is a palindrome");
								True = true;
								
							}//end IF
							/*
							//Testing
							System.out.println("Four letter" + fourthLetter);
							System.out.println("The fourth char is " + fourthChar);
							*/
							if(CONVERTINGFOURTHLETTER.equalsIgnoreCase(convertFourthChar) && length > strip) {
								i = i + 1;
								strip = strip + 1;
								String lastFiveLetters = inPut.substring(inPut.length()-i);
								char fifthChar = inPut.charAt(5);
								char fifthLetter = lastFiveLetters.charAt(0);
								String CONVERTINGFIFTHLETTER = String.valueOf(fifthLetter);
								String ConvertFifthChar = String.valueOf(fifthChar);
								if(strip >= length) {
									System.out.println("The word " + inPut + " is a palindrome word.\n If you want to try to find"
											+ " another word that is a palindrome");
									True = true;
									
								}//end IF
								if(CONVERTINGFIFTHLETTER.equalsIgnoreCase(ConvertFifthChar)&& length > strip){
									i = i + 1;
									strip = strip + 1 ;
									String lastSixthLetters = inPut.substring(inPut.length()-i);
									char sixthChar = inPut.charAt(6);
									char sixthLetter = lastSixthLetters.charAt(0);
									String CONVERTINGSIXTHLETTER = String.valueOf(sixthLetter);
									String convertSixthChar= String.valueOf(sixthChar);
									if(strip >= length) {
										System.out.println("The word " + inPut + " is a palindrome word.\n If you want to try to find"
												+ " another word that is a palindrome");
										True = true;
										
									}//end IF
									if (CONVERTINGSIXTHLETTER.equalsIgnoreCase(convertSixthChar) && length > strip) {
										
										System.out.println("This word is to big");
									}//End sixth If
								}//End fifth IF
							}//end fourth IF
						
						}//End third IF
						
				
					}//End second IF 
				
				}//end First IF 
				
				else {
					System.out.println("Try another word.");
					
				}
		
			}while(True == true);
				
	}//end main
}

///The following is just my first try on doing it, but it didnt work.

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
