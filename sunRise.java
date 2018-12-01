import java.util.Scanner;
import javax.swing.JApplet;
import java.awt.*;
import java.io.PrintWriter;
public class sunRise extends JApplet {


	int count = 10;
	int forColor = 1;
	public void paint (Graphics page)
	{
		//setBackground(Color.WHITE);
		page.setColor(Color.BLACK);
		String out = "SunSet-SunRise Graph ";
		Font saveFont = page.getFont();
		page.setFont(new Font("Times New Roman", Font.BOLD, 35));
		page.drawString(out, 600, 200);
		//page.setFont(new Font("Arial", Font.BOLD, 15));
	//	page.setColor(new Color(102,27,221));
		//out ="custom color see paint program";
	//	page.drawString(out, 500, 250);
		//page.setFont(saveFont);
		//page.setColor(Color.GREEN);
		//page.drawString(out, 500, 300);
		graph(page);
	}
	public void graph(Graphics page) {
	String months, hour;
	//Main Vertical Line
	page.setColor(Color.BLACK);
	page.drawLine(300,200,300,740);
	//Main Horizontal Line 
	page.setColor(Color.BLACK);
	page.drawLine(300,740,1030,740);
	//January 
	page.setColor(Color.BLACK);
	months  = "Jan";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 300,760);
	page.setColor(Color.BLACK); 
	page.drawLine(362, 200, 362, 740);
	//February 
	page.setColor(Color.BLACK);
	months  = "Feb";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 362,760);
	page.setColor(Color.BLACK); 
	page.drawLine(418, 200, 418, 740);
	//March
	page.setColor(Color.BLACK);
	months  = "Mar";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 418,760);
	page.setColor(Color.BLACK); 
	page.drawLine(480, 200, 480, 740);
	//April
	page.setColor(Color.BLACK);
	months  = "Apr";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 480,760);
	page.setColor(Color.BLACK); 
	page.drawLine(540, 200, 540, 740);
	//May
	page.setColor(Color.BLACK);
	months  = "May";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 540,760);
	page.setColor(Color.BLACK); 
	page.drawLine(602, 200, 602, 740);
	//June
	page.setColor(Color.BLACK);
	months  = "June";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 602,760);
	page.setColor(Color.BLACK); 
	page.drawLine(662, 200, 662, 740);
	//July
	page.setColor(Color.BLACK);
	months  = "July";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 662,760);
	page.setColor(Color.BLACK); 
	page.drawLine(724, 200, 724, 740);
	//August
	page.setColor(Color.BLACK);
	months  = "Aug";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 724,760);
	page.setColor(Color.BLACK); 
	page.drawLine(786, 200, 786, 740);
	//September
	page.setColor(Color.BLACK);
	months  = "Sept";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 786,760);
	page.setColor(Color.BLACK); 
	page.drawLine(846, 200, 846, 740);
	//October
	page.setColor(Color.BLACK);
	months  = "Oct";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 846,760);
	page.setColor(Color.BLACK); 
	page.drawLine(908, 200, 908, 740);
	//November
	page.setColor(Color.BLACK);
	months  = "Nov";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 908,760);
	page.setColor(Color.BLACK); 
	page.drawLine(968, 200, 968, 740);
	//December
	page.setColor(Color.BLACK);
	months  = "Dec";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(months, 975,760);
	page.setColor(Color.BLACK); 
	page.drawLine(1030, 200, 1030, 740);
	//4 Am
	page.setColor(Color.BLACK);
	hour  = "4 AM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,260);
	page.setColor(Color.BLACK);
	page.drawLine(300,260,1030,260);
	//5 Am
	page.setColor(Color.BLACK);
	hour  = "5 AM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,320);
	page.setColor(Color.BLACK);
	page.drawLine(300,320,1030,320);
	//6 Am
	page.setColor(Color.BLACK);
	hour  = "6 AM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,380);
	page.setColor(Color.BLACK);
	page.drawLine(300,380,1030,380);
	//7 Am 
	page.setColor(Color.BLACK);
	hour  = "7 AM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,440);
	page.setColor(Color.BLACK);
	page.drawLine(300,440,1030,440);
	//4 Pm
	page.setColor(Color.BLACK);
	hour  = "4 PM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,500);
	page.setColor(Color.BLACK);
	page.drawLine(300,500,1030,500);
	//5 Pm
	page.setColor(Color.BLACK);
	hour  = "5 PM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,560);
	page.setColor(Color.BLACK);
	page.drawLine(300,560,1030,560);
	//6 Pm
	page.setColor(Color.BLACK);
	hour  = "6 PM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,620);
	page.setColor(Color.BLACK);
	page.drawLine(300,620,1030,620);
	//7Pm
	page.setColor(Color.BLACK);
	hour  = "7 PM";
	page.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 18));
	page.drawString(hour, 260,680);
	page.setColor(Color.BLACK);
	page.drawLine(300,680,1030,680);
	Scanner readFile =TextFileIO.createTextRead("sunRise.txt");
	int xAxis = 300, secondXAxis = 300 ;
	
	for(int i = 0 ; i < 365; i++) {
		String cutting;
		int morningHour = 0,afterNoonHour = 0, morningMinutes = 0, afterNoonMinutes = 0;
		String read = readFile.nextLine(); 
		//read =read.replaceAll(" ", "");
		System.out.println(read);
		System.out.println(read.length() + " Day " + i);
		
	
		if(read.length() ==10) {
			cutting = read.substring(2,4);	
			morningHour = Integer.parseInt(cutting.trim());
			System.out.println("Morning Hour " + morningHour);
			cutting = read.substring(3, 5);
			System.out.println("cutting for Morning Minutes" + cutting);
			morningMinutes = Integer.parseInt(cutting.trim());
			cutting = read.substring(5, 8);
			System.out.println("After noon Hour"+cutting);
			afterNoonHour =Integer.parseInt(cutting.trim());
			cutting = read.substring(8,10);
			cutting = cutting.trim();
			afterNoonMinutes = Integer.parseInt(cutting.trim());
			System.out.println("cutting for          after Minutes" + cutting);
			
			
		}
		else if(read.length() ==11) {
			cutting = read.substring(2,4);
			
			morningHour = Integer.parseInt(cutting.trim());
			System.out.println("Morning Hour " + morningHour);
			cutting = read.substring(4, 6);
			System.out.println("cutting for Morning        Minutes" + cutting);
			morningMinutes = Integer.parseInt(cutting.trim());
			cutting = read.substring(6, 8);
			cutting = cutting.trim(); 
			System.out.println("After noon Hour"+cutting);
			afterNoonHour =Integer.parseInt(cutting.trim());
			cutting = read.substring(9,11);
			afterNoonMinutes = Integer.parseInt(cutting.trim());
			System.out.println("cutting for          afternoon Minutes" + cutting);
		}
		
		else if(read.length() == 12) {
			cutting = read.substring(2,4);
			
			morningHour = Integer.parseInt(cutting.trim());
			System.out.println("Morning Hour " + morningHour);
			cutting = read.substring(4, 7);
			System.out.println("cutting for Morning         Minutes" + cutting);
			morningMinutes = Integer.parseInt(cutting.trim());
			cutting = read.substring(7, 10); 
			System.out.println("After noon Hour"+cutting);
			cutting = cutting.trim();
			afterNoonHour =Integer.parseInt(cutting.trim());
			cutting = read.substring(10,12);
			afterNoonMinutes = Integer.parseInt(cutting.trim());
			System.out.println("cutting for           afternoon Minutes" + cutting);
		}
		else if(read.length() == 13) {
			cutting = read.substring(2,4); 
			morningHour= Integer.parseInt(cutting.trim());
			System.out.println("Morning Hour " + morningHour);
			cutting = read.substring(5, 7);
			System.out.println("cutting for morning             Minutes" + cutting);
			morningMinutes = Integer.parseInt(cutting);
			cutting = read.substring(8, 10);
			System.out.println("After noon Hour"+cutting);
			afterNoonHour =Integer.parseInt(cutting.trim());
			System.out.println(cutting);
			cutting = read.substring(11,13);
			afterNoonMinutes = Integer.parseInt(cutting);
			System.out.println("cutting for             afternoon Minutes" + cutting);
			
		}
	
		switch(morningHour) {
		case 4:
			xAxis = xAxis +2; 
			morningMinutes = 260 + morningMinutes;
			page.drawOval( xAxis, morningMinutes, 2, 2);
			break;
		case 5:
			xAxis = xAxis +2; 
			morningMinutes = 320 + morningMinutes;
			page.drawOval( xAxis, morningMinutes, 2, 2);
			break; 
		case 6: 
			xAxis = xAxis +2; 
			morningMinutes = 380 + morningMinutes;
			page.drawOval( xAxis, morningMinutes, 2, 2);
			break;
		case 7: 
			xAxis = xAxis +2; 
			morningMinutes = 440 + morningMinutes;
			page.drawOval( xAxis, morningMinutes, 2, 2);
			break;
		}
		switch(afterNoonHour) {
		case 16:
		secondXAxis = secondXAxis +2; 
		afterNoonMinutes = 500 + afterNoonMinutes; 
		page.drawOval( secondXAxis, afterNoonMinutes, 2, 2);
			break;
		case 17:
			secondXAxis = secondXAxis +2; 
			afterNoonMinutes = 560 + afterNoonMinutes;
			page.drawOval( secondXAxis, afterNoonMinutes, 2, 2);
			break; 
		case 18: 
			secondXAxis = secondXAxis +2; 
			afterNoonMinutes = 620 + afterNoonMinutes; 
			page.drawOval( secondXAxis, afterNoonMinutes, 2, 2);
			break;
		case 19: 
			secondXAxis = secondXAxis +2; 
			afterNoonMinutes = 680 + afterNoonMinutes; 
			page.drawOval( secondXAxis, afterNoonMinutes, 2, 2);
			break;
		}
	}
		
	}//End Graph
	
	
}

