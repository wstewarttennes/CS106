import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * the purpose of this class is to print out statistics of a player specified by the user 
 */
public class Players {
	/**
	 * 
	 * @param filepath is the filepath of the data file
	 * @param playerName is the player's name input passed in from the Input method
	 */
	//CSV read and parse code from http://javarevisited.blogspot.com/2012/07/read-file-line-by-line-java-example-scanner.html
	public void load(String filepath, String playerName) {
		System.out.println("Player" + "\t" + "\t" + "\t" + "Minutes" + "\t" + "FG" + "\t" + "FGA" + "\t" + "3P" + "\t" + "3PA" + "\t" + "FT" + "\t" + "FTA" + "\t" + "OR" + "\t" + "DR" + "\t" + "TOT" + "\t" + "A" + "\t" + "PF" + "\t" + "ST" + "\t" + "TO" + "\t" + "BL" + "\t" + "PTS");

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
				
				//print out specified player stats
				if (player[0].equals(playerName.toLowerCase())) {
					System.out.println(name + "\t" + "\t" + minutes + "\t" + fg + "\t" + fga + "\t" + threep + "\t" + threepa + "\t" + ft + "\t" + fta + "\t" + or + "\t" + dr + "\t" + tot + "\t" + a + "\t" + pf + "\t" + st + "\t" + to + "\t" + bl + "\t" + pts);
				}
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
	}
}