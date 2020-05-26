package com.utils;

import com.pages.AddEmployeePageElements;
import com.pages.DashBoardPageElements;
import com.pages.PersonalDetailsPageElements;
import com.pages.LoginPageElements;

public class PageInitializer extends CommonMethods{

	public static LoginPageElements login;
	public static AddEmployeePageElements addEmp;
	public static DashBoardPageElements dashboard;
	public static PersonalDetailsPageElements pdetails;
	
	
	public static void initialize() {
		login=new LoginPageElements();
		dashboard=new DashBoardPageElements();
		addEmp=new AddEmployeePageElements();
		pdetails=new PersonalDetailsPageElements();
		
	}
	
}
