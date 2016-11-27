package org.example.oleg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import org.example.oleg.builder.Builder;
import org.example.oleg.controller.Controller;


public class Main {
	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {

		Builder builder = new Builder();
		Controller controller = new Controller(builder);
		controller.start();
		
		

	}

}
