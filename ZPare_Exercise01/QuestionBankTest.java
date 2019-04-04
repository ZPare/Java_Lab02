package Zoe_Pare_Exercise01;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class QuestionBankTest {

	public static void main(String[] args) {
		

		String one = "The backslash is called what kind of character?\n"
				+"A) escape\n B) withdrawal\n C) leave\n D) none of the above\n";
		String two = "What does the f mean in System.out.printf ?\n"
				+"A) fun\n B) formatted\n C) string\n D) none of the above\n" ;
		String three = "Every variable has what?\n"
				+"A) name, type, size and value\n B) name and type\n C) size and value\n D) none of the above\n";
		String four = "The identifiers in an enum must be?\n"
				+"A) like other identifiers\n B) empty\n C) unique\n D) none of the above\n";
		String five = "The compiler distinguishes overloaded methods by their?\n"
				+"A) signatures\n B) length\n C) size\n D) all of the above\n";
		
		QuestionBank[] questions = {
				new QuestionBank(one, "A"),
				new QuestionBank(two, "B"),
				new QuestionBank(three, "A"),
				new QuestionBank(four, "C"),
				new QuestionBank(five, "A")
		};
		
		checkAnswer(questions);

	}
//Checks answer from input
	public static void checkAnswer(QuestionBank[] questions) {
		int score = 0;
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<questions.length; i++ ) {
//each iteration accessing a different questions prompt
			System.out.println(questions[i].prompt);
//variable to store the answers by user
			String answer = input.nextLine().toUpperCase();
//is answer correct, comparing
			if(answer.equals(questions[i].answer)) {
//if answer correct, adds to score
				generateCorrectMessage();
				score++;
			}
			else {
				generateWrongMessage();
			}
		}
		System.out.println("Your Score is: " + score + "/" + questions.length);
		double percentage = (score / questions.length) *100;
		System.out.println("Percentage: "+ percentage);
}
//Generated Messages

	//If Wrong
	public static void generateWrongMessage() {
		Random random = new SecureRandom();
		
		switch(random.nextInt(4)) {
		case 0:
			System.out.println("No. Keep Trying.\n");
			break;
		case 1:
			System.out.println("Wrong. Try again.\n");
			break;
		case 2:
			System.out.println("Don't give up.\n");
			break;
		case 3:
			System.out.println("Try once more.\n");
			break;
		}
	}
	//If Correct
	public static void generateCorrectMessage() {
		Random random = new SecureRandom();
		
		switch(random.nextInt(4)) {
		case 0:
			System.out.println("Excellent!\n");
			break;
		case 1:
			System.out.println("Good!\n");
			break;
		case 2:
			System.out.println("Keep Up the Good Work!\n");
			break;
		case 3:
			System.out.println("Nice Work!\n");
			break;
			}
		}
}