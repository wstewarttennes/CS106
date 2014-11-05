import java.io.*;

/**
 * @author westonstewarttennes
 * @version 1.0
 *
 * a program that reads data from the GLOBAL Land-Ocean Temperature Index
 * 		and prints it out along with average temperature for each year (1800-2014).
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		//run class TemperatureAnalysis which creates an array from input file
		TemperatureAnalysis ta = new TemperatureAnalysis();
		//load the input file
		ta.load ("src/data.txt");
		//perform analysis on the array
		ta.analyze();
	}

}