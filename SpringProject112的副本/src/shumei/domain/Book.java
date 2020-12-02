package shumei.domain;

public class Book {

	private String isbn;
	private String sm;
	private String zz;
	private String cbs;
	private Float jg;
	private Integer fbl;
	private Integer kcl;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getSm() {
		return sm;
	}
	public void setSm(String sm) {
		this.sm = sm;
	}
	public String getZz() {
		return zz;
	}
	public void setZz(String zz) {
		this.zz = zz;
	}
	public String getCbs() {
		return cbs;
	}
	public void setCbs(String cbs) {
		this.cbs = cbs;
	}
	public Float getJg() {
		return jg;
	}
	public void setJg(Float jg) {
		this.jg = jg;
	}
	public Integer getFbl() {
		return fbl;
	}
	public void setFbl(Integer fbl) {
		this.fbl = fbl;
	}
	public Integer getKcl() {
		return kcl;
	}
	public void setKcl(Integer kcl) {
		this.kcl = kcl;
	}
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", sm=" + sm + ", zz=" + zz + ", cbs=" + cbs + ", jg=" + jg + ", fbl=" + fbl
				+ ", kcl=" + kcl + "]";
	}
	
	
	
}
