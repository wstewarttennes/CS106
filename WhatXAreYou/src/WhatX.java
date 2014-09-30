/**
 * 
 */
import java.util.*;
/**
 * A program to determine which 'lil Wayne song you most identify with!
 * @author westonstewarttennes
 *
 *@param lollipop are characteristics that identify with the song "Lollipop"
 *@param dropTheWorld are characteristics that identify with the song "Drop the World"
 *@param howToLove are characteristics that identify with the song "How to Love"
 *@param sixFootSeven are characteristics that identify with the song "Six Foot Seven Foot"
 * 
 *@return What 'Lil Wayne song you are!
 * @DISCLAIMER: I DONT ACTUALLY SUPPORT 'LIL WAYNE.
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
		System.out.println("***Following links may lead to nauseau***");
		System.out.println();
		
		//ask first question
		firstQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);


	}

	public static void firstQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What is your favorite colour?   ");
		System.out.println("a) all colours! ");
		System.out.print("b) black ");
		System.out.print("c) pink ");
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
		else {
			System.out.println("Not a valid answer! Please answer again.");
			firstQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		}
		secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
	public static void secondQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("Who would you rather take to prom?   ");
		System.out.println("a) Katy Perry ");
		System.out.print("b) Marilyn Manson ");
		System.out.print("c) Kim Kardashian ");
		System.out.print("d) Dennis Rodman ");
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
		else {
			System.out.println("Not a valid answer! Please answer again.");
			secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		}
		thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}

	public static void thirdQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("What's your favorite candy?   ");
		System.out.println("a) Lollipops. ");
		System.out.print("b) I hate the world. ");
		System.out.print("c) I looooveee candy! ");
		System.out.print("d) Very tall candy. ");
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
		else {
			System.out.println("Not a valid answer! Please answer again.");
			thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
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
		else {
			System.out.println("Not a valid answer! Please answer again.");
			fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		}
		fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		console.close();
	}
	public static void fifthQuestion(Scanner console, int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		//Ask first question and determine a, b, c, or d
		System.out.print("Which car would you drive?   ");
		System.out.println("a) An Ice Cream Truck");
		System.out.print("b) The Batmobile ");
		System.out.print("c) cyan ");
		System.out.print("d) A Monster Truck ");
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
		else {
			System.out.println("Not a valid answer! Please answer again.");
			fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		}
		console.close();
		finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
	}
	public static void finalCount(int lollipop, int dropTheWorld, int howToLove, int sixFootSeven) {
		if (lollipop > dropTheWorld && lollipop > howToLove && lollipop > sixFootSeven) {
			System.out.println("You are 'Lollipop'!");
			System.out.println("https://www.youtube.com/watch?v=2IH8tNQAzSs");
		}
		else if (dropTheWorld > lollipop && dropTheWorld > howToLove && dropTheWorld > sixFootSeven) {
			System.out.println("You are 'Drop The World'!");
			System.out.println("https://www.youtube.com/watch?v=ErCAOMi5EGM");
		}
		else if (howToLove > lollipop && howToLove > dropTheWorld && howToLove > sixFootSeven) {
			System.out.println("You are 'How To Love'!");
			System.out.println("https://www.youtube.com/watch?v=y8Gf4-eT3w0");
		}
		else if (sixFootSeven > lollipop && sixFootSeven > dropTheWorld && sixFootSeven > howToLove) {
			System.out.println("You are 'Six Foot Seven Foot'!");
			System.out.println("https://www.youtube.com/watch?v=c7tOAGY59uQ");
		}
		else if (lollipop == dropTheWorld 
				|| lollipop == howToLove
				|| lollipop == sixFootSeven) {
			System.out.println("You are 'Money On My Mind'!");
			System.out.println("https://www.youtube.com/watch?v=4Ffu7u9gvSU");
		}
		else if (dropTheWorld == sixFootSeven 
				|| dropTheWorld == howToLove) {
			System.out.println("You are 'Stuntin' Like My Daddy (feat. Birdman)'!");
			System.out.println("https://www.youtube.com/watch?v=3EA1gh8XKGk");
		}
		else if ( howToLove == sixFootSeven) {
			System.out.println("'God Bless Amerika'!");
			System.out.println("https://www.youtube.com/watch?v=_Nb4EHY_2bI");
		}
	}
}