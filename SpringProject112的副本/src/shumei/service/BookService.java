package shumei.service;

import java.util.List;

import shumei.domain.Book;

public interface BookService {
	
	void addBook(Book book);
	void deleteBook(String isbn);
	void updateBook(Book book);
	void findAllBook(String sm);

}
