import java.io.*;

/**
 * @author westonstewarttennes
 * @version 1.0
 *
 * a program that reads data from the GLOBAL Land-Ocean Temperature Index
 * 		and prints it out along with average temperature for each year (1800-2014).
 * 
 * 
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		TemperatureAnalysis ta = new TemperatureAnalysis();
		ta.load ("src/data.txt");
		ta.analyze();
	}

}