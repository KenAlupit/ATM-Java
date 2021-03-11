package com.ciit.Alupit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader (input);
		char Selection;
		double Balance = 0;
		String AccountInput = null;
		String PasswordInput = null;
		do {
			System.out.println("+------------------------------------------+");
			System.out.println("|  Hi!Welcome to Mr.Senny's ATM Machine!   |");
			System.out.println("+------------------------------------------+");
			System.out.println("Please select an option from the menu below:");
			System.out.println("l -> Login");
			System.out.println("c -> Create New Account");
			System.out.println("q -> Quit");			
			Selection = reader.readLine().charAt(0);
				switch (Selection) {
					case 'C':	
					case 'c':
						System.out.println ("Please enter your username: ");
						AccountInput= reader.readLine();
						System.out.println ("Please enter your password: ");
						PasswordInput= reader.readLine();					
						System.out.println ("Thank You! Your account has been created!");
						break;
					case 'L':
					case 'l':
						System.out.println("Please enter your user ID:");
						String UserID = reader.readLine(); 
						System.out.println("Please enter your password: ");
						String UserPass = reader.readLine();   
					if (new String(UserID).equals(AccountInput) && new String(UserPass).equals(PasswordInput)) {
								System.out.println("+--------------------------------------+");
								System.out.println("|  ******** ACCESS GRANTED! ********   |");	
								System.out.println("+--------------------------------------+");
									do {
										System.out.println("Please select an option from the menu below:");
										System.out.println("d -> Deposit Money");
										System.out.println("w -> Withdraw Money");
										System.out.println("r -> Request Balance");
										System.out.println("q -> Quit");
										Selection = reader.readLine().charAt(0);
										switch (Selection) {
										case 'D':
										case 'd':
											System.out.println("Amount of deposit: $");
											double Deposit = Double.parseDouble(reader.readLine());
											Balance += Deposit;
											break;
										case 'W':
										case 'w':
											System.out.println("Withdraw Money: $");
											double Withdraw = Double.parseDouble(reader.readLine());
												if (Withdraw > Balance) {
													System.out.println ("+------------------------------------------+");
													System.out.println ("|  ******** NOT ENOUGH BALANCE! ********   |");
													System.out.println ("+------------------------------------------+");
												}
												else {
													Balance -= Withdraw;
												}
												break;
										case 'R':
										case 'r':
											System.out.println ("Your balance is $" + Balance);
											break;
										case 'Q':
										case 'q':
											break;
										default:
											System.out.println ("+-------------------------------------+");
											System.out.println ("|  ******** INVALID INPUT! ********   |");
											System.out.println ("+-------------------------------------+");
											break;
										}									
									} while (Selection != 'q' && Selection != 'Q');
							}
							else {
								System.out.println ("+------------------------------------+");
								System.out.println ("|  ******** LOGIN FAILED! ********   |");
								System.out.println ("+------------------------------------+");
							}break;
					case'Q':
					case'q':
						break;
					default:
						System.out.println ("+-------------------------------------+");
						System.out.println ("|  ******** INVALID INPUT! ********   |");
						System.out.println ("+-------------------------------------+");
					}
		} while (Selection != 'q' && Selection != 'Q');
			System.out.println ("+----------------------------------------------+");
			System.out.println ("|  ******** THANKS FOR STOPPING BY! ********   |");
			System.out.println ("+----------------------------------------------+");
	}
	}


