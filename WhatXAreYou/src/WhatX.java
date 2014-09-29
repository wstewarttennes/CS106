/**
 * 
 */
import java.util.*;
/**
 * A program to determine which 'lil Wayne song you most identify with!
 * @author westonstewarttennes
 *
 * 
 */
public class WhatX {

	/**
	 * @param args
	 */
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
		if (color.equals("b")) {
			dropTheWorld++;
		}
		if (color.equals("c")) {
			howToLove++;
		}
		if (color.equals("d")) {
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
		if (color.equals("b")) {
			dropTheWorld++;
		}
		if (color.equals("c")) {
			howToLove++;
		}
		if (color.equals("d")) {
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
		if (color.equals("b")) {
			dropTheWorld++;
		}
		if (color.equals("c")) {
			howToLove++;
		}
		if (color.equals("d")) {
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
		if (color.equals("b")) {
			dropTheWorld++;
		}
		if (color.equals("c")) {
			howToLove++;
		}
		if (color.equals("d")) {
			sixFootSeven++;
		}
		fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
}