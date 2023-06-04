package com.gl.interfaces;

import com.gl.model.Employee;

public interface iCredentials {
	
	public String generateEmailaddress(Employee employee,String Department);
	public String GeneratePassword();
	public void showCredentials(Employee employee);

}
	

	
	