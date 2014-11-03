import java.io.*;

/**
 * @author westonstewarttennes
 *
 * @param a program that reads data from the GLOBAL Land-Ocean Temperature Index
 * 			and prints it out as well as the average temperature each year
 *@TemperatureAnalysis ta is the
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		TemperatureAnalysis ta = new TemperatureAnalysis();
		ta.load ("src/data.txt");
		ta.analyze();
	}

}