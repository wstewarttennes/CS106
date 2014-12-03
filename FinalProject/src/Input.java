import java.util.*;

public class Input {
	public void input() {
		Scanner console = new Scanner(System.in);
	
		//Introduce program
		System.out.println("Welcome to the NBA Statistical Database!");
		System.out.println("Enter 'A' to sort by individual player.");
		System.out.println("Enter 'B' to sort by team.");
		System.out.println("Or enter 'C' to sort by all NBA");
		
		String answer = console.next();
		
		if (answer.equalsIgnoreCase("a")) {
			players(console);
		} else if (answer.equalsIgnoreCase("b")) {
			teams();
		} else if (answer.equalsIgnoreCase("c")) {
			allNBA();
		} else {
			System.out.println("Please enter a valid letter!");
			input();
		}
		console.close();
	}

	public void players(Scanner console) {
			//for the first time the players methods are run
			System.out.println("Please enter a players name, or enter \"list\" to see a full list of players.");
			String player = console.next();
			players2(console, player);
	}
	
	public void players2(Scanner console, String player) {
		//list NBA players if user types "list"
		if (player.equalsIgnoreCase("list")) {
			System.out.println("LIST NBA PLAYERS HERE");
			players(console);
		//print stats of individual nba players
		} else if (player.equalsIgnoreCase("stef")) {
			System.out.println("print their stats");
		//player not found...
		} else {
			System.out.println("Player not found, please enter a player's name or type \"Main\" for the main menu.");
			String string = console.next();
			//return to the main menu
			if (string.equalsIgnoreCase("Main")) {
				input();
			//retry player name
			} else {
				string.equalsIgnoreCase(player);
				players2(console, player);
			}
		}
	}
	
	public void teams() {
		System.out.println("Please enter a team name, or enter \"list\" to see a full list of teams.");
	}
	
	public void allNBA() {
		System.out.println("allNBA");
	}
	

}
