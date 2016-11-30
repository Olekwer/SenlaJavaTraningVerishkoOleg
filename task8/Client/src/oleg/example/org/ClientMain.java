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

import com.example.api.Request;
/*
 * this is Test class
 */
public class ClientMain {
	public static void main(String[] args) throws IOException {
	//	System.out.println(HttpClient.getHttp("limasol"));
		Socket socket=new Socket(InetAddress.getLocalHost(), 8071);
		@SuppressWarnings("unused")
		Request request=new Request(socket);
		Builder builder = new Builder();
		Controller controller = new Controller(builder);
		controller.start();
		
		//HttpClient httpClient=new HttpClient(socket);
	/*	ObjectOutputStream objectOutputStream=new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream inputStream=new ObjectInputStream(socket.getInputStream());

		Scanner sc=new Scanner(System.in);
		while(true){
			
			
			
			String req=sc.nextLine();
			if(req.equals("q")){
			//	break;
				objectOutputStream.close();
				inputStream.close();
			}
			objectOutputStream.writeObject(req);
			objectOutputStream.flush();
		//	objectOutputStream.close();	

			try {
				System.out.println(inputStream.readObject());
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	}

}
