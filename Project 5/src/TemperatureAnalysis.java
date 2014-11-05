import java.io.*;
import java.util.*;
/**
 * 
 *
 */
public class TemperatureAnalysis {
	
	public Temperatures[] allYears;

	
	public void load(String filePath) throws FileNotFoundException {

		File f = new File(filePath);
		
		int lines = 0;
		Scanner fileReader = new Scanner(f);

		fileReader.nextLine();
		fileReader.nextLine();
		fileReader.nextLine();
		while (fileReader.hasNextLine()) {
			fileReader.nextLine();
			lines ++;
		}
		fileReader.close();

		this.allYears = new Temperatures[lines];

		int i = 0;
		fileReader = new Scanner(f);
		fileReader.nextLine();
		fileReader.nextLine();
		fileReader.nextLine();

		//a while method that reads in 
		while (fileReader.hasNext()) {
			int year = fileReader.nextInt();
			int january = fileReader.nextInt();
			int february = fileReader.nextInt();
			int march = fileReader.nextInt();
			int april = fileReader.nextInt();
			int may = fileReader.nextInt();
			int june = fileReader.nextInt();
			int july = fileReader.nextInt();
			int august = fileReader.nextInt();
			int september = fileReader.nextInt();
			int october = fileReader.nextInt();
			int november = fileReader.nextInt();
			int december = fileReader.nextInt();

			allYears[i] = new Temperatures(year, january, february, march, april, may, june, july, august, september, october, november, december);
			i++;
			
		}
		fileReader.close();
	}
	/** a method to analyze data and print it out along with average data each year */
	public void analyze() {
		int a =1800;
		for (Temperatures t : this.allYears) {
			System.out.println("Year" + "\t" + "Jan" + "\t" + "Feb" + "\t" + "Mar" + "\t" + "Apr" + "\t" + "May" + "\t" + "Jun" + "\t" + "Jul" + "\t" + "Aug" + "\t" + "Sep" + "\t" + "Oct" + "\t" + "Nov" + "\t" + "Dec" + "\t");
			System.out.println(t);
			
			System.out.println("The average ∆ in temperature for " + a + " was " + t.getAverages() + " degrees C.");
			a++;
		}

	}

	


}



