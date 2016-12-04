package com.example.api;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import org.apache.log4j.Logger;

import com.example.oleg.base.DataBase;

public class SendRequest {
	private static Logger log = Logger.getLogger(DataBase.class);

	public static Object send(Request request, Socket socket){
		Object response=null;
		try {
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
			objectOutputStream.writeObject(request);
			objectOutputStream.flush();

			ObjectInputStream inputStream=new ObjectInputStream(socket.getInputStream());
			
			response= inputStream.readObject();
		} catch (Exception e) {
			log.info(e);
		}		
		return response;
	}
}
