/**
 * 
 * @author westonstewarttennes
 * 
 * A program that reads in NBA statistics and lets users sort by players and teams and compare statistics.
 * @param savings is the amount in savings account.
 * @param creditCard is the amount on Credit Card.
 *
 * @return final variables to output file: "src/output.txt"
 */
public class Main {
	public static void main(String[] args) {
		
		//reads in the stat data from specified source and then runs the Input class which controls user input
		read r = new read();
		r.load("src/data.csv");
	}
}