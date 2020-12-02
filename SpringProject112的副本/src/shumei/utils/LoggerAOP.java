package shumei.utils;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.sun.org.apache.bcel.internal.generic.NEW;

@Component("logger")
@Aspect
public class LoggerAOP {

	@Pointcut("execution(* *..impl.StudentServiceimpl1.*(..))")
	private void pc(){}
	
	@Before("pc()")
	public void beforePrintLog(){
		System.out.println(new Date()+"���з���֮ǰ����Ҫ��ӡ����־��");
	}
	
	@AfterReturning("pc()")
	public void afterPrintLog(){
		System.out.println("���з���֮����Ҫ��ӡ����־��");
	}
	
	@AfterThrowing("pc()")
	public void exceptionPrintLog(){
		System.out.println("�����쳣����Ҫ��ӡ����־��");
	}
	
	@After("pc()")
	public void finalPrintLog(){
		System.out.println("���з���ִ�������Ҫ��ӡ����־��");
	}
}
