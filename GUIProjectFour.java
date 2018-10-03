import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GUIProjectFour {
	JPanel titlePanel = new JPanel();
	JPanel questionPanel = new JPanel();
	JPanel inputNumberPanel1 = new JPanel();
	JPanel inputNumberPanel2 = new JPanel(); 
	JPanel inputNumberPanel3 = new JPanel(); 
	JPanel inputNumberPanel4 = new JPanel(); 
	JPanel inputNumberPanel5 = new JPanel(); 
	JPanel inputNumberPanel6 = new JPanel(); 
	
	JPanel answerPanel = new JPanel();
	JPanel nextNumberPanel = new JPanel();
	
	JLabel titleLabel = new JLabel(); 
	JLabel questionLabel = new JLabel(); 
	JLabel inputNumberLabel1 = new JLabel(); 
	JLabel inputNumberLabel2 = new JLabel(); 
	JLabel inputNumberLabel3 = new JLabel();
	JLabel inputNumberLabel4 = new JLabel(); 
	JLabel inputNumberLabel5 = new JLabel(); 
	JLabel inputNumberLabel6 = new JLabel();
	JLabel answerLabel = new JLabel();
	JLabel resetLabel = new JLabel();
	JLabel calculateLabel = new JLabel(); 
	
	JButton calculateButton = new JButton(); 
	JButton ResetButton = new JButton(); 
	
	JTextField inputTextfield1 = new JTextField();
	JTextField inputTextField2 = new JTextField(); 
	JTextField inputTextField3 = new JTextField(); 
	JTextField inputTextField4 = new JTextField();
	JTextField inputTextField5 = new JTextField();
	JTextField inputTextField6 = new JTextField();
	
	public GUIProjectFour() {
		//Setting the Panel Layout
		titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		questionPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		inputNumberPanel1.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		inputNumberPanel2.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		inputNumberPanel3.setLayout(new FlowLayout(FlowLayout.CENTER));
		inputNumberPanel4.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		inputNumberPanel5.setLayout(new FlowLayout(FlowLayout.CENTER)); 
		inputNumberPanel6.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		//*** set Label fonts.  You can use other numbers besides 30,20
		Font quizBigFont = new Font("Helvetica Bold", Font.BOLD, 30);
		Font quizMidFont = new Font("Helvetica Bold", Font.BOLD, 20);
		Font quizSmallFont = new Font("Helvetica Bold", Font.BOLD, 15);
		
		titleLabel.setFont(quizBigFont);
		questionLabel.setFont(quizSmallFont);
		inputNumberLabel1.setFont(quizMidFont);
		inputNumberLabel2.setFont(quizMidFont);
		inputNumberLabel3.setFont(quizMidFont);
		inputNumberLabel4.setFont(quizMidFont);
		inputNumberLabel5.setFont(quizMidFont);
		inputNumberLabel6.setFont(quizMidFont);
		calculateLabel.setFont(quizMidFont);
		answerLabel.setFont(quizSmallFont);
		resetLabel.setFont(quizSmallFont);
		
		titleLabel.setText("Finding the Roots of a Polynomial");
		questionLabel.setText("Enter a five degree polynomial");
		inputNumberLabel1.setText("x^5");
		inputNumberLabel2.setText("x^4");
		inputNumberLabel3.setText("x^3");
		inputNumberLabel4.setText("x^2");
		inputNumberLabel5.setText("x^1");
		inputNumberLabel6.setText("A number");
		calculateButton.setText("Calculate");
		ResetButton.setText("Reset");
		
		titlePanel.add(titleLabel);
		questionPanel.add(questionLabel);
		
		
		
		
		setLayout(new BoxLayout( null, BoxLayout.Y_AXIS));
		add(titlePanel);
		add(questionPanel);
		
		
	}
	private void setLayout(BoxLayout boxLayout) {
		// TODO Auto-generated method stub
		
	}
	public void display() {
		//*** will be put.
				JFrame theFrame = new JFrame("GUI Example");
				//*** When the frame is closed it will exit to the
				//*** previous window that called it.
				theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//*** puts the panels in the JFrame
				theFrame.setContentPane(this);
				//*** sets the dimensions in pixels
				theFrame.setPreferredSize(new Dimension(600, 380));
				theFrame.pack();
				//*** make the window visible
				theFrame.setVisible(true);
	}
	public static void main(String[] args) throws IOException
	  {
		ExampleGUI gameGUI = new ExampleGUI();
		System.out.println("we can print to the console");
	    gameGUI.display();

	  }
}//End Public Class
