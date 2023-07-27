package com.assignment.javaproject;

import java.util.Scanner;

public class Day6_Switch_HomeWork {

	public static void main(String[] args) {
		
		Scanner sca = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sca.nextInt();
		
		String day;

		switch(num=1) {
		case 1:
			day = "Saturday";
			System.out.println(day);
			break;
			
		case 2:
			day = "Sunday";
			System.out.println(day);
			break;
		case 3:
			day = "Monday";
			System.out.println(day);
			break;
		case 4:
			day = "Tuesday";
			System.out.println(day);
			break;
		case 5:
			day = "Wednesday";
			System.out.println(day);
			break;
		case 6:
			day = "Thursday";
			System.out.println(day);
			break;
		case 7:
			day = "Friday";
			System.out.println(day);
			break;
			
			default :
				System.out.println("Invalid day");
				break;
			
		
		}
		
		

	}
	
	

}
