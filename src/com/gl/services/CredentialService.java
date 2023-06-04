package com.gl.services;

import java.util.Random;

import com.gl.interfaces.iCredentials;
import com.gl.model.Employee;

public class CredentialService implements iCredentials {

	@Override
	public String generateEmailaddress(Employee employee, String Department) {
		// TODO Auto-generated method stub
		return employee.getFirstName()+employee.getLastName()+"@"+Department+".gl.in";
	}

	@Override
	public String GeneratePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		Random random =new Random();
		String password ="";
		String capitalChar =String.valueOf(capitalLetters.charAt(random.nextInt(capitalLetters.length())));
		String numberChar =String.valueOf(numbers.charAt(random.nextInt(numbers.length())));
		for (int i =0;i<6;i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		return password+capitalChar+numberChar;
		//return new String(passwordChar);
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear Employee" + employee.getFirstName());
		System.out.println("Email: " + employee.getEmail());
		System.out.println("Password: " + employee.getPassword());
	}


}
