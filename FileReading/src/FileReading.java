import java.io.*; //for files
import java.util.*; //for scanner
/**
 * 
 * @author westonstewarttennes
 * 
 * @param checking is the amount in checking account.
 * @param savings is the amount in savings account.
 * @param creditCard is the amount on Credit Card.
 *
 * @return final variables to output file: "src/output.txt"
 */

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		//open scanner from File
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		//output to new file
		PrintStream output = new PrintStream(new File("src/output.txt")); 
		
		//define variables
		double checking = 0;
		double savings = 0;
		double creditCard = 0;
		
		//while loop
		while (fileReader.hasNextLine()) {
			
			//date is the first string in each line
			String date = fileReader.next();
			//variable is the second string in each line 
			String variable = fileReader.next();
			if (variable.equals("Credit")) {
				String extraVariable = fileReader.next();
			}
			//pluOrMinus is the third string in each line
			String plusOrMinus = fileReader.next();
			if (plusOrMinus.equals("Opening")) {
				String extraVariable2 = fileReader.next();
			}
			//value is the number at the end of each line
			double value = fileReader.nextDouble();

			//if statements
			if (variable.equals("Checking")) {
				if (plusOrMinus.equals("Withdrawal")) {
					checking -= value;
				} else if (plusOrMinus.equals("Deposit")) {
					checking += value;
				} else if (plusOrMinus.equals("Opening")) {
					checking += value;
				}
			} else if (variable.equals("Savings")) {
				if (plusOrMinus.equals("Withdrawal")) {
					savings -= value;
				} else if (plusOrMinus.equals("Deposit")) {
					savings += value;
				} else if (plusOrMinus.equals("Opening")) {
					savings += value;
				}
			} else if (variable.equals("Credit")) {
				if (plusOrMinus.equals("Withdrawal")) {
					creditCard -= value;
				} else if (plusOrMinus.equals("Deposit")) {
					creditCard += value;
				} else if (plusOrMinus.equals("Opening")) {
					creditCard += value;
				}
			}
		
		}
		//close file reader
		fileReader.close();
		
		//output variables to file
		output.println("Final checking account equals: $" + checking);
		output.println("Final savings account equals: $" + savings);
		output.println("Final credit card account equals: $" + creditCard); 
		
		//print values in console as well
		System.out.println("Final checking account equals: $" + checking);
		System.out.println("Final savings account equals: $" + savings);
		System.out.println("Final credit card account equals: $" + creditCard);
		
		//close output
		output.close();

	}


}
