package com.assignment.javaproject;

public class Day6_ForLoop_Homework {

	public static void main(String[] args) {
		//can you write a program to print first 100 natural numbers using for loop
		
		for (int i=1; i<=100; i++) {
			System.out.println("The one hundred natural number: " + i);
		}
		
				//can you write a program to print first 50 even numbers using for loop
		int count = 0;
		for(int i = 1 ; i<=50 ; i++) {
			if(i%2 == 0) {
				System.out.println("The first fifty Even number: " + i);
				count++;
			}
		
		}
				//write a program to print first 50 odd numbers using for loop
		int count1 = 0;
		for(int i = 1; i<=50; i+=2) {
			System.out.println("The first 50 odd number : " + i);
			count1++;
			
		}
		
				//write a program to print reversely from 100 to 1 using for loop
		
		for (int i = 100 ; i>=1 ; i--) {
			System.out.println("The 100 reverse number: " + i );
		}
				//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
		
		for (int i = 99 ; i>=3 ; i-=3 ) {
			System.out.println("The reverse from 99 to 3 is : " + i);
		}
				//write a program to print first 10 multiples of 5 and add the sum of the multiples
		
		
		}
				//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value

	}


