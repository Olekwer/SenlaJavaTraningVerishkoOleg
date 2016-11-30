package com.example.api;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Request {
	private static Socket socket;
	public Request(Socket socket) {
		// TODO Auto-generated constructor stub
		Request.socket=socket;
	}
	public static String send(Object header){
		String response=null;
		try {
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream inputStream=new ObjectInputStream(socket.getInputStream());
			
			objectOutputStream.writeObject(header);
			objectOutputStream.flush();
			response=(String) inputStream.readObject();
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return response;
		
	}
}
