package com.liquidforte.java;

import java.util.Scanner;

/**
 * Lab Three - Checks credit limits
 * @version 1 9/10/2015 5:07 PM GMT - 6
 * @author Eric Gjerde
 */
public class LabThree {
	/**
	 * Do the heavy lifting
	 * @param args The command line argument
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		String accountNumber = input.nextLine();
		
		System.out.print("Enter beginning balance: ");
		double beginningBalance = input.nextDouble();
		
		System.out.print("Enter total charges: ");
		double charges = input.nextDouble();
		
		System.out.print("Enter total credits: ");
		double credits = input.nextDouble();
		
		System.out.print("Enter credit limit: ");
		double limit = input.nextDouble();
		
		double newBalance = beginningBalance + credits - charges;
		
		System.out.println("New Balance: " + newBalance);
		
		if (newBalance > limit) {
			System.out.println("Credit limit exceeded.");
		}
	}
}
