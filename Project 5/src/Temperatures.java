
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

	public double getAverages() {
		return ((double)this.january + (double)this.february + (double)this.march + (double)this.april + (double)this.may + (double)this.june + (double)this.july + (double)this.august + (double)this.september + (double)this.october + (double)this.november + (double)this.december)/1200;
		
	}
	

	public String toString() {
		return this.year + "\t" + this.january + "\t" + this.february + "\t" + this.march + "\t" + this.april + "\t" + this.may + "\t" + this.june + "\t" + this.july + "\t" + this.august + "\t" + this.september + "\t" + this.october + "\t" + this.november + "\t" + this.december;
	}


}