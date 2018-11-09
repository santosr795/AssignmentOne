import java.lang.reflect.Array;
import java.util.*;
public class MouseMaze {
	private static int catRows = 0; 
	private static int catColumns = 0; 
	private static int mouseRows = 0;
	private static int mouseColumns = 0; 
	private static int [] [] mouseArray; 
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in); 
		System.out.println("Enter how many rows you want in the array");
		mouseRows = keyboard.nextInt(); 
		
		System.out.println("Enter how many columns you want in the array");
		mouseColumns = keyboard.nextInt();
		keyboard.close();
		
		  printMouseArray( mouseRows, mouseColumns); 
		
	}
	public static void printMouseArray( int numberOfRows, int numberOfColumns) {
		String [][] Maze = null ;
		for(int rowsValue = 0; rowsValue <= numberOfRows; rowsValue++) {
			for(int columnValue = 0;  columnValue <= numberOfColumns; columnValue++) {
				
				
				
				System.out.print(Maze[rowsValue][columnValue]+" ");
			}
		}
		
	}

}
