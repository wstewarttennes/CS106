
import java.util.*;

public class InputScanner {
	public static void main(String[] args) {
		
		// scanner input
		Scanner console = new Scanner(System.in);
		System.out.print("Today is your birthday. How old are you?");
		
		//input age
		int age = console.nextInt();

		//print You are ____ days old!
		System.out.println();
		System.out.print("You are ");
		System.out.print(daysOld(age));
		System.out.print(" days old!");
		
		console.close();
	}
	public static int daysOld(int age) {
		
		//calculates days old
		return age * 365;
		

	}
}
