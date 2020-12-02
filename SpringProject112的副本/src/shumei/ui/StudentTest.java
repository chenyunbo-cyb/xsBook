package shumei.ui;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import shumei.dao.StudentDao;
import shumei.dao.impl.StdBookDaoImpl1;
import shumei.domain.Book;
import shumei.query.ZHQuery;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
//		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//		SqlSession sqlSession = sessionFactory.openSession();
//		StudentDao studentDao = sqlSession.getMapper(StudentDao.class);
//		List<Student> students = StudentDao.findAllBook();
//		sqlSession.commit();
//		sqlSession.close();
		
		
		//12.2
		StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
		ZHQuery zhQuery = new ZHQuery();
		Book book = new Book();
		book.setSm("Web");
	}

}
