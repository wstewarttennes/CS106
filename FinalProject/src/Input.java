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
			teams(console);
		} else if (answer.equalsIgnoreCase("c")) {
			allNBA(console);
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
			comparePlayers();
		//player not found...
		} else {
			System.out.println("Player not found, please enter a player's name or type \"Main\" to return to the main menu.");
			String string = console.next();
			//return to the main menu
			if (string.equalsIgnoreCase("Main")) {
				input();
			//retry player name
			} else {
				players2(console, string);
			}
		}
	}
	
	public void teams(Scanner console) {
		//for the first time the players methods are run
		System.out.println("Please enter a players name, or enter \"list\" to see a full list of players.");
		String team = console.next();
		teams2(console, team);
	}

public void teams2(Scanner console, String team) {
	//list NBA teams if user types "list"
	if (team.equalsIgnoreCase("list")) {
		System.out.println("LIST NBA PLAYERS HERE");
		teams(console);
	//print stats of team
	} else if (team.equalsIgnoreCase("stef")) {
		System.out.println("print their stats");
		compareTeams();
	//team not found...
	} else {
		System.out.println("Team not found, please enter a team name or type \"Main\" to return to the main menu.");
		String string = console.next();
		//return to the main menu
		if (string.equalsIgnoreCase("Main")) {
			input();
		//retry player name
		} else {
			players2(console, string);
		}
	}
	}
	
	public void allNBA(Scanner console) {
		System.out.println("allNBA");
	}
	
	public void comparePlayers() {
		System.out.println("Would you like to compare two players?");
	}
	public void compareTeams() {
		System.out.println("Would you like to compare two teams?");
	}

}