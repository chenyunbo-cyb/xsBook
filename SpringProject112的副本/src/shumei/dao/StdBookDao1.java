package shumei.dao;

import java.util.List;

import shumei.domain.Book;

public interface StdBookDao1 {

	void findBookBySm();
	Book findBookBySmParam(String sm);
	List<Book> findBookByLikeSm(String sm);
	
	List<Book> findJyls(String xm);
	
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(String isbn);
	Book findBookByIsbnParam(String isbn);
}
