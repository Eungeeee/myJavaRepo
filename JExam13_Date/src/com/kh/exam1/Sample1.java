package com.kh.exam1;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Formatter;

public class Sample1 {

	public static void main(String[] args) {
		// Date 클래스
		Date today = new Date();
		System.out.println("today -> " + today);
		System.out.println("today.getTime() -> " + today.getTime());
		System.out.printf("%tY년\n", today);		System.out.printf("%tm월\n", today);
		System.out.printf("%td일\n", today);		System.out.printf("%tH시\n", today);
		System.out.printf("%tM분\n", today);		System.out.printf("%tS초\n", today);
		System.out.printf("%1$tY-%1$tm-%1$td\n", today);	// 단순 출력
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println("년 -> " + gc.get(Calendar.YEAR));
		System.out.println("월 -> " + (gc.get(Calendar.MONTH) + 1));
		System.out.println("일 -> " + gc.get(Calendar.DATE));
		System.out.println("시 -> " + gc.get(Calendar.HOUR));
		System.out.println("분 -> " + gc.get(Calendar.MINUTE));
		System.out.println("초 -> " + gc.get(Calendar.SECOND));
		
		SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd");
		System.out.println(df.format(new Date()));
		
		df = new SimpleDateFormat("HH:mm:ss");
		System.out.println(df.format(new Date()));
		
		// Formatter : 프로그램 내부적으로 활용이 가능 - 문자열로 반환시켜줌
		Formatter f = new Formatter();
		String s = f.format("%1$tY-%1$tm-%1$td", today).toString();
		System.out.println(s);
	}

}
