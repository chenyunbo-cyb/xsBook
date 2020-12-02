package shumei.dao;

import java.util.HashMap;
import java.util.List;

import shumei.domain.Book;

public interface BookDao {

	//依据学生信息查找图书信息
	List<Book> findBookListByStd(HashMap<String, String> hashMap);
}
