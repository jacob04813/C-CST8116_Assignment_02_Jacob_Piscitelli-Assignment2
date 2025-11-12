/*
* Author: Jacob Piscitelli
* Course: CST8116 - Introduction to Computer Programming
* Assignment 2
* Date: Fall 2025
*/

package assignment2;
import java.util.Random;
import java.util.Scanner;
public class Assignment02JacobPiscitelli {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
		String studentName = scnr.nextLine();

		int index = 0;
		int asciiSum = 0;
		
		while (index < studentName.length()) {
		char ch = studentName.charAt(index);
		asciiSum += (int) ch;
		index++;
		}
		System.out.println("Student Name: " + studentName);
		System.out.println("Sum of ASCII values: " + asciiSum);
		System.out.println("\nEnd of program. Stay cool! Program by Jacob Piscitelli");
		
		scnr.close();	
	}
	

}
