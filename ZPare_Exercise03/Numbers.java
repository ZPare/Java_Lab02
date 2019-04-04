package Zoe_Pare_Exercise03;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
//could not use int as it is a primative type and does not work with the Arrays.sort
//Primative types are the basic data types available
//Integer allow for sorting in desending order
		
		Integer [] array = new Integer [5];
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++) {
//Prompts 5 times to enter a number
		System.out.println("Enter a Number:");
		array[i] = input.nextInt();
		}
		System.out.println("Numbers in Desending Order: ");
		sortNumbers(array);
	}
	
	public static void sortNumbers(Integer [] array) {

				Arrays.sort(array, Collections.reverseOrder());
				
				for(int i: array) {
				System.out.println(i);
				}
			}
}