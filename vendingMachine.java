package chapter4;
import java.util.Scanner;

/*
 * 

Suppose we can buy a chocolate bar from the vending machine for $1 each.
 Inside every chocolate bar is a coupon. We can redeem six coupons for 
 one chocolate bar from the machine. This means that once you have started 
 buying chocolate bars from the machine, you always have some coupons. 
 We would like to know how many chocolate bars can be eaten if we start with 
 N dollars and always redeem coupons if we have enough for an additional chocolate bar.
For example, with 6 dollars we could consume 7 chocolate bars after purchasing 6
 bars giving us 6 coupons and then redeeming the 6 coupons for one bar.
  This would leave us with one extra coupon. For 11 dollars, we could have consumed 
  13 chocolate bars and still have one coupon left. For 12 dollars, we could have 
  consumed 14 chocolate bars and have two coupons left.
Write a program that inputs a value for N and outputs how many chocolate 
bars we can eat and how many coupons we would have left over. Use a loop 
that continues to redeem coupons as long as there are enough to get at least one chocolate bar.

 */
public class vendingMachine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		boolean True = true;
		int c = 1;
		int i = 0;
		double amountMoney  = 1;
		double money = keyboard.nextDouble();
		while (True == true && amountMoney >= .8) {
			i = i + 1;
			c = c + 1;
			final double  coupon = .2 ;
			double costBar = 1;
			double afterDiscount = costBar - coupon;
			System.out.println("aftere discound " + afterDiscount);
			amountMoney = money - afterDiscount;
			System.out.printf("%.2f \n",amountMoney);
			if (amountMoney <.8) {
				True = false; 
				if(amountMoney == .79){
					c= c + 1;
					int b = c - 2;
					c = c -b;
					System.out.println( "You can buy up to " + i + " chocolate bars."  + c);
					
					
					
				}
				int b = c - 1;
				c = c - b;
				System.out.println( "You can buy up to " + i + " chocolate bars."  + c);
			}
			
			money = amountMoney;
			
		} 
		
		

	}//End main 

}
