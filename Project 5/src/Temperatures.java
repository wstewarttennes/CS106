
public class Temperatures {
	private int year;
	private int january;
	private int february;
	private int march;
	private int april;
	private int may;
	private int june;
	private int july;
	private int august;
	private int september;
	private int october;
	private int november;
	private int december;

		// TODO Auto-generated constructor stub


	public Temperatures (int intyear, int initjanuary, int initfebruary, int initmarch, int initapril, int initmay, int initjune, int initjuly, int initaugust, int initseptember, int initoctober, int initnovember, int initdecember) {
		this.year = intyear;
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
	
	public String toString() {
		return "" + this.year;
	}
}
