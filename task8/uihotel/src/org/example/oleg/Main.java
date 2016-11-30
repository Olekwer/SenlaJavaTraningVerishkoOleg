package org.example.oleg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.text.ParseException;
import org.example.oleg.builder.Builder;
import org.example.oleg.controller.Controller;

import com.example.api.Request;


public class Main {
	/**
	 * @param args
	 * @throws ParseException
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws IOException {
		Socket socket=new Socket(InetAddress.getLocalHost(), 8071);
		@SuppressWarnings("unused")
		Request request=new Request(socket);
		Builder builder = new Builder();
		Controller controller = new Controller(builder);
		controller.start();
		
		

	}

}
