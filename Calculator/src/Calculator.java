
public class Calculator {
	public static void main(String[] args) {
		
		//display at bats, hits, and average
		average();
		
		//display walks, HBP, sacrifice, and on-base percentage
		onbasepercent();
	}
	public static void average() {
		//variables
		int atbats;
		int hits;
		double average;
			
		//calculate average
		atbats = 92;
		hits = 31;
		average = (double)hits/(double)atbats;
		
		//print the at bats
		System.out.print("At Bats: ");
		System.out.println(atbats);
		
		//print the hits
		System.out.print("Hits: ");
		System.out.println(hits);
		
		//print the average
		System.out.print("Your player's Average is: ");
		System.out.println(average);
		
	}
	public static void onbasepercent() {
		
		//variables
		int atbats;
		int hits;
		int walks;
		int hitbypitch;
		int sacrificeflies;
		double onbase;
			
		//calculate on base percentage
		walks = 2;
		hitbypitch = 1;
		sacrificeflies = 4;
		hits = 31;
		atbats = 92;
		onbase = ((double)walks + (double)hitbypitch + (double)hits) / ((double)atbats + (double)walks + (double)hitbypitch + (double)sacrificeflies);
			
		//print hit by pitch
		System.out.print("Hit by Pitch: ");
		System.out.println(hitbypitch);
				
		//print walks
		System.out.print("Walks: ");
		System.out.println(walks);
				
		//print sacrifice flies
		System.out.print("Sacrifice Flies: ");
		System.out.println(sacrificeflies);
				
		//print onbase
		System.out.print("Your player's On-Base Percentage is: ");
		System.out.print(onbase);
	}
}
