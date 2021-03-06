/**
 * an object for one line of array allYears[] 
 * stores year and temperatures for each month
 * @param year the year each month corresponds to
 * @param january 	the temperature change in 0.01 degree Celsius in january
 * @param february 	the temperature change in 0.01 degree Celsius in february
 * @param march 	etc.
 */
public class Temperatures {
	public int year;
	public int january;
	public int february;
	public int march;
	public int april;
	public int may;
	public int june;
	public int july;
	public int august;
	public int september;
	public int october;
	public int november;
	public int december;

	/** 
	 * 
	 * @param inityear 		initial year value.
	 * @param initjanuary	initial january temperature value.
	 * @param initfebruary	initial february temperature value.
	 * @param initmarch		initial march temperature value.
	 * @param initapril		initial april temperature value.
	 * @param initmay		initial may temperature value.
	 * @param initjune		initial june temperature value.
	 * @param initjuly		initial july temperature value.
	 * @param initaugust	initial august temperature value.
	 * @param initseptember	initial september temperature value.
	 * @param initoctober	initial october temperature value.
	 * @param initnovember	initial november temperature value.
	 * @param initdecember	initial december temperature value.
	 */
	public Temperatures (int inityear, int initjanuary, int initfebruary, int initmarch, int initapril, int initmay, int initjune, int initjuly, int initaugust, int initseptember, int initoctober, int initnovember, int initdecember) {
		this.year = inityear;
		this.january = initjanuary;
		this.february = initfebruary;
		this.march = initmarch;
		this.april = initapril;
		this.may = initmay;
		this.june = initjune;
		this.july = initjuly;
		this.august = initaugust;
		this.september = initseptember;
		this.october = initoctober;
		this.november = initnovember;
		this.december = initdecember;
		
	}	
	
	/** a method to find average temperature.
	 * @return the average temperature per year
	 */
	public double getAverages() {
		return ((double)this.january + (double)this.february + (double)this.march + (double)this.april + (double)this.may + (double)this.june + (double)this.july + (double)this.august + (double)this.september + (double)this.october + (double)this.november + (double)this.december)/1200;
		
	}
	
	/**a method to print out array.
	 * @return year along with temperature values for each month
	 */
	public String toString() {
		return this.year + "\t" + this.january + "\t" + this.february + "\t" + this.march + "\t" + this.april + "\t" + this.may + "\t" + this.june + "\t" + this.july + "\t" + this.august + "\t" + this.september + "\t" + this.october + "\t" + this.november + "\t" + this.december;
	}


}
