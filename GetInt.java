import java.util.Scanner;

/*
Program for GetInt.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Assignment HW12.
Last Changed: April 14, 2018.
*/

public class GetInt {
	
	private double minimum = 20;
	private int maximum = 99;
	private String prompt = "Hey, Can you guess a integer within a imaginary range?";
	@SuppressWarnings("resource")
	
	/**
	 Precondition: Range has been fixed.
	 Postcondition: Returns if the user value is within range or not.
	*/
	public int getValue()
	{
		boolean statement = true;
		int store =0;
		do
		{
		System.out.println(prompt);
		Scanner keyboard = new Scanner(System.in);
		store = keyboard.nextInt();
		
		if (store>=minimum && store<=maximum)
		{
			System.out.println("This number " + store + " is within range. Nice!");
			statement = false;
		}
		else
		{
			System.out.println("This number " + store + " is not within range.");
			System.out.println("Try it once again!");
		}
		}while (statement);
		
		return store;
		
	 }
	
	
	/**
	 Precondition: Range has been fixed.
	 Postcondition: Returns the change into Quarter, dime, nickel, and cents.
	*/
	 public int getChange()
	 {
		// Create boolean True variable. 
		boolean sentence = true;
		int price, c=0, quater, dime, nickel, cents;  //define variables 
		do{	
		System.out.println("Enter the price between 20 cents to 1 dollor");
		System.out.println("and I will show you the remaining change!");
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		price = keyboard.nextInt(); 
		if (price == 1)
		{
			System.out.println("No change");
			sentence = false;
			System.exit(0);
		}
		if (price >= minimum && price <= maximum)
		{
			
			//apply logic
			c = 100-price;
			quater = c / 25;
			c = c % 25;
			dime = c / 10;
			c = c % 10;
			nickel = c / 5;
			c = c % 5;
			cents = c / 1;
			System.out.println("You bought an item for " + price);
			System.out.println("cents and gave me a dollar,");
			System.out.println("so your change is");
			System.out.println(quater + " quaters,");
			System.out.println(dime + " dimes, and");
			System.out.println(nickel + " nickel");
			System.out.println(cents + " cents");
			sentence = false;
		}
		else
		{
		//otherwise continue the do-while loop
		System.out.println("Invalid number!");
		System.out.println("Enter a new valid price");
		}
		} while (sentence);
		return c;
	}

}
