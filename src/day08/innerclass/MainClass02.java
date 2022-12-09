package day08.innerclass;

import day08.mypac.MyUtil;
import day08.mypac.MyUtil.Calculator;


public class MainClass02 {
	public static void main(String[] args) {
		//MyUtill 클래스 안에 있는 HelloPrinter 클래스 객체 생성
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		
		hp.printHello();
		
		MyUtil.HelloPrinter hp2 = new MyUtil().new HelloPrinter();
		
		hp2.printHello();
		
		
		//static 내부 클래스 생성 및 호출
		MyUtil.Calculator c = new MyUtil.Calculator();
		c.calc(10, 20);
	}
	
	
}
