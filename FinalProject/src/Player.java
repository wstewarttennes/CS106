
public class Player {
	public String name;
	public String team;
	public String minutes;
	public String fg;
	public String fga;
	public String threep;
	public String threepa;
	public String ft;
	public String fta;
	public String or;
	public String dr;
	public String tot;
	public String a;
	public String pf;
	public String st;
	public String to;
	public String bl;
	public String pts;
	
	public Player (String initname, String initteam, String initminutes, String initfg, String initfga, String initthreep, String initthreepa, String initft, String initfta, String initor, String initdr, String inittot, String inita, String initpf, String initst, String initto, String initbl, String initpts) {
		this.name = initname; 
		this.team = initteam;
		this.minutes = initminutes;
		this.fg = initfg;
		this.fga = initfga;
		this.threep = initthreep;
		this.threepa = initthreepa;
		this.ft = initft;
		this.fta = initfta;
		this.or = initor;
		this.dr = initdr;
		this.tot = inittot;
		this.a = inita;
		this.pf = initpf;
		this.st = initst;
		this.to = initto;
		this.bl = initbl;
		this.pts = initpts;

	}
	
	public String toString() {
		return this.name + this.team + this.minutes + this.fg + this.fga + this.threep + this.threepa + this.ft + this.fta + this.or + this.dr + this.tot + this.a +this.pf + this.st + this.to + this.bl + this.pts;
	}
}
