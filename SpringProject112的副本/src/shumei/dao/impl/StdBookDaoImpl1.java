package shumei.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import shumei.dao.StdBookDao1;
import shumei.domain.Book;
import shumei.domain.Student;
import shumei.query.ZHQuery;

@Repository("bookDao")
public class StdBookDaoImpl1 implements StdBookDao1 {

	@Override
	public void findBookBySm() {
		// TODO Auto-generated method stub
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			Book book = sqlSession.selectOne("Book.findBookBySm");
			System.out.println(book);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	


	@Override
	public Book findBookBySmParam(String sm) {
		// TODO Auto-generated method stub
		Book bk =null;
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			Book book = sqlSession.selectOne("Book.findBookBySm",sm);
			bk=book;
			//或者直接如下这样改造：
			//bk = sqlSession.selectOne("Book.findBookBySm",sm);
			//System.out.println(book);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bk;
	}



	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		int addFlag = 0;
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);//创建会话工厂
			//创建一个会话
			SqlSession sqlSession = sessionFactory.openSession();
			
			//sqlSession.insert("Book.insertBook", book);
			addFlag = sqlSession.insert("Book.insertBook", book);
			sqlSession.commit();
			sqlSession.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("添加标志:"+addFlag);
		
	}



	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		int updateFlag = 0;
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			updateFlag = sqlSession.update("Book.updateBook", book);			
			sqlSession.commit();
			sqlSession.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("更新标志："+updateFlag);
		
	}



	@Override
	public Book findBookByIsbnParam(String isbn) {
		// TODO Auto-generated method stub
		Book bk =null;
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			//或者直接如下这样改造：
			bk = sqlSession.selectOne("Book.findBookByIsbnParam",isbn);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bk;
	}




	@Override
	public List findBookByLikeSm(String sm) {
		// TODO Auto-generated method stub
		InputStream inputStream;
		List<Book> books =null;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			books = sqlSession.selectList("Book.findBookByLikeSm",sm);
			//System.out.println(books.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;	
	}




	@Override
	public void deleteBook(String isbn) {
		// TODO Auto-generated method stub
		int updateFlag = 0;
		try {
			InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			updateFlag = sqlSession.delete("Book.deleteBook", isbn);			
			sqlSession.commit();
			sqlSession.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("删除标志："+updateFlag);
		
	}




	@Override
	public List findJyls(String xm) {
		// TODO Auto-generated method stub
		InputStream inputStream;
		List<Book> books =null;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			books = sqlSession.selectList("Book.findJyls",xm);
			//System.out.println(books.size());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;	
	}

	public java.util.List<Student> findStudentByQuery() {
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sessionFactory.openSession();
			ZHQuery zhQuery = new ZHQuery();
			Student student = new Student();
			
			
			Book book = new Book();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	
	

	



}
