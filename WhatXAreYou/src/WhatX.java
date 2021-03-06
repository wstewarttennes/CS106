/**
 * 
 */
import java.util.*;

/**
 * A program to determine which 'lil Wayne song you most identify with!
 * 
 * @author westonstewarttennes
 *
 * @param lollipop
 *            are characteristics that identify with the song "Lollipop"
 * @param dropTheWorld
 *            are characteristics that identify with the song "Drop the World"
 * @param howToLove
 *            are characteristics that identify with the song "How to Love"
 * @param sixFootSeven
 *            are characteristics that identify with the song "Six Foot Seven Foot"
 * 
 * @return What 'Lil Wayne song you most identify with!
 * 
 * @DISCLAIMER: I DONT ACTUALLY SUPPORT 'LIL WAYNE.
 */
public class WhatX {

	public static void main(String[] args) {

		// define variables
		int lollipop = 0;
		int dropTheWorld = 0;
		int howToLove = 0;
		int sixFootSeven = 0;

		// open scanner
		Scanner console = new Scanner(System.in);

		// describe program to user
		System.out.println("Which 'Lil Wayne song are you?");
		System.out.println("Please answer questions with a, b, c, or d!");
		System.out.println("***Included links may lead to explicit content***");
		System.out.println();

		// ask first question
		firstQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		//close console
		console.close();
	}

	public static void firstQuestion(Scanner console, int lollipop,
			int dropTheWorld, int howToLove, int sixFootSeven) {
		// Ask first question and determine a, b, c, or d
		System.out.println("What is your favorite colour?   ");
		System.out.print("a) all colours! ");
		System.out.print("b) black ");
		System.out.print("c) pink ");
		System.out.print("d) blue ");
		System.out.println();
		String color = console.next();

		//add onto counting variables
		if (color.equals("a")) {
			lollipop++;
			//send information to secondQuestion
			secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("b")) {
			dropTheWorld++;
			//send information to secondQuestion
			secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("c")) {
			howToLove++;
			//send information to secondQuestion
			secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("d")) {
			sixFootSeven++;
			//send information to secondQuestion
			secondQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else {
			System.out.println("Not a valid answer! Please answer again.");
			firstQuestion(console, lollipop, dropTheWorld, howToLove,
					sixFootSeven);
		}


	}

	public static void secondQuestion(Scanner console, int lollipop,
			int dropTheWorld, int howToLove, int sixFootSeven) {
		// Ask second question and determine a, b, c, or d
		System.out.println("Who would you rather take to prom?   ");
		System.out.print("a) Katy Perry ");
		System.out.print("b) Marilyn Manson ");
		System.out.print("c) Kim Kardashian ");
		System.out.print("d) Dennis Rodman ");
		System.out.println();
		String color = console.next();

		//add onto counting variables
		if (color.equals("a")) {
			lollipop++;
			//send information to thirdQuestion
			thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("b")) {
			dropTheWorld++;
			//send information to thirdQuestion
			thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("c")) {
			howToLove++;
			//send information to thirdQuestion
			thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("d")) {
			sixFootSeven++;
			//send information to thirdQuestion
			thirdQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else {
			System.out.println("Not a valid answer! Please answer again.");
			secondQuestion(console, lollipop, dropTheWorld, howToLove,
					sixFootSeven);
		}
	}

	public static void thirdQuestion(Scanner console, int lollipop,
			int dropTheWorld, int howToLove, int sixFootSeven) {
		// Ask third question and determine a, b, c, or d
		System.out.println("What's your favorite candy?   ");
		System.out.print("a) Lollipops. ");
		System.out.print("b) I hate the world. ");
		System.out.print("c) I looooveee candy! ");
		System.out.print("d) Very tall candy. ");
		System.out.println();
		String color = console.next();

		//add onto counting variables
		if (color.equals("a")) {
			lollipop++;
			//send information to fourthQuestion
			fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("b")) {
			dropTheWorld++;
			//send information to fourthQuestion
			fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("c")) {
			howToLove++;
			//send information to fourthQuestion
			fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("d")) {
			sixFootSeven++;
			//send information to fourthQuestion
			fourthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else {
			System.out.println("Not a valid answer! Please answer again.");
			thirdQuestion(console, lollipop, dropTheWorld, howToLove,
					sixFootSeven);
		}
	}

	public static void fourthQuestion(Scanner console, int lollipop,
			int dropTheWorld, int howToLove, int sixFootSeven) {
		// Ask fourth question and determine a, b, c, or d
		System.out.println("Who is your favorite rapper?   ");
		System.out.print("a) Lil Wayne ");
		System.out.print("b) Eminem ");
		System.out.print("c) Yung Lean ");
		System.out.print("d) Mos Def ");
		System.out.println();
		String color = console.next();

		//add onto counting variables
		if (color.equals("a")) {
			lollipop++;
			//send information to fifthQuestion
			fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("b")) {
			dropTheWorld++;
			//send information to fifthQuestion
			fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("c")) {
			howToLove++;
			//send information to fifthQuestion
			fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("d")) {
			sixFootSeven++;
			//send information to fifthQuestion
			fifthQuestion(console, lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else {
			System.out.println("Not a valid answer! Please answer again.");
			fourthQuestion(console, lollipop, dropTheWorld, howToLove,
					sixFootSeven);
		}
	}

	public static void fifthQuestion(Scanner console, int lollipop,
			int dropTheWorld, int howToLove, int sixFootSeven) {
		// Ask fifth question and determine a, b, c, or d
		System.out.println("Which car would you drive?   ");
		System.out.print("a) An Ice Cream Truck");
		System.out.print("b) The Batmobile ");
		System.out.print("c) LoverCar ");
		System.out.print("d) A Monster Truck ");
		System.out.println();
		String color = console.next();

		//add onto counting variables
		if (color.equals("a")) {
			lollipop++;
			//send information to finalCount
			finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("b")) {
			dropTheWorld++;
			//send information to finalCount
			finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("c")) {
			howToLove++;
			//send information to finalCount
			finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else if (color.equals("d")) {
			sixFootSeven++;
			//send information to finalCount
			finalCount(lollipop, dropTheWorld, howToLove, sixFootSeven);
		} else {
			System.out.println("Not a valid answer! Please answer again.");
			fifthQuestion(console, lollipop, dropTheWorld, howToLove,
					sixFootSeven);
		}
	}

	public static void finalCount(int lollipop, int dropTheWorld,
			int howToLove, int sixFootSeven) {
		//lollipop
		if (lollipop > dropTheWorld && lollipop > howToLove
				&& lollipop > sixFootSeven) {
			System.out.println("You are 'Lollipop'!");
			System.out.println("https://www.youtube.com/watch?v=2IH8tNQAzSs");
	
		//drop the world
		} else if (dropTheWorld > lollipop && dropTheWorld > howToLove
				&& dropTheWorld > sixFootSeven) {
			System.out.println("You are 'Drop The World'!");
			System.out.println("https://www.youtube.com/watch?v=ErCAOMi5EGM");
			
		//how to love
		} else if (howToLove > lollipop && howToLove > dropTheWorld
				&& howToLove > sixFootSeven) {
			System.out.println("You are 'How To Love'!");
			System.out.println("https://www.youtube.com/watch?v=y8Gf4-eT3w0");
			
		//six foot seven
		} else if (sixFootSeven > lollipop && sixFootSeven > dropTheWorld
				&& sixFootSeven > howToLove) {
			System.out.println("You are 'Six Foot Seven Foot'!");
			System.out.println("https://www.youtube.com/watch?v=c7tOAGY59uQ");
		
		//equal lollipop and others
		} else if (lollipop == dropTheWorld || lollipop == howToLove
				|| lollipop == sixFootSeven) {
			System.out.println("You are 'Money On My Mind'!");
			System.out.println("https://www.youtube.com/watch?v=4Ffu7u9gvSU");
			
		//equal drop the world and others
		} else if (dropTheWorld == sixFootSeven || dropTheWorld == howToLove) {
			System.out
					.println("You are 'Stuntin' Like My Daddy (feat. Birdman)'!");
			System.out.println("https://www.youtube.com/watch?v=3EA1gh8XKGk");
			
		//equal how to love and six foot seven
		} else if (howToLove == sixFootSeven) {
			System.out.println("'God Bless Amerika'!");
			System.out.println("https://www.youtube.com/watch?v=_Nb4EHY_2bI");
		}
	}
}