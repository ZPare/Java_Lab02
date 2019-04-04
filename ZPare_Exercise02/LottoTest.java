package Zoe_Pare_Exercise02;

import java.util.Scanner;
public class LottoTest {

public static void main(String[] args) {
//New object created
	Lotto lotto = new Lotto();
//Array created and calling method created in Lotto that returns the array created there
//that array created in Lotto is the generated number.
	
    int[] arr = lotto.returnArray();
    int sum = 0;
        
    for (int i = 0; i <arr.length ; i++) {
        sum = sum+arr[i];
        }
    
     int num = 0;
     boolean wins = false;
     //This is the number we're looking for
     System.out.println("Secret Number: " + sum);
//Can only guess up to 5 times
     for (int i = 0; i <5 ; i++) {
    	 
     Scanner input = new Scanner(System.in);
//First prompt to user
     System.out.println("Please enter a number");
     num = input.nextInt();
//Input stores number received by user

//Testing to see if program has to prompt for another number
     while (num < 3 || num > 27) {
//If user input is below required 3 - 27 range
           System.out.println("Please enter a number between 3 - 27");
            num = input.nextInt();
            System.out.println("Please enter a number");
            num = input.nextInt();
            }
//Correct number is guessed if it equals to generated number (sum) is equal to user input(num)
      if (num == sum)
         {
         System.out.println("You Win!");
         wins = true;
         	break;
         }
         else
         {
         System.out.println("Try Again!");
         }
        }
     
//If wins is not true (false) then output message
       if(!wins)
        {
        System.out.println("You Lose, Computer Wins!");
        }

	}

}
