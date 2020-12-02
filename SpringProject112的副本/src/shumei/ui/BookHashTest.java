package shumei.ui;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import shumei.dao.BookDao;
import shumei.domain.Book;

public class BookHashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			BookDao bookDao = sqlSession.getMapper(BookDao.class);
			HashMap<String, String> hashMap = new HashMap<String, String>();
			hashMap.put("xm", "Àî");
			hashMap.put("majorName","¼ÆËã»ú");
			List<Book> books = bookDao.findBookListByStd(hashMap);
			System.out.print(books);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
