import java.io.*;

/**
 * @author westonstewarttennes
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		TemperatureAnalysis ta = new TemperatureAnalysis();
		ta.load ("src/data.txt");
		ta.analyze();
	}

}
