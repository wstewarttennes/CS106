import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Players {

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
				
				player[0].toLowerCase();

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
