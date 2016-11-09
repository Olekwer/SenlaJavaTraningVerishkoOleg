package org.example.oleg.reader;
/*
 * вывод на экран
 */
public class Reader {
	private Object text;
	public Reader(){
		
	}
	public Reader(Object text){
		this.text=text;
	}

	public void print(){
		System.out.println(this.text);
	}
	/**
	 * @return the text
	 */
	public Object getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(Object text) {
		this.text = text;
	}
	
}
