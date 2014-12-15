import java.util.*;

public class Input {
	public void input(TreeSet<String> allTeams, TreeSet<String> Players) {
		Scanner console = new Scanner(System.in);

		//Introduce program
		System.out.println("Welcome to the NBA Statistical Database!");
		System.out.println("Enter 'A' to sort by individual player.");
		System.out.println("Enter 'B' to sort by team.");
		System.out.println("Or enter 'C' to see all NBA statistics");
		String answer = console.nextLine();
		
		//user wants to sort by individual players
		if (answer.equalsIgnoreCase("a")) {
			players(console, allTeams, Players);
			
		//user wants to sort by teams
		} else if (answer.equalsIgnoreCase("b")) {
			teams(console, allTeams, Players);
		
		//user wants to see allNBA statistics
		} else if (answer.equalsIgnoreCase("c")) {
			allNBA(console, allTeams, Players);
		
		//user did not enter a valid letter!
		} else {
			System.out.println("Please enter a valid letter!");
			input(allTeams, Players);
		}
		
		console.close();
	}
	
	//ask to enter a player's name or print list of all players
	public void players(Scanner console, TreeSet<String> allTeams, TreeSet<String> Players) {
		
		//for the first time the players methods are run
		System.out.println("Please enter a players name, or enter \"list\" to see a full alphabetical list of players.");
		String player = console.nextLine();
		players2(console, player, allTeams, Players);
	}
	//new method here so that if user inputs invalid player, the question is not asked twice
	public void players2(Scanner console, String player, TreeSet<String> allTeams, TreeSet<String> Players) {
		
		//list NBA players if user types "list"
		if (player.equalsIgnoreCase("list")) {
			System.out.println(Players);
			System.out.println("");
			players(console, allTeams, Players);
			
		//print stats of individual nba players
		} else if (Players.contains(player.toLowerCase())) {
			Players p = new Players();
			p.load("src/data.csv", player);
			System.out.println("");
			comparePlayers(console, allTeams, Players);
			
		//player not found...
		} else {
			System.out.println("Player not found, please enter a player's name, \"list\", or \"Main\" to return to the main menu.");
			String string = console.nextLine();
			
			//return to the main menu
			if (string.equalsIgnoreCase("Main")) {
				input(allTeams, Players);
			
			//retry player name
			} else {
				players2(console, string, allTeams, Players);
			}
		}
	}
	//ask to enter a team's name or print list of all teams
	public void teams(Scanner console, TreeSet<String> allTeams, TreeSet<String> Players) {
		
		//for the first time the players methods are run
		System.out.println("Please enter a team's city (e.x. boston), or enter \"list\" to see a full alphabetical list of inputs.");
		String team = console.nextLine();
		teams2(console, team, allTeams, Players);
	}
	
	//new method here so that if user inputs invalid team, the question is not asked twice
	public void teams2(Scanner console, String team, TreeSet<String> allTeams, TreeSet<String> Players) {
		
		//list NBA teams if user types "list"
		if (team.equalsIgnoreCase("list")) {
			System.out.println(allTeams);
			System.out.println("");
			teams(console, allTeams, Players);
			
		//print stats of team
		} else if (allTeams.contains(team.toLowerCase())) {
			
			//go to Teams class to print out stats of that team
			Teams t = new Teams();
			t.load("src/data.csv", team.toLowerCase());
			System.out.println("");
			
			//go to compare method
			compareTeams(console, allTeams, Players);
			
		//team not found...
		} else {
			System.out.println("Team not found, please enter a team name, \"list\", or \"Main\" to return to the main menu.");
			String string = console.nextLine();
			
			//return to the main menu
			if (string.equalsIgnoreCase("Main")) {
				input(allTeams, Players);
			
			//retry player name
			} else {
				teams2(console, string, allTeams, Players);
			}
		}
	}
	
	//print stats of allNBA
	public void allNBA(Scanner console, TreeSet<String> allTeams, TreeSet<String> Players ) {
		allNBA n = new allNBA();
		n.load("src/data.csv");
		System.out.println("");
		input(allTeams, Players);
	}
	
	//lets the user type in another player to compare the two stat lines
	public void comparePlayers(Scanner console, TreeSet<String> allTeams, TreeSet<String> Players) {
		System.out.println("Type in another player to compare stats, type \"list\" to see a list of all players, or type \"Main\" to return to the main menu.");
		String i = console.nextLine();
		
		//return to the main menu
		if (i.equalsIgnoreCase("Main")) {
			input(allTeams, Players);
		
		//retry player name
		} else {
			players2(console, i, allTeams, Players);
		}
	}
	
	//lets user type in another team to compare the two stat lines
	public void compareTeams(Scanner console, TreeSet<String> allTeams, TreeSet<String> Players) {
		System.out.println("Type in another team to compare stats, type \"list\" to see a list of all teams, or type \"Main\" to return to the main menu.");
		String i = console.nextLine();
		
		//return to the main menu
		if (i.equalsIgnoreCase("Main")) {
			input(allTeams, Players);
				
		//retry player name
		} else {
			teams2(console, i, allTeams, Players);
		}
	}

}
