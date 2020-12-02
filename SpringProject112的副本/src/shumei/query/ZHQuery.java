package shumei.query;

import shumei.dao.StudentDao;
import shumei.domain.Book;
import shumei.domain.Student;

public class ZHQuery {
	
//	private String sXM;
//	private String bSm;
	
	private Student student;
	private Book book;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	

}
