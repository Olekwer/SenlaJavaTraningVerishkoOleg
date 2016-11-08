package com.example.oleg.controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;



public class FileSaver {
	private String path;

	public FileSaver(String path) {
		this.path = path;
	}

	
	public void sever(List<?> lists) throws FileNotFoundException, IOException{
		ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(this.path));
		
			ostream.writeObject(lists);
		
		ostream.close();
		
	}
	

}
