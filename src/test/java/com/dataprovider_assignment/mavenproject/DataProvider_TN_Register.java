package com.dataprovider_assignment.mavenproject;

import org.testng.annotations.DataProvider;

public class DataProvider_TN_Register {
	
	
	
	@DataProvider(name = "Tutorial Ninja")
	
	public Object [][] tnRegister() {
		
		Object [][] data = {{"md","munna","munna6@ninja.com","1234567","munna@123","munna@123"},
				            { "md","munna","munna7@ninja.com","1234567","munna@123","munna@123"}};
		
		return data;
		}
	
     @DataProvider(name = "TN")
	
	 public Object [][] tnLogin() {
		
		Object [][] data = {{"munna1@ninja.com","munna@123",},
				            {"munna1@ninja.com","munna@123"}};
		
		return data;
		}
	}


