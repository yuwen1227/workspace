package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Drink d1 = new Drink("a",10);
		Drink d2 = new Drink("b",15);
		Drink d3 = new Drink("c",10);
		Drink d4 = new Drink("d",18);
		Drink d5 = new Drink("e",10);
		Drink d6 = new Drink("f",20);
		Drink d7 = new Drink("g",15);
		Drink d8 = new Drink("h",18);
		
		System.out.println("請投入1,5,10元:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int money = Integer.parseInt(line);
		
		System.out.println();
		
		
		
		
		
		
	}

}
