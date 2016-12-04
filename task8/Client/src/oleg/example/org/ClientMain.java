package oleg.example.org;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.example.oleg.builder.Builder;
import org.example.oleg.controller.Controller;
import org.example.oleg.headersoket.HeaderSoket;

import com.example.api.Request;
/*
 * this is Test class
 */
public class ClientMain {
	public static void main(String[] args) throws IOException {
	//	System.out.println(HttpClient.getHttp("limasol"));
		Socket socket=new Socket(InetAddress.getLocalHost(), 8071);
		@SuppressWarnings("unused")
		Builder builder = new Builder();
		Controller controller = new Controller(builder);
		HeaderSoket headerSoket= new HeaderSoket(socket);
		controller.start();		
	}

}
