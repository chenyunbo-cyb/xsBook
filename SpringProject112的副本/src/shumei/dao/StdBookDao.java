package shumei.dao;

import java.util.List;

import shumei.domain.Book;

public interface StdBookDao {

	void addBook(Book book);
	void deleteBook(String isbn);
	void updateBook(Book book);
	List findAllBook(String sm);

}
