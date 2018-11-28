
import java.util.*;

public class MouseMaze {
	private static int catRow = 0; 
	private static int catRowTwo = 0;
	private static int catColumn = 0; 
	private static int catColumnTwo = 0;
	private static int arrayRows = 0;
	private static int arrayColumns = 0; 
	private static int [][]mouseArray ;
	private static int itTouchCat = 0; 
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter how many rows you want in the array");
		arrayRows = keyboard.nextInt(); 
		
		System.out.println("Enter how many columns you want in the array");
		arrayColumns = keyboard.nextInt();
		keyboard.close();
		//keyboard.close();
		//int m = (int)Math.random() * 28;
		 //System.out.println(m); 
		int r=0;
		int caught =0, fellOff = 0, attempts =0,illegalMove = 0; 
		boolean IT_HAS_GOTTEN_TO_THE_END = true; 
		do {
		 mouseArray = new int [arrayRows][arrayColumns];
		 fillArray(arrayRows, arrayColumns);for(int rowsValue = 0; rowsValue < arrayRows; rowsValue++) {
				for(int columnsValue = 0;  columnsValue < arrayColumns; columnsValue++) {
					if(catRow == rowsValue && catColumn == columnsValue) {
						 mouseArray [rowsValue][columnsValue] = 1; 
					}
					else if(catRow == rowsValue && catColumnTwo == columnsValue) {
						 mouseArray [rowsValue][columnsValue] = 1; 
					}
					else if(catRowTwo == rowsValue && catColumn == columnsValue) {
						 mouseArray [rowsValue][columnsValue] = 1; 
					}
					else if(catRowTwo  == rowsValue && catColumnTwo == columnsValue) {
						 mouseArray [rowsValue][columnsValue] = 1; 
					}
					else {
					 mouseArray [rowsValue][columnsValue] = 0; 
					//mouseArray
					}
				}
				System.out.println(" ");
			}
		//catLocation(arrayRows, arrayColumns); 
		//catLocation(arrayRows, arrayColumns); 
		 //fillArray(arrayRows, arrayColumns);
		 catLocation(arrayRows, arrayColumns); 
		 //fillArray(arrayRows, arrayColumns);
	int mouseRowsMovement = 0, mouseColumnsMovement = 0,nextMoveInt = 3;
	double nextMove ;
	for(int i = 1; i < 20 ; i++) { 
		int possibleCat = mouseArray[mouseRowsMovement][mouseColumnsMovement];
		// System.out.println(mouseRowsMovement);
		 //System.out.println(mouseColumnsMovement);
		if(possibleCat ==1) {
			 mouseRowsMovement = 0;
			 mouseColumnsMovement = 0;
			i=21;
			caught++;
		}
		else if(possibleCat >  1) {
			 mouseRowsMovement = 0;
			 mouseColumnsMovement = 0;
			 i=21;
			illegalMove++;
		}
		else if(mouseRowsMovement ==arrayRows || mouseColumnsMovement ==arrayColumns) {
			IT_HAS_GOTTEN_TO_THE_END = false;
			System.out.println("It has made to the end ");
			printMouseArray(arrayRows,arrayColumns);
			
		}
		
		mouseArray [mouseRowsMovement][mouseColumnsMovement] = i ;
		
		
		 switch(nextMoveInt) {
		 case 1://right up
			 //It need to check if its inside the bound and if not illegal move 
			 //It also needs to check if it touches the cat
			 mouseRowsMovement = mouseRowsMovement +1;
			 mouseColumnsMovement = mouseColumnsMovement -1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 2://right
			 //mouseRowsMovement = mouseRowsMovement;
			 mouseColumnsMovement = mouseColumnsMovement +1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 3: //right down
			 mouseRowsMovement = mouseRowsMovement +1;
			 mouseColumnsMovement = mouseColumnsMovement +1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
				 			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 4://down
			 mouseRowsMovement = mouseRowsMovement +1;
			// mouseColumnsMovent = mouseColumnsMovent +1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 5://left down
			 mouseRowsMovement = mouseRowsMovement -1;
			 mouseColumnsMovement = mouseColumnsMovement +1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 6://left
			// mouseRowsMovement = mouseRowsMovement +1;
			 mouseColumnsMovement = mouseColumnsMovement -1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 7://left up
			 mouseRowsMovement = mouseRowsMovement -1;
			 mouseColumnsMovement = mouseColumnsMovement -1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
		 case 8://up
			 mouseRowsMovement = mouseRowsMovement -1;
			 //mouseColumnsMovent = mouseColumnsMovent -1; 
			 if(mouseRowsMovement >= arrayRows || mouseRowsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;				 
			 }
			 else if(mouseColumnsMovement >= arrayRows || mouseColumnsMovement < 0) {
				 mouseRowsMovement = 0;
				 mouseColumnsMovement = 0;
				 i =21;
				 fellOff++;
			 }
			 break;
			
			}
		
		 nextMove = Math.random()*8;
		 nextMoveInt = (int)nextMove +1; 
		 r++;
			} 
		//printMouseArray(arrayRows, arrayColumns);
		// System.out.println("");
		attempts++;
		}while(IT_HAS_GOTTEN_TO_THE_END = true);
		System.out.println("It took the Mouse " +attempts+" to find the end." );
		System.out.println("the mouse was caught by the cat " + caught + " times.");
		System.out.println("The mouse fell off the maze " + fellOff+ " times.");
		 printMouseArray(arrayRows, arrayColumns);
		
	}
	public static void stats(String whatHappen) {
		 
		if(whatHappen.equalsIgnoreCase("cat")) {
			itTouchCat = itTouchCat + 1;
			System.out.println(whatHappen);
			//mouseMovent();
		}
		
	}
	public static void mouseMovent(){
		int m =0;
		
		do {
			catLocation(arrayRows, arrayColumns); 
			 fillArray(arrayRows, arrayColumns);
		int mouseRowsMovement = 0, mouseColumnsMovent = 0;
		for(int i = 0; i < arrayRows + 1; i++) {
			int possibleCat = mouseArray[mouseRowsMovement][mouseColumnsMovent];
			 mouseArray [mouseRowsMovement][mouseColumnsMovent] = i ; 
			;
			double rowsMoves = Math.random()*2;
			double columnsMoves = Math.random() *2;
			int mouseRowsMoves= (int)rowsMoves;
			//System.out.println("Mouse R M " +mouseRowsMoves);
			int mouseColumnsMoves = (int) columnsMoves;
			//System.out.println("Mouse C M " +mouseColumnsMoves);
			if(mouseRowsMoves == 1 && mouseColumnsMoves == 1 ) {
				if(possibleCat ==1) {
					
					stats("cat"); 
					//System.out.println("you hit The cat");
				}
				mouseRowsMovement = mouseRowsMovement + 1;
				mouseColumnsMovent = mouseColumnsMovent + 1;
			}
			else if(mouseRowsMoves == 1 && mouseColumnsMoves == 0 ) {
				if(possibleCat ==1) {
					stats("cat"); 
					//System.out.println("you hit The cat");
				}
				mouseColumnsMovent = mouseColumnsMovent + 1;
			}
			else if(mouseRowsMoves == 0 && mouseColumnsMoves == 1 ) {
				if(possibleCat ==1) {
					stats("cat"); 
					//System.out.println("you hit The cat");
				}
				mouseRowsMovement = mouseRowsMovement + 1;
			}
			else if(mouseRowsMoves == 0 && mouseColumnsMoves == 0 ) {
				if(possibleCat ==1) {
					stats("cat"); 
					//System.out.println("you hit The cat");
				}
				mouseRowsMovement = mouseRowsMovement + 1;
				mouseColumnsMovent = mouseColumnsMovent + 1;
			}
		}
		System.out.println(m);
		m++;
		}while(m< 3);
	}

	public static void catLocation(int rows, int columns) {
		//System.out.println(rows + " " + columns);
		//Random rand = new Random(); 
		// int columnTwo= 0, rowTwo = 0;
		double randomRow = Math.random() * rows  ;
	//	System.out.println(randomRow);
		 double randomColumn = Math.random() * columns ;
			//System.out.println(randomColumn);

		 catRow = (int)randomRow;
		 catColumn = (int)randomColumn;
		 
		/*if(rows == catRow) {
			 catRowTwo = catRow -1; 
		}
		else if(catRow == 0) {
			catRow= (int)catRow + 1;
		}
		else {
		*/
		catRowTwo = catRow +1;
		if(catRowTwo >= rows) {
				catRow = catRow -1;
				catRowTwo = catRow -1; 
		}
		//}
		//int columnOne = rowOne + rows
	/*	if(columns == catColumn) {
		catColumnTwo =(int) catColumn -1; 
		}
		else if(catColumn == 0) {
			catColumnTwo = catColumn + 1;
		}
		else {*/
			
		catColumnTwo = catColumn + 1;
		if(catColumnTwo >= columns) {
			catColumn = catColumn -1;
			catColumnTwo = catColumn - 1; 
		}
		
		//System.out.println("Column One " + catColumn+"\nColumn Two " + catColumnTwo + "\nRow One " + catRow + "\nRow Two" + catRowTwo);
	}
	public static void fillArray(int numberOfRows, int numberOfColumns) {
		
		for(int rowsValue = 0; rowsValue < numberOfRows; rowsValue++) {
			for(int columnsValue = 0;  columnsValue < numberOfColumns; columnsValue++) {
				if(catRow == rowsValue && catColumn == columnsValue) {
					 mouseArray [rowsValue][columnsValue] = 1; 
				}
				else if(catRow == rowsValue && catColumnTwo == columnsValue) {
					 mouseArray [rowsValue][columnsValue] = 1; 
				}
				else if(catRowTwo == rowsValue && catColumn == columnsValue) {
					 mouseArray [rowsValue][columnsValue] = 1; 
				}
				else if(catRowTwo  == rowsValue && catColumnTwo == columnsValue) {
					 mouseArray [rowsValue][columnsValue] = 1; 
				}
				else {
				 mouseArray [rowsValue][columnsValue] = 0; 
				//mouseArray
				}
			}
			System.out.println(" ");
		}
	}
	public static void printMouseArray( int numberOfRows, int numberOfColumns) {
	//	String [][] Maze = null ;
		for(int rowsValue = 0; rowsValue < numberOfRows; rowsValue++) {
			for(int columnValue = 0;  columnValue < numberOfColumns; columnValue++) {
				
				
				
				System.out.print(mouseArray[rowsValue][columnValue] + "  ");
			}
			System.out.println("");
		}
		
	}

}
