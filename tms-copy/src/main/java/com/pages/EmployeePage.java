package com.pages;

import java.io.IOException;

import com.controller.EmployeeLoginController;
import com.controller.EmployeeRegistrationController;
import com.impl.App;
import com.util.ReadData;

public class EmployeePage {
	
	
	public static void EmployeeModuleMenu() throws IOException{
		System.out.println("-------------------------------------------------");
		System.out.println("-----------Welcome to Employee Module------------");
		System.out.println("-------------Please Select an Action-------------");
		System.out.println("0. Register a New User");
		System.out.println("1. Login to an existing account");
		System.out.println("2. Go back to Main Menu");
		System.out.println("-------------------------------------------------");
		
		int ch = ReadData.getIntegerValue("choice-> ");
		
		switch(ch)
		{
		case 0: EmployeeRegistrationController.register();
		break;
		case 1: EmployeeLoginController.login();
		break;
		case 2: App.MainMenu();
		break;
		default: System.out.println("Please enter a valid option!");

		}

}
}
