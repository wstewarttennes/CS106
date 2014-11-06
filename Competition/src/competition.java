import java.util.*;
import java.text.DecimalFormat;


public class competition {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int n = console.nextInt();
		Double[] values = new Double[n];
		int i = 0;
		while (i < n) {
			values[i] = console.nextDouble();
			i++;
		}
		console.close();
		DecimalFormat df1 = new DecimalFormat("0.00");
		i = 0;
		while (i < n) {
			System.out.println("$" + df1.format(values[i]*0.8));
			i++;
		}

			//double price = console.nextDouble();
			//calculations(price);
	}
	

	//public void setRoundingMode {
	//	roundingMode = 
	//}


		
}

