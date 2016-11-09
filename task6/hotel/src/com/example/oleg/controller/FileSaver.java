package com.example.oleg.controller;

<<<<<<< HEAD
import java.io.FileNotFoundException;
=======
>>>>>>> task6new
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.logging.Logger;

>>>>>>> task6new



public class FileSaver {
	private String path;
<<<<<<< HEAD
=======
	private Logger log = Logger.getLogger(FileSaver.class.getName());
>>>>>>> task6new

	public FileSaver(String path) {
		this.path = path;
	}

	
<<<<<<< HEAD
	public void sever(List<?> lists) throws FileNotFoundException, IOException{
		ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(this.path));
		
			ostream.writeObject(lists);
		
		ostream.close();
=======
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
						

		
>>>>>>> task6new
		
	}
	

}
