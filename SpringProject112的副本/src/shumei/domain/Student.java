package shumei.domain;

public class Student {

	private String jszh;
	private String xm;
	private String zym;
	private char xb;
	int jss;
	
	
	public String getJszh() {
		return jszh;
	}
	public void setJszh(String jszh) {
		this.jszh = jszh;
	}
	public String getXm() {
		return xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getZym() {
		return zym;
	}
	public void setZym(String zym) {
		this.zym = zym;
	}
	public char getXb() {
		return xb;
	}
	public void setXb(char xb) {
		this.xb = xb;
	}
	public int getJss() {
		return jss;
	}
	public void setJss(int jss) {
		this.jss = jss;
	}
	@Override
	public String toString() {
		return "Student [jszh=" + jszh + ", xm=" + xm + ", zym=" + zym + ", xb=" + xb + ", jss=" + jss + "]";
	}
	
	
	
}
