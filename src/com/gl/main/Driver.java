package com.gl.main;
import java.util.Scanner;

import com.gl.model.Employee;
import com.gl.services.CredentialService;
public class Driver {
	
	public static void main (String[] args) {
		Employee employee = new Employee("Sreekanth","Rao");
		Scanner sc=new Scanner(System.in);
		displayMenu();
		int option =sc.nextInt();
		System.out.println(option);
		CredentialService credentialService = new CredentialService();
		String [] departments = {"tech","admin","hr","legal"};
		String emailAddress = credentialService.generateEmailaddress(employee,departments[option-1]);
		String password = credentialService.GeneratePassword();
		employee.setEmail(emailAddress);
		employee.setPassword(password);
		credentialService.showCredentials(employee);
	}
	private static void displayMenu() {  
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
	}
}