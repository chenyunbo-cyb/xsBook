package shumei.dao;

import java.util.HashMap;
import java.util.List;

import shumei.domain.Book;

public interface BookDao {

	//����ѧ����Ϣ����ͼ����Ϣ
	List<Book> findBookListByStd(HashMap<String, String> hashMap);
}
