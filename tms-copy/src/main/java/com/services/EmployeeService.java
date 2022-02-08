package com.services;

import java.io.IOException;

import com.beans.EmployeeBeans;
import com.controller.EmployeeLoginController;
import com.controller.EmployeeRegistrationController;
import com.util.EmployeeUtil;

public class EmployeeService implements IEmployeeService{

	private EmployeeLoginController empLogin = null;
	
	public EmployeeService() throws  IOException {
		this.empLogin = new EmployeeLoginController(); 
	}
	@Override
	public boolean checkLogin(EmployeeBeans login) {
		
		try {
			// validate employeeLogin Object 
			if(EmployeeUtil.isValid(login)) {
				return EmployeeLoginController.login();
			}else {}}
			catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			
		}
		
		return false;
	}
	

}
