package com.pages;

import java.io.IOException;

import com.impl.App;
import com.util.ReadData;

public class Dashboard {
	
	public static void Menu(Object Name) throws IOException 
		{
			System.out.println("=================================================");
			System.out.println("Welcome to Employee Dashboard "+ Name );
			System.out.println("Please Select an Action: ");
			System.out.println("0. Personal Information");
			System.out.println("1. Classroom Information");
			System.out.println("2. Salary Information");
			System.out.println("3. Feedback");
			System.out.println("4. TOC - Table of Contents");
			System.out.println("5. Go back to Main Menu");
			System.out.println("=================================================");
			
			int ch = ReadData.getIntegerValue("choice");
			
			switch(ch)
			{
			case 0: //personal information
			break;
			case 1: //Classroom info
			break;
			case 2: //Salary Info
			break;
			case 3: //feedback
				break;
			case 4: //toc
				break;
			case 5: App.MainMenu();
			break;
			
			default: System.out.println("Please enter a valid option!");
			break;
			
			}
			
			
	}
	
//		
//
//	private static void public void personalInformation() {
//		// TODO Auto-generated method stub
//		
//	}
}
