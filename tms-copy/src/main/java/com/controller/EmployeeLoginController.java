package com.controller;

import static com.util.HibernateUtil.getSessionFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;


import com.beans.EmployeeBeans;
//import com.impl.App;
import com.pages.Dashboard;
import com.services.EmployeeService;
import com.services.IEmployeeService;
//import com.util.ReadData;
import com.util.ReadData;

public class EmployeeLoginController {

	
	public static void login() throws IOException, HibernateException {
		
		IEmployeeService ies = new EmployeeService();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("-------------------------------------------------");
		System.out.println("-----------------Employee Login------------------");
		EmployeeBeans employee = new EmployeeBeans(); 
		employee.setEmpEmail(ReadData.getStringValue("Email Id -> "));
		employee.setEmpPassword(ReadData.getStringValue("Password -> "));
		
	
			
		Session session = getSessionFactory().openSession(); 
		//Checking if given email id and password match the data in database
		checkUser(session, employee);
		
		//After Login
		//Dashboard.Menu();
		
		
	}
	
	
	
	private static void checkUser(Session session, EmployeeBeans employee) throws IOException {
		
		int flag=0;
		
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder(); 
		
		CriteriaQuery<Object[]> query = criteriaBuilder.createQuery(Object[].class);
		Root<EmployeeBeans> root = query.from(EmployeeBeans.class);
		
		
		query.multiselect(root.get("empEmail"), root.get("empPassword"), root.get("empName")); 
		 List<Object[]> resultList = session.createQuery(query).getResultList(); 
		 
		 for(Object [] temp : resultList) {
				if(temp[0].equals(employee.getEmpEmail()) && temp[1].equals(employee.getEmpPassword())) {
					System.out.println();
					System.out.println("Logged in!");
					Dashboard.Menu(temp[2]);
					flag=1;
				}
					
			}
		 if(flag==0) 
		 {
			 System.out.println("Invalid Email id or Password!!");
		 }
		
		 
	}
}
