/**
 * 
 */
import java.util.*;
/**
 * A program to determine which 'lil Wayne song you most identify with!
 * @author westonstewarttennes
 *
 *@param lollipop 
 *@param dropTheWorld
 *@param howToLove
 *@param sixFootSeven
 * 
 */
public class WhatX {

	public static void main(String[] args) {
		
		// define variables
		int lollipop = 0;
		int dropTheWorld = 0;
		int howToLove = 0;
		int sixFootSeven = 0;
		
		//open scanner
		Scanner console = new Scanner(System.in);
		
		// describe program to user
		System.out.println("Which 'Lil Wayne song are you?");
		System.out.println("Please answer questions with a, b, c, or d!");
		
		//ask first question
		firstQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);


	}

	public static void firstQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) purple ");
		System.out.print("b) green ");
		System.out.print("c) cyan ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();
		
		if (color.equals("a")) {
			lollipop++;
		}
		else if (color.equals("b")) {
			dropTheWorld++;
		}
		else if (color.equals("c")) {
			howToLove++;
		}
		else if (color.equals("d")) {
			sixFootSeven++;
		}
		secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
	public static void secondQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) purple ");
		System.out.print("b) green ");
		System.out.print("c) cyan ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();
			
		if (color.equals("a")) {
			lollipop++;
		}
		else if (color.equals("b")) {
			dropTheWorld++;
		}
		else if (color.equals("c")) {
			howToLove++;
		}
		else if (color.equals("d")) {
			sixFootSeven++;
		}
		thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}

	public static void thirdQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) purple ");
		System.out.print("b) green ");
		System.out.print("c) cyan ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();
			
		if (color.equals("a")) {
			lollipop++;
		}
		else if (color.equals("b")) {
			dropTheWorld++;
		}
		else if (color.equals("c")) {
			howToLove++;
		}
		else if (color.equals("d")) {
			sixFootSeven++;
		}
		fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
	
	public static void fourthQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) purple ");
		System.out.print("b) green ");
		System.out.print("c) cyan ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();
			
		if (color.equals("a")) {
			lollipop++;
		}
		else if (color.equals("b")) {
			dropTheWorld++;
		}
		else if (color.equals("c")) {
			howToLove++;
		}
		else if (color.equals("d")) {
			sixFootSeven++;
		}
		fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
	public static void fifthQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) purple ");
		System.out.print("b) green ");
		System.out.print("c) cyan ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();
			
		if (color.equals("a")) {
			lollipop++;
		}
		else if (color.equals("b")) {
			dropTheWorld++;
		}
		else if (color.equals("c")) {
			howToLove++;
		}
		else if (color.equals("d")) {
			sixFootSeven++;
		}
		console.close();
		finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
	}
	public static void finalCount(int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		if (lollipop > dropTheWorld && lollipop > howToLove && lollipop > sixFootSeven) {
			System.out.println("You are 'Lollipop'!");
		}
		else if (dropTheWorld > lollipop && dropTheWorld > howToLove && dropTheWorld > sixFootSeven) {
			System.out.println("You are 'Drop The World'!");
		}
		else if (howToLove > lollipop && howToLove > dropTheWorld && howToLove > sixFootSeven) {
			System.out.println("You are 'Drop The World'!");
		}
		else if (sixFootSeven > lollipop && sixFootSeven > dropTheWorld && sixFootSeven > howToLove) {
			System.out.println("You are 'Drop The World'!");
		}
	}
}