package com.assignment.javaproject;

public class Day6_While_Loop_HomeWork {

	public static void main(String[] args) {
		//can you write a program to print first 100 natural numbers using while loop
		int i =1;
		while( i <=100) {
			System.out.println("THe first 100 natural number : " +i);
			i++;
		
		}
		//can you write a program to print first 50 even numbers using while loop
		   int count = 0;
	        int num = 0;
	        
	        while (count < 50) {
	            if (num % 2 == 0) {
	                System.out.println("The first 50 even number: " + num);
	                count++;
	            }
	            num++;
		}
		//write a program to print first 50 odd numbers using while loop
	        int count1 = 0;
	        int number = 1;

	        while (count1 < 50) {
	            System.out.println("THe first 50 odd number: " +number);
	            count1++;
	            number += 2;
	        }   
	        
		//write a program to print reversely from 100 to 1 using while loop
	        
	        int num1 = 100;
	        while(num1>= 1) {
	        	System.out.println("Reverse number: " +num1);
	        	num1--;
	        }
		//write a program to print reversely from 99 till 3 with 3 separations - 99, 96, 93, 90, ......... 3
	        
	        int rev = 99;
	        
	        while(rev >= 3) {
	        	System.out.println("print reverse: " + rev);
	        	rev -=3;
	        }
		//write a program to print first 10 multiples of 5 and add the sum of the multiples
		//write a program to print from 100 till 5 reversely - 100,95,90,......5 and then add the sum of all the reverse multiples and give the value

	

}
}


