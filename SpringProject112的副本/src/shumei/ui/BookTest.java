package shumei.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import shumei.dao.StdBookDao;
import shumei.dao.impl.StdBookDaoImpl;
import shumei.dao.impl.StdBookDaoImpl1;
import shumei.domain.Book;
import shumei.service.impl.BookServiceimpl;


//import shumei.dao.StudentDao;
//
//import shumei.dao.impl.StudentDaoImpl;
//import shumei.dao.impl.StudentDaoImpl1;
//import shumei.domain.Student;
//import shumei.service.StudentService;
//import shumei.service.impl.StudentServiceimpl;
//import shumei.service.impl.StudentServiceimpl1;




public class BookTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
//		// TODO Auto-generated method stub
//		//9.9
//		StudentService serviceimpl = (StudentService) Class.forName("shumei.service.impl.StudentServiceimpl").newInstance();
////		StudentServiceimpl serviceimpl = new StudentServiceimpl();
//		serviceimpl.addStudent();
//        
		//9.14  立即加载思想
		
		//11.2
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//		StudentDaoImpl1 studentDaoImpl1=(StudentDaoImpl1) aContext.getBean("studentDao");
//		Student student=new Student();
//		student.setJszh("110");
//		student.setXm("范跑跑");
//		studentDaoImpl1.addStudent(student);
		
		///////////////2020/11/16///////////////////////////////////////////////////////////////
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//		StdBookDaoImpl1 stdBookDaoImpl1 = (StdBookDaoImpl1) aContext.getBean("bookDao");
//		stdBookDaoImpl1.findBookBySm();
		

		


		
	
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//		BookServiceimpl bookServiceimpl=(BookServiceimpl) aContext.getBean("book");
//		StdBookDaoImpl bookDao=(StdBookDaoImpl) aContext.getBean("bkDao");
//		
		Scanner scanner = new Scanner(System.in);
	        if (scanner.hasNextInt()) {
	            int str1 = scanner.nextInt();
	            	System.out.println("Input:" + str1);	        	        	
					if(str1==1){
						// 依据isbn来查询，要求通过传参的方式
						StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
						Book book= stdBookDaoImpl1.findBookByIsbnParam("8-111-06359-7");
						System.out.println(book);
						}	
					if(str1==2) {
						//依据书名来查询，要求通过传参的方式
						StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
						Book book = stdBookDaoImpl1.findBookBySmParam("计算机网络教程");
						System.out.println(book);
					}
					
					if(str1==3) {
						//依据书名查询带有Web的图书模糊查询，要求通过传参的方式
						StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
						List<Book> bookList = stdBookDaoImpl1.findBookByLikeSm("");
						System.out.println(bookList);
						System.out.println("查找了所有的图书信息!");
						
					}
					if (str1==4) {
						//添加图书
		        		StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
		        		Book book = new Book();
		        		book.setIsbn("123");
		        		book.setSm("yibenshu");
		        		book.setZz("Wo");
		        		stdBookDaoImpl1.addBook(book);
		        		}
					if (str1==5) {					
	            		StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
	            		Book book = stdBookDaoImpl1.findBookByIsbnParam("123");
	            		book.setSm("hahaha");
	            		//Book book = new Book();
	            		//book.setIsbn("7-111-06359-7");
	            		//book.setSm("更新操作");
	            		stdBookDaoImpl1.updateBook(book);
	            	}

					if(str1==6) {
						StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
						stdBookDaoImpl1.deleteBook("123");
					}	
					
					if(str1==7) {
						//使用Mybatis实现xsbook库中带有“小”字的学生借阅过图书的功能
						StdBookDaoImpl1 stdBookDaoImpl1 = new StdBookDaoImpl1();
						List<Book> bookList = stdBookDaoImpl1.findJyls("小");
						System.out.println(bookList);
						System.out.println("查找了所有的带有“小”字的学生借阅过的图书!");
					
					}
					    scanner.close();
        }
		
		
///////////////////////////////////////////////////////////////////////////////////////		
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//		BookServiceimpl bookServiceimpl=(BookServiceimpl) aContext.getBean("book");
//		StdBookDaoImpl bookDao=(StdBookDaoImpl) aContext.getBean("bkDao");
//		
//		Scanner scanner = new Scanner(System.in);
//	        if (scanner.hasNextInt()) {
//	            int str1 = scanner.nextInt();
//	            	System.out.println("Input:" + str1);
//	            	if (str1==1) {					
//						Book book=new Book();
//		        		book.setIsbn("01");
//		        		book.setSm("pp");
//		        		book.setZz("qq");
//		        		book.setCbs("qq");
//		        		bookServiceimpl.addBook(book);
//	            	}
//		        	if (str1==2) {
//						Book book1=new Book();
//		        		book1.setIsbn("01");
//		        		book1.setSm("qq");
//		        		book1.setZz("qq");
//		        		book1.setCbs("qq");
//		        		bookServiceimpl.updateBook(book1);
//		        		}
//					if(str1==3){
//						bookServiceimpl.deleteBook("01");}
//						
//					if(str1==4) {
//						List bookList =bookDao.findAllBook("计算机网络教程");
//		        		System.out.println(bookList);
//		        		System.out.println("查找了所有的图书信息!");
//					}
//	        
//					    scanner.close();
//        }
   ///////////////////////////////////////////////////////////////////////////////         	

//	        
		        		
		          

	        
	       	
//		StudentService studentService=(StudentService) aContext.getBean("ss1");
//		studentService.addStudent();
		//studentService.deleteStudent();
		//studentService.updateStudent(110);
		//studentService.updateStudent(110);
		//studentService.updateStudent();
//        StudentServiceimpl1 stdImpl=(StudentServiceimpl1)aContext.getBean("studentServiceimpl1");
//        StudentServiceimpl1 stdImpl2=(StudentServiceimpl1)aContext.getBean("studentServiceimpl1");
//      //  stdImpl.addStudent();
//        System.out.print(stdImpl==stdImpl2);
        
		//9.21 延迟加载思想
//		Resource resource=new ClassPathResource("bean.xml");
//		BeanFactory beanFactory =new XmlBeanFactory(resource);
//		StudentServiceimpl serviceimpl =(StudentServiceimpl) beanFactory.getBean("stdService");
//		serviceimpl.addStudent();
		
		
		
		//静态工厂创建
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//        StudentServiceimpl stdImpl=(StudentServiceimpl)aContext.getBean("staticService");
//        stdImpl.addStudent();
		
		//实例工厂创建
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//        StudentServiceimpl stdImpl=(StudentServiceimpl)aContext.getBean("insService");
//        stdImpl.addStudent();
        
		//9.23 初始化方法  销毁方法 
//		ClassPathXmlApplicationContext aContext = new ClassPathXmlApplicationContext("bean.xml");
//        StudentServiceimpl stdImpl=(StudentServiceimpl)aContext.getBean("stdService");
//        stdImpl.addStudent();
//        aContext.close();
        
	}
}


