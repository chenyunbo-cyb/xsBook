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
		System.out.println(new Date()+"所有方法之前都需要打印本日志！");
	}
	
	@AfterReturning("pc()")
	public void afterPrintLog(){
		System.out.println("所有方法之后都需要打印本日志！");
	}
	
	@AfterThrowing("pc()")
	public void exceptionPrintLog(){
		System.out.println("出现异常后需要打印本日志！");
	}
	
	@After("pc()")
	public void finalPrintLog(){
		System.out.println("所有方法执行完才需要打印本日志！");
	}
}
