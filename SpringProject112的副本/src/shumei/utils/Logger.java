package shumei.utils;

public class Logger {

	public void beforePrintLog(){
		System.out.println("所有方法之前都需要打印本日志！");
	}
	
	public void afterPrintLog(){
		System.out.println("所有方法之后都需要打印本日志！");
	}
	
	public void exceptionPrintLog(){
		System.out.println("出现异常后需要打印本日志！");
	}
	
	public void finalPrintLog(){
		System.out.println("所有方法执行完才需要打印本日志！");
	}
}
