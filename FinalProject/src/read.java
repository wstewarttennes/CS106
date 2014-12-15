import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;
/** 
 * the purpose of this class is to read input and sort in lists 
 */
public class read {
	public ArrayList<Player> allPlayers;
	public TreeSet<String> allTeams;
	public TreeSet<String> Players;
	/** 
	 * the purpose of this method is to define lists where players and teams and all things are sorted
	 * @param allPlayers is an array list of all Players and their statistics
	 * @param allTeams is an array list of all Teams
	 * @param Players is an array list of all Players
	 */
	public read() {
		this.allPlayers = new ArrayList<Player>();
		this.allTeams = new TreeSet<String>();
		this.Players = new TreeSet<String>();
	}
	/** 
	 * this method reads the input from a .csv file
	 */
	//CSV read and parse code from http://javarevisited.blogspot.com/2012/07/read-file-line-by-line-java-example-scanner.html
	public void load(String filepath) {
			
		//String csvFile is the data file
		String csvFile = filepath;
		
		//read data file by commas (CSV file)
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		
		try {
		
			br = new BufferedReader(new FileReader(csvFile));
			br.readLine();
			br.readLine();
			br.readLine();
			br.readLine();
			while ((line = br.readLine()) != null) {
 
				// use comma as separator
				String [] player = line.split(cvsSplitBy);
				
				
				// print out player and team name, 
				//System.out.println(player[0] + "\t" + "\t" + "\t" + player[1]);
			
	
				String name = player[0];
				String team = player[1];
				String minutes = player[2];
				String fg = player[3];
				String fga = player[4];
				String threep = player[5];
				String threepa = player[6];
				String ft = player[7];
				String fta = player[8];
				String or = player[9];
				String dr = player[10];
				String tot = player[11];
				String a = player[12];
				String pf = player[13];
				String st = player[14];
				String to = player[15];
				String bl = player[16];
				String pts = player[17];
			
				allPlayers.add( new Player(name, team, minutes, fg, fga, threep, threepa, ft, fta, or, dr, tot, a, pf, st, to, bl, pts));
				allTeams.add(player[1]);
				Players.add(player[0]);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//send list of all players and all teams to input class/method
		Input i = new Input();
		i.input(allTeams, Players);

	}

}
