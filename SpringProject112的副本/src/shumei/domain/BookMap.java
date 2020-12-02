package shumei.domain;

/**
 * @author chenyunbo
 *
 */
public class BookMap {
	private String isbn;
	private String bookNameString;
	private String zuozheString;
	
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBookNameString() {
		return bookNameString;
	}

	public void setBookNameString(String bookNameString) {
		this.bookNameString = bookNameString;
	}

	public String getZuozheString() {
		return zuozheString;
	}

	public void setZuozheString(String zuozheString) {
		this.zuozheString = zuozheString;
	}

	@Override
	public String toString() {
		return "BookMap [bookNameString=" + bookNameString + ", zuozheString=" + zuozheString + "]";
	}

}
