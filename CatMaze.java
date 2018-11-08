import java.util.Scanner;
import java.text.DecimalFormat;

public class Maze {
	private static int catRowSize = 0;
	private static int catColumnSize = 0;
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the maze! ");
		System.out.println("Enter the rows: ");
		int arrayRows = scan.nextInt();
		System.out.println("Enter the columns: ");
		int arrayColumns = scan.nextInt();
		
		int[][] M = new int[arrayRows][arrayColumns];
		int caught = 0, moveBackward = 0, fellOff = 0, count1 = 0, totalAttempt = 0 ;
		do{
		//while(M[arrayRows-1][arrayColumns-1] == 0){
			int locationOfMouse = 1, i =0, j=0;
			M = new int[arrayRows][arrayColumns];		
			M[0][0] = locationOfMouse;
			int lastValueOfX = 0;
			do{
				int x = (int)(8*Math.random() + 1);

				if (x>=5 && x<=7){
					moveBackward ++;
					break;
				}	
				else if (x==4){
					if (j == 0){
						fellOff ++; break;
					} else if (lastValueOfX == 8){
						moveBackward ++; 
						break;
					}
				}
				else if (x==8){
					if (i == 0){
						fellOff ++; break;
					} else if (lastValueOfX == 4){
						moveBackward ++; 
						break;
					}
				}
				else{
					/*
					 * The number of moves that are the mouse is allow to do 
					 * at the moment it doesnt work
					 * propertly 
					 */
					locationOfMouse ++;
					lastValueOfX = x;
					switch(x){
					case 1: j ++;
                  M[i][j] = locationOfMouse; break;
					case 2: i++; j++ ; 
                  M[i][j] = locationOfMouse; break;
					case 3: i ++; 
                  M[i][j] = locationOfMouse; break;
					case 4: i++; j--; 
                  M[i][j] = locationOfMouse; break;
					case 8: i--; j++; 
                  M[i][j] = locationOfMouse; break;
					default: break;
					}
				}
				
				locationOfCat(arrayRows,arrayColumns); 
				if((i == catRowSize)|| (i + 1 == catRowSize)||catColumnSize == j)||(catColumnSize == j +1)){
					caught++; break;
				}
				count1 ++;
			}while((i >= 0)&&(j >= 0)&&(i < arrayRows-1)&&(j < arrayColumns - 1));
			totalAttempt ++;
		}while(M[arrayRows-1][arrayColumns-1] == 0);
		String[][] N = toString(M,arrayRows,arrayColumns);
		
		System.out.println("The rat took " + totalAttempt + " attepmts to find a path.");
		System.out.println("The cat caught the mouse " + caught + " times.");
		System.out.println("The mouse fell off the maze " + fellOff + " times");

		printArray(N,arrayRows,arrayColumns);
	}

	public static void locationOfCat(int r, int c){
		catRowSize = (int)(Math.random()*r -1);
		
		catColumnSize = (int)(Math.random()*c -1);
	}
	
	/*public static boolean caughtMouse(int rowSize, int colSize, int i, int j){
		if ((i == rowSize)|| (i + 1 == rowSize)||(colSize == j)||(colSize == j +1)	) {
			return true;
		}
		return false; 
	}*/
	
	public static void printArray(String[][] M, int r, int c){
		for (int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				if ((catRowSize == i)||(catRowSize + 1 == i))
					if ((catColumnSize == j)||(catColumnSize + 1 == j))
						M[i][j] = "C";
				System.out.print(M[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static String[][] toString(int[][] M , int r , int c){
		String[][] N = new String[r][c];
		for (int i = 0; i < r; i++){
			for (int j = 0; j < c; j++){
				N[i][j] = "" + M[i][j];
			}
		}
		return N;
	}







}
