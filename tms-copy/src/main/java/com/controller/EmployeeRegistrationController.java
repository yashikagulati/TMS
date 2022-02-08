package com.controller;

/**
 * @author yasgulat
 * @see Employee Registration Page
 * 
 */
import static com.util.HibernateUtil.getSessionFactory;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
//
//import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;
//import org.hibernate.criterion.CriteriaQuery;
//import org.hibernate.query.Query;

//import com.beans.Employee;
import com.beans.EmployeeBeans;
import com.impl.App;
import com.pages.EmployeePage;
import com.util.EmployeeUtil;
import com.util.ReadData;
//import com.tms.dao.EmployeeDAO;
//import com.tms.dao.IEmployeeDAO;

public class EmployeeRegistrationController {

	
	public static void register() throws IOException  {
	System.out.println("---------------------------------------------");
	System.out.println("-----------Employee Registration-------------");
	
	Session session = getSessionFactory().openSession(); 
	Transaction transaction = session.beginTransaction(); 
	EmployeeBeans employee = new EmployeeBeans(); 
	
	employee.setEmpName(ReadData.getStringValue("Name ->  "));
	employee.setEmpEmail(ReadData.getStringValue("Email ID -> "));
	employee.setEmpPassword(ReadData.getStringValue("Password -> "));	
	employee.setEmpSalary(ReadData.getDoubleValue("Salary ->  "));
	
	saveEmployee(session, employee);
	
	System.out.println("Please choose your next action:");
	System.out.println("0- Login to Employee account");
	System.out.println("1- Go back to Main Menu");
	
	int choice = ReadData.getIntegerValue("choice-> ");
	
	switch(choice) {
	case 0: EmployeeLoginController.login();
		break;
		
	case 1: App.MainMenu();
	break;
	}
}
	


	
private static void saveEmployee(Session session, EmployeeBeans employee) throws NumberFormatException, IOException {
	// you are only giving emp object to hibernate
	session.save(employee); 
	// the save to db will happen here 
	session.getTransaction().commit();
	
	System.out.println();
	System.out.println("Employee Successfully registered!!");
}


}



