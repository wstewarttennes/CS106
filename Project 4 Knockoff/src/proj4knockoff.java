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

public class proj4knockoff {

	public static void main(String[] args) throws FileNotFoundException {
		
		//open scanner from File
		Scanner fileReader = new Scanner(new File("src/input.txt"));
		//output to new file
		PrintStream output = new PrintStream(new File("src/output.txt")); 
		
		//define variables
		double checking = 0;
		double savings = 0;
		double creditCard = 0;
		int lines = 0;
		int counter = 0;
		
		while (fileReader.hasNextLine()) {
			lines ++;
			fileReader.nextLine();
		}
		fileReader.close();
		
		fileReader = new Scanner(new File("src/input.txt"));
		
		String[] dates = new String[lines];
		String[] accounts = new String[lines];
		String[] transactions = new String[lines];
		double[] amounts = new double[lines];
		
		//while loop
		while (fileReader.hasNextLine()) {
			
			//date is the first string in each line
			String date = fileReader.next();
			dates[counter] = date;
			//variable is the second string in each line 
			String variable = fileReader.next();
			
			if (variable.equals("Credit")) {
				String extraVariable = fileReader.next();
				accounts[counter] = variable + " Card";
			} else {
				accounts[counter] = variable;
			}
			//pluOrMinus is the third string in each line
			String plusOrMinus = fileReader.next();
			
			if (plusOrMinus.equals("Opening")) {
				String extraVariable2 = fileReader.next();
				transactions[counter] = plusOrMinus + " Balance";
			} else {
				transactions[counter] = plusOrMinus;
			}
			//value is the number at the end of each line
			double value = fileReader.nextDouble();
			amounts[counter] = value;

			counter ++;
		}		
		//close file reader
		fileReader.close();
		
		//reopen scanner
		fileReader = new Scanner(new File("src/input.txt"));
		
		while (fileReader.hasNextLine()) {
			if (accounts[counter].equals("Checking")) {
				if (transactions[counter].equals("Opening")) {
					checking += amounts[counter];
				} else if (transactions[counter].equals("Withdrawal")) {
					checking -= amounts[counter];
				} else if (transactions[counter].equals("Deposit")) {
					checking += amounts[counter];
				}
			}
			if (accounts[counter].equals("Savings")) {
				if (transactions[counter].equals("Opening")) {
					savings += amounts[counter];
				} else if (transactions[counter].equals("Withdrawal")) {
					savings -= amounts[counter];
				} else if (transactions[counter].equals("Deposit")) {
					savings += amounts[counter];
				}
			}
			if (accounts[counter].equals("Credit")) {
				if (transactions[counter].equals("Opening")) {
					creditCard += amounts[counter];
				} else if (transactions[counter].equals("Withdrawal")) {
					creditCard -= amounts[counter];
				} else if (transactions[counter].equals("Deposit")) {
					creditCard += amounts[counter];
				}
			}
		}

		for (int i=0; i<accounts.length; i++) {
			System.out.println(dates[i] + "\t\t" + accounts[i] + "\t\t" + transactions[i] + "\t\t" + amounts[i]);
		}
		
		//output variables to file
		output.println("Final checking account equals: $" + checking);
		output.println("Final savings account equals: $" + savings);
		output.println("Final credit card account equals: $" + creditCard); 
		
		//print values in console as well
		System.out.println("");
		System.out.println("Final checking account equals: $" + checking);
		System.out.println("Final savings account equals: $" + savings);
		System.out.println("Final credit card account equals: $" + creditCard);

		//close output
		output.close();

	}


}
