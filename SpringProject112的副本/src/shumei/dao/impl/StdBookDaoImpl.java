package shumei.dao.impl;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import shumei.dao.StdBookDao;
import shumei.domain.Book;


@Repository("bkDao")
public class StdBookDaoImpl implements StdBookDao {

	@Autowired
	private  JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into book(isbn,sm,zz,cbs) values(?,?,?,?)"
				,book.getIsbn(),book.getSm(),book.getZz(),book.getCbs());

        System.out.println("增加了图书信息!");
	}

	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("delete from book where isbn = ? ", isbn);
//		String sql="delete from user where isbn=?";
//		jdbcTemplate.update(sql,11);
        System.out.println("删除了图书信息!");
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("update book set sm=?,zz=?,cbs=? where isbn=?",book.getSm(),book.getZz(),book.getCbs(),book.getIsbn());

        System.out.println("修改了图书信息!");
	}

	@Override
	public List findAllBook(String sm) {
		// TODO Auto-generated method stub
		List<Book> books=jdbcTemplate.query("select * from book where sm=?", new BeanPropertyRowMapper<Book>(Book.class), sm);
		//return books.isEmpty()?null:books.get(0);
		return books;
		 //  System.out.println("查找了所有的图书信息!");
	}
		

	

}
