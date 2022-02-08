package com.impl;

/**
 * 
 * @author yasgulat
 * @since jan 2022
 * @version 1.0
 *
 *
 */

import java.io.IOException;

import com.controller.EmployeeLoginController;
import com.controller.EmployeeRegistrationController;
//import com.pages.Employee;
import com.pages.EmployeePage;
//import com.controller.TrainerLoginController;
//import com.controller.TrainerRegistrationController;
import com.util.ReadData;

public class App {



	public static void main(String[] args) throws IOException {
			System.out.println("------Welcome to Trainer Management System-------");
		

			MainMenu();
		}
			

		public static void MainMenu() throws IOException {
			System.out.println("-----------Select an Option to continue----------");
			System.out.println("0. Trainer");
			System.out.println("1. Employee");
			System.out.println("2. Exit");
			System.out.println("-------------------------------------------------");
			
			int choice = ReadData.getIntegerValue("choice-> ");
			
			switch(choice) {
			case 0:
				trainer();
				break;
			case 1:
				employee();
				break;
			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("Please choose a correct option!!");
				break;
	}


		}
		
		public static void trainer() throws IOException{
			
			System.out.println("-------------------------------------------------");
			System.out.println("-----------Welcome to Trainer Module-------------");
			System.out.println("-------------Please Select an Action-------------");
			System.out.println("0. Register a New User");
			System.out.println("1. Login to an existing account");
			System.out.println("2. Go back to Main Menu");
			System.out.println("-------------------------------------------------");
			int ch = ReadData.getIntegerValue("choice-> ");
			switch(ch)
			
			{
			case 0: 
				//TrainerRegistrationController.register();
			break;
			case 1: 
				//TrainerLoginController.login();
			break;
			}
		}
		public static void employee() throws IOException {
			System.out.println("-------------------------------------------------");
			System.out.println("-----------Welcome to Employee Module-------------");
			System.out.println("-------------Please Select an Action-------------");
			System.out.println("0. Register a New User");
			System.out.println("1. Login to an existing account");
			System.out.println("2. Go back to Main Menu");
			System.out.println("-------------------------------------------------");
			
			int ch = ReadData.getIntegerValue("choice-> ");
			
			switch(ch)
			{
			case 0: EmployeeRegistrationController.register();
			System.out.println("");
			break;
			case 1: EmployeeLoginController.login();
			break;
			case 2: MainMenu();
			break;
			default: System.out.println("Please enter a valid option!");

			}
	}





