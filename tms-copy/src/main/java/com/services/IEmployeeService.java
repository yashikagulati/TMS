package com.services;

import com.beans.EmployeeBeans;
import com.controller.EmployeeLoginController;

public interface IEmployeeService {

	public boolean checkLogin(EmployeeBeans login); 
}
