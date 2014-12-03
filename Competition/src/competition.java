import java.io.*;
import java.util.*;
class competition	{
	public static void main(String args[]) throws Exception {
		Scanner console = new Scanner(System.in); 
		ArrayList<String> sing = new ArrayList<String>();
		while (console.hasNextLine()) {
			int number = console.nextInt();
			if (number == -1) {
				end(sing);
			}
			else if(isPerfectNumber(number)) {
				sing.add(number + "=" );
			} else {
				sing.add(number + "is NOT a perfect number");
			}
		}
		console.close();
		
	}

	public static boolean isPerfectNumber(int number) {
		int sum = 0;
		for(int i=1; i<=number; i++) {
			if(number%i == 0) {
				sum += i;
			}
		} 
		if(sum/2 == number) {
			return true;
		}
		return false;
	}
	public static void end(ArrayList<String> sing) {
		System.out.print("");
		System.out.print(sing);
	}
}

