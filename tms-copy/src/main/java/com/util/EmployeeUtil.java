package com.util;

import com.beans.EmployeeBeans;


public class EmployeeUtil {
	
	public static boolean isEmpNameValid(EmployeeBeans login) {
		
		if(login.getEmpName().length() < 6)
			return false;
		else
		return true;
	}
	
public static boolean isEmpEmailValid(EmployeeBeans login) {
		
		if(login.getEmpEmail().contains("@"))
			return true;
		else
		return false;
	}
	

}
