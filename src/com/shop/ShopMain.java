package com.shop;

import java.util.Scanner;

public class ShopMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		showMenu();
		
		System.out.println("What do you want to buy?");
		int fruit = scan.nextInt();
		scan.nextLine();

		System.out.println("How many do you want to buy?");
		int quantity = scan.nextInt();
		scan.nextLine();
		
		int totalAmount = calculate(fruit,quantity);
		
		System.out.println("Your total Amount is " + totalAmount + " kyats.");
		
		scan.close();
	}
	
	public static void showMenu() {
		System.out.println("Welcome to Fruit Shop!");
		System.out.println("1. Apple = 700 kyats");
		System.out.println("2. Orange = 400 kyats");
		System.out.println("3. Mango = 1000 kyats");
		System.out.println("4. Watermelon = 2000 kyats");
	}
	
	public static int calculate(int fruit, int quantity) {
		int applePrice = 700;
		int orangePrice = 400;
		int mangoPrice = 1000;
		int watermelonPrice = 2000;
		
		int total = 0;
		
		if(fruit == 1) {
			total = quantity*applePrice;
		}else if(fruit == 2) {
			total = quantity*orangePrice;
		}else if(fruit == 3) {
			total = quantity*mangoPrice;
		}else if(fruit == 4) {
			total = quantity*watermelonPrice;
		}else {
			total = 0;
		}
		return total;
	}

}
