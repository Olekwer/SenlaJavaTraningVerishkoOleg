package com.example.oleg.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Logger;




public class FileSaver {
	private String path;
	private Logger log = Logger.getLogger(FileSaver.class.getName());

	public FileSaver(String path) {
		this.path = path;
	}

	
	public void sever(List<?> lists) throws IOException {
		ObjectOutputStream ostream=null;
		try {
			ostream = new ObjectOutputStream(new FileOutputStream(this.path));
		
			ostream.writeObject(lists);
		} catch (IOException e) {
			
		}
		finally{
			ostream.close();
		}
						

		
		
	}
	

}
