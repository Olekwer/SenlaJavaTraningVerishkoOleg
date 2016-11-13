package org.example.oleg.writer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input {
	private static final String FORMAT_DATE = "dd.MM.yyyy";
	private final SimpleDateFormat format;
	private Scanner sc;

	public Input() {
		// TODO Auto-generated constructor stub
		sc=new Scanner(System.in);
		format=new SimpleDateFormat(FORMAT_DATE);
	}
	public int numberInt(){
		return sc.nextInt();
	}
	public double numberDouble(){
		return sc.nextDouble();
	}
	public Date date(){
		Date result=null;
		String a =sc.next();
		try {
		result=format.parse(a);
		} catch (ParseException e) {
			
		}
		
		return result;
	}
	public String string(){
		return sc.next();
	}
	
	
}
