import java.awt.*;
import java.math.*;


/**
 * @author westonstewarttennes
 *
 */

	public class Practice {
	
		double value = 12.5837326282;
		int places = 3;
		public static double round(double value, int places) {
			if (places < 0) throw new IllegalArgumentException();

			BigDecimal bd = new BigDecimal(value);
			bd = bd.setScale(places, RoundingMode.HALF_UP);
			return bd.doubleValue();
		}
			
}

