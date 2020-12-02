package shumei.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import shumei.dao.StdBookDao;
import shumei.dao.impl.StdBookDaoImpl;
import shumei.domain.Book;
import shumei.service.BookService;


//@Scope("prototype")
@Service("book")
public class BookServiceimpl implements BookService {


	@Autowired
	private StdBookDaoImpl bkImpl;
//	private StdBookDao bkDao;
//	
//	public StdBookDao getbkImpl() {
//		return bkDao;
//	}
//	
//	public void setbkImpl(StdBookDao bkImpl) {
//		this.bkDao = bkDao;
//	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		bkImpl.addBook(book);
	}




	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		bkImpl.deleteBook(isbn);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bkImpl.updateBook(book);
	}

	@Override
	public void findAllBook(String sm) {
		// TODO Auto-generated method stub
		bkImpl.findAllBook(sm);
	}

}
