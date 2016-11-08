package org.example.oleg.writer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * ввод с клавиатуры
 */
public class Writer {
	private static Logger log;
	private static final String FORMAT_DATE = "dd.MM.yyyy";
	private final SimpleDateFormat format=new SimpleDateFormat(FORMAT_DATE);
	private Scanner sc=new Scanner(System.in);
	private Object result;
	public Writer(){
				
	}
	public void numberInt(){
		result=sc.nextInt();
	}
	public void numberDouble(){
		result=sc.nextDouble();
	}
	public void date(){
		
		String a =sc.next();
		try {
			result=format.parse(a);
		} catch (ParseException e) {
			log.log(Level.SEVERE, "Exception: ", e);
			e.printStackTrace();
		}
	}
	public void string(){
		result=sc.next();
	}
	
	/**
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}
	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	/**
	 * @return the result
	 */
	public Object getResult() {
		return result;
	}

}
