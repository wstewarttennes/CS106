import java.io.File;
import java.util.*;




/**
 * @author westonstewarttennes
 *
 */
public class Practice {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(counter(x));
		
	}


	public static int counter(int x) {
		if (x > 1) {

			return x + counter(x-1);
			
		}
		return 1;
	}
}