package shumei.ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

class BookJunitTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("jdbc.xml");
	JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);
	
	
	@Test
	public void testUpdate() {
		
		
	}
	
	
	
	


}
